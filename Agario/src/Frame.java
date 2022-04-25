

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


	
	Background 	b = new Background(0, 0);
	BGMain mainM = new BGMain(0,0);//main menu
	Hat hat = new Hat(350,280);
	//create music
	
	static String start = "Press SPACE to start";
	static String controls = "*Click for Controls*";
	
	static String movement = "";
	static String movement1 ="";
	static String movement2 ="";
	static String movement3 = "";
	static String movement4 = "";
	static String obj = "Objective:";
	static String obj2 = "Collect as many dots as you can";
	static String obj3 = "Watch out for ememies!";
	
	
	
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		//b.paint(g);
		b.paint(g);
		mainM.paint(g);
		hat.paint(g);
		
		Font f1 = new Font(Font.MONOSPACED, Font.BOLD, 24);
		g.setFont(f1);
		g.setColor(Color.red);
		g.drawString(start +"", 380, 830 );
		
		Font f2 = new Font(Font.MONOSPACED, Font.BOLD, 30);
		g.setFont(f2);
		g.setColor(Color.red);
		g.drawString(controls +"", 347, 665 );
		
		Font f3 = new Font(Font.MONOSPACED, Font.BOLD, 25);
		g.setFont(f3);
		g.setColor(Color.PINK);
		g.drawString(movement +"", 750, 250 );
		
		Font f3p1 = new Font(Font.MONOSPACED, Font.BOLD, 15);
		g.setFont(f3p1);
		g.setColor(Color.pink);
		g.drawString(movement1 +"", 770, 280 );
	
		Font f3p2 = new Font(Font.MONOSPACED, Font.BOLD, 15);
		g.setFont(f3p2);
		g.setColor(Color.pink);
		g.drawString(movement2 +"", 770, 300 );
		
		Font f3p3 = new Font(Font.MONOSPACED, Font.BOLD, 15);
		g.setFont(f3p3);
		g.setColor(Color.pink);
		g.drawString(movement3 +"", 770, 312 );
		
		Font f3p4 = new Font(Font.MONOSPACED, Font.BOLD, 15);
		g.setFont(f3p4);
		g.setColor(Color.pink);
		g.drawString(movement4 +"", 770, 332 );
		
		Font f4 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f4);
		g.setColor(Color.magenta);
		g.drawString(obj +"", 20, 250 );
		
		Font f4p1 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f4p1);
		g.setColor(Color.magenta);
		g.drawString(obj2 +"", 25, 280 );
		
		Font f4p2 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f4p2);
		g.setColor(Color.MAGENTA);
		g.drawString(obj3 +"", 25, 310 );

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
		if(arg0.getButton()==1) {
			movement = "Movement:";
			movement1 = "Move with arrow keys";
			movement2 = "Press key multiple times to";
			movement3 = "increase speed";
			movement4 = "Diagonal movement possible!";
		}
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
		
		if(arg0.getKeyCode()==32) {
			mainM.y = 10000;
			mainM.x = 10000;
			hat.x = 450;
			hat.y = 400;
			hat.length = 1;
			hat.width = 1;
			start = "";
			controls = "";
			movement = "";
			movement1 = "";
			movement2 = "";
			movement3 = "";
			movement4 = "";
			obj = "";
			obj2 = "";
			obj3 = "";
		}
		if(arg0.getKeyCode()>32) {
		if(arg0.getKeyCode()==37) {
			hat.vx += 0;
			hat.vy += 0;
			hat.moveL();
			
		}
		
		if(arg0.getKeyCode()==38) {
			hat.vy += 0;
			hat.vx += 0;
			hat.moveU();
			
		}
		if(arg0.getKeyCode()==39) {
			hat.vx += 0;
			hat.vy += 0;
			hat.moveR();
			
		}
		if(arg0.getKeyCode()==40) {
			hat.vy += 0;
			hat.vx += 0;
			hat.moveD();
			
		}
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
