

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	

	static int p1Score = 0;


	
	
	BGMain mainM = new BGMain(0,0);
	Background 	b = new Background(0, 0);
	Hat hat = new Hat(0,0);
	//create music
	
	
	
	
	
	
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		//b.paint(g);
		mainM.paint(g);
		hat.paint(g);
		
	}
	
	
	
	
	public static void score () {
		
		p1Score ++;
		
	}
	
	public static void startDisplay () {
		
		
		
	}
	
	
public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	
	public Frame() {
		JFrame f = new JFrame("Flappy Bird");
		f.setSize(new Dimension(1050, 1000));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override   
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getButton());
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
		if(arg0.getKeyCode()==37) {
			hat.vx = 0;
			hat.vy = 0;
			hat.moveL();
			
		}
		if(arg0.getKeyCode()==38) {
			hat.vy = 0;
			hat.vx = 0;
			hat.moveU();
			
		}
		if(arg0.getKeyCode()==39) {
			hat.vx = 0;
			hat.vy = 0;
			hat.moveR();
			
		}
		if(arg0.getKeyCode()==40) {
			hat.vy = 0;
			hat.vx = 0;
			hat.moveD();
			
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
