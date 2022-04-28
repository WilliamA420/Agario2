

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
	BGGameOver gameOver = new BGGameOver(100,0);
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
	static String obj4 = "Don't let Strength go ";
	static String obj5 = "below zero";
	
	static String collect = "Item Values:";
	static String c2 = "Red = -3";
	static String c3 = "Yellow = 3 ";
	static String c4 = "Green = 4 ";
	static String c5 = "Blue = 5 ";
	static String c6 = "Purple = 6 ";
	static String c7 = "Flower = 20 ";
	static String c8 = "Enemies = -1 per sec";
	
	static String score = "";
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		/*if(score < 0){
			mainM moves away
			objects disappear
		}*/
		//b.paint(g);
		gameOver.paint(g);
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
		g.drawString(movement +"", 710, 250 );
		
		Font f3p1 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f3p1);
		g.setColor(Color.pink);
		g.drawString(movement1 +"", 730, 280 );
	
		Font f3p2 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f3p2);
		g.setColor(Color.pink);
		g.drawString(movement2 +"", 730, 300 );
		
		Font f3p3 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f3p3);
		g.setColor(Color.pink);
		g.drawString(movement3 +"", 730, 315 );
		
		Font f3p4 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f3p4);
		g.setColor(Color.pink);
		g.drawString(movement4 +"", 730, 335 );
		
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

		Font f4p3 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f4p3);
		g.setColor(Color.MAGENTA);
		g.drawString(obj4 +"", 25, 340 );
		
		Font f4p4 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f4p4);
		g.setColor(Color.MAGENTA);
		g.drawString(obj5 +"", 25, 355 );
		
		Font f5 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5);
		g.setColor(Color.orange);
		g.drawString(collect +"", 20, 380 );
		
		Font f5p1 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p1);
		g.setColor(Color.red);
		g.drawString(c2 +"", 30, 400 );
		
		Font f5p2 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p2);
		g.setColor(Color.yellow);
		g.drawString(c3 +"", 30, 420 );
		
		Font f5p3 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p3);
		g.setColor(Color.green);
		g.drawString(c4 +"", 30, 440 );
		
		Font f5p4 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p4);
		g.setColor(Color.cyan);
		g.drawString(c5 +"", 30, 460 );
		
		Font f5p5 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p5);
		g.setColor(Color.magenta);
		g.drawString(c6 +"", 30, 480 );
		
		Font f5p6 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p6);
		g.setColor(Color.pink);
		g.drawString(c7 +"", 30, 500 );
		
		Font f5p7 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f5p7);
		g.setColor(Color.gray);
		g.drawString(c8 +"", 30, 520 );
		
		Font f6 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f6);
		g.setColor(Color.orange);
		g.drawString(score +"", 20, 30 );
	}
	
	
	
	
	public static void score () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
		
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
			movement2 = "Press key multiple times";
			movement3 = "to increase speed";
			movement4 = "Diagonal movement works!";
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
			hat.vy= 0;
			hat.vx= 0;
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
			obj4 = "";
			obj5 = "";
			collect = "";
			c2 = "";
			c3 = "";
			c4 = "";
			c5 = "";
			c6 = "";
			c7 = "";
			c8 = "";
			score = "Strength:";
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
