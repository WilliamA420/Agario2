

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
	
	public Color scoreCol = Color.black;
	
	public int hatX = 350;
	public int hatY = 280;
	public boolean wasClicked = false;
	public int dead = 0;
	public int dead1 = 0;
	public int dead2= 0;
	public int dead3 = 0;
	public int dead4 = 0;
	public int dead5 = 0;
	Blue[] B = new Blue[20];//20
	Red[] r = new Red[60];//80
	Yellow[] Y = new Yellow[40];//40
	Green[] G = new Green[30];//30
	Purple[] P = new Purple[20];//20
	Flower[] F = new Flower[5];//5
	ai a = new ai(200,200);
	
	Background 	b = new Background(0, 0);
	BGMain mainM = new BGMain(0 ,0);//main menu
	BGGameOver gameOver = new BGGameOver(0,-150);
	Hat hat = new Hat(hatX,hatY);
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
	
	static String changeC = "Press A or D to change character:";
	
	static String ResetText = "";
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		/*if(score < 0){
			mainM moves away
			objects disappear
		}*/
		
			
			
		
		
		b.paint(g);
		mainM.paint(g);
		
		a.score = p1Score;
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
		
		
		Font f7 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f7);
		g.setColor(Color.orange);
		g.drawString(changeC +"", 310, 220 );
		
		Font f8 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f8);
		g.setColor(scoreCol);
		g.drawString(p1Score +"", 130, 31 );
		
	
		
		
		for(int i =0; i < r.length;i++) {
			if(r[i].gameStatus == true) {
			r[i].paint(g);
			}
			
		}
		if(r[10].gameStatus == true) {
			a.paint(g);
		}
		for(int i =0; i < Y.length;i++) {
			if(Y[i].gameStatus == true) {
			Y[i].paint(g);
			}
			
		}
		for(int i =0; i < G.length;i++) {
			if(G[i].gameStatus == true) {
			G[i].paint(g);
			}	
			
		}
		for(int i =0; i < P.length;i++) {
			if(P[i].gameStatus == true) {
			P[i].paint(g);
			}	
			
		}
		for(int i =0; i < F.length;i++) {
			if(F[i].gameStatus == true) {
			F[i].paint(g);
			}	
			
		}	
		for(int i =0; i < B.length;i++) {
			if(B[i].gameStatus == true) {
			B[i].paint(g);
			}	
		}


for(int i =0; i < r.length;i++) {
			
			if(r[i].gameStatus == true) {
			r[i].paint(g);
			if(Math.abs(hat.x - r[i].x) < 32) {
				if(Math.abs(hat.y - r[i].y) <32){
					r[i].pointStatus = true;
					scoreRed();
					dead++;
					if(dead >= 2) {
						for(int l =0; l<r.length; l++) {
							if(r[l].pointStatus == true) {
							r[l].purge = false;
							}
							}
					}
					
				}
			else if(Math.abs(r[i].x - hat.x) < 32) {
					if(Math.abs(r[i].y - hat.y) <32){
						r[i].pointStatus = true;
						scoreRed();
						dead++;
						if(dead >=2) {
							for(int l =0; l<r.length; l++) {
								if(r[l].pointStatus == true) {
								r[l].purge = false;
								}
								}
						}
					}
					
				}	
				
			}
			}
		}
		
		
		for(int i =0; i < Y.length;i++) {
			
			if(Y[i].gameStatus == true) {
			Y[i].paint(g);
			if(Math.abs(hat.x - Y[i].x) < 32) {
				if(Math.abs(hat.y - Y[i].y) <32){
					Y[i].pointStatus = true;
					scoreYellow();
					dead++;
					if(dead >= 2) {
						for(int l =0; l<Y.length; l++) {
							if(Y[l].pointStatus == true) {
							Y[l].purge = false;
							}
							}
					}

					
				}
			else if(Math.abs(Y[i].x - hat.x) < 32) {
					if(Math.abs(Y[i].y - hat.y) <32){
						Y[i].pointStatus = true;
						scoreYellow();
						dead++;
						if(dead >= 2) {
							for(int l =0; l<Y.length; l++) {
								if(Y[l].pointStatus == true) {
								Y[l].purge = false;
								}
								}
						}
					}
					
				}	
				
			}
			}
		}
		
		
		
		for(int i =0; i < G.length;i++) {
			
			if(G[i].gameStatus == true) {
			G[i].paint(g);
			if(Math.abs(hat.x - G[i].x) < 32) {
				if(Math.abs(hat.y - G[i].y) <32){
					G[i].pointStatus = true;
					scoreGreen();
					dead++;
					if(dead >= 2) {
						for(int l =0; l<G.length; l++) {
							if(G[l].pointStatus == true) {
							G[l].purge = false;
							}
							}
					}
					
				}
			else if(Math.abs(G[i].x - hat.x) < 32) {
					if(Math.abs(G[i].y - hat.y) <32){
						G[i].pointStatus = true;
						scoreGreen();
						dead++;
						if(dead >= 2) {
							for(int l =0; l<G.length; l++) {
								if(G[l].pointStatus == true) {
								G[l].purge = false;
								}
								}
						}
					}
					
				}	
				
			}
			}
		}
		
		
		
		for(int i =0; i < P.length;i++) {
			
			if(P[i].gameStatus == true) {
			P[i].paint(g);
			if(Math.abs(hat.x - P[i].x) < 32) {
				if(Math.abs(hat.y - P[i].y) <32){
					P[i].pointStatus = true;
					scorePurple();
					dead++;
					if(dead >= 2) {
						for(int l =0; l<P.length; l++) {
							if(P[l].pointStatus == true) {
							P[l].purge = false;
							}
							}
					}
					
					
				}
			else if(Math.abs(P[i].x - hat.x) < 32) {
					if(Math.abs(P[i].y - hat.y) <32){
						P[i].pointStatus = true;
						scorePurple();
						
						dead++;
						if(dead >= 2) {
							for(int l =0; l<P.length; l++) {
								if(P[l].pointStatus == true) {
								P[l].purge = false;
								}
								}
						}
					}
					
				}	
				
			}
			}
		}
		
		
		
		for(int i =0; i < F.length;i++) {
			
			if(F[i].gameStatus == true) {
			F[i].paint(g);
			if(Math.abs(hat.x+30 - F[i].x) < 32) {
				if(Math.abs(hat.y - F[i].y) <32){
					F[i].pointStatus = true;
					scoreFlower();
					
					dead++;
					if(dead >= 2) {
						for(int l =0; l<F.length; l++) {
							if(F[l].pointStatus == true) {
							F[l].purge = false;
							}
							}
					}
					
				}
			else if(Math.abs(F[i].x+150 - hat.x) < 32) {
					if(Math.abs(F[i].y - hat.y) <32){
						F[i].pointStatus = true;
						scoreFlower();
						dead++;
						if(dead >= 2) {
							for(int l =0; l<F.length; l++) {
								if(F[l].pointStatus == true) {
								F[l].purge = false;
								}
								}
						}
					}
					
				}
				
				
			}
			}
		}
		
		
for(int i =0; i < B.length;i++) {
			
			if(B[i].gameStatus == true) {
			B[i].paint(g);
			if(Math.abs(hat.x - B[i].x) < 32) {
				if(Math.abs(hat.y - B[i].y) <32){
					B[i].pointStatus = true;
					scoreBlue();
					dead++;
					if(dead >= 2) {
						for(int l =0; l<B.length; l++) {
							if(B[l].pointStatus == true) {
							B[l].purge = false;
							}
							}
					}
					
				}
			else if(Math.abs(B[i].x - hat.x) < 32) {
					if(Math.abs(B[i].y - hat.y) <32){
						B[i].pointStatus = true;
						scoreBlue();
						if(dead >= 2) {
							for(int l =0; l<B.length; l++) {
								if(B[l].pointStatus == true) {
								B[l].purge = false;
								}
								}
						}
					}
					
			}
			
		}
		}
	}

	
	
	if(Math.abs(hat.x+ - a.x) < 60) {
		if(Math.abs(hat.y - a.y) <60){
			
			hit();
			}
			
		}
	else if(Math.abs(a.x - hat.x) < 60) {
			if(Math.abs(a.y - hat.y) <60){
				hit();
				}
			}
			
	
	





		
		if(p1Score < 0) {
		gameOver.paint(g);
		a.level = 1;
		a.score = 0;
		}
		
		hat.paint(g);

	

		//strength, has to be on top
		Font f6 = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(f6);
		g.setColor(Color.orange);
		g.drawString(score +"", 20, 30);
		
				if(p1Score < 0) {
					b.x = 10000;
					b.y = 10000;
					hat.x = 450;
					hat.y = 430;
					hat.vx = 0;
					//move points off screen
				}
		if(hat.isTrue == 0) {
			for(int i = 0; i< r.length; i++) {
				// if hat hits point red from anywhere on point x or point x + points width 
					
				
			}
		}
		if(p1Score < 0) {
			ResetText = "Close Game to Reset";
		}
		Font f9 = new Font(Font.MONOSPACED, Font.BOLD, 50);
		g.setFont(f9);
		g.setColor(Color.yellow);
		g.drawString(ResetText +"", 220, 900 );
		
	}
	
	
	
	
	public static void scoreRed () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
		
		p1Score -=3;
		
	}
	public static void scoreYellow () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
		
		p1Score +=1;
		
	}
	public static void scoreGreen () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
	
		p1Score +=2;
	
	}
	public static void scoreBlue () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
	
		p1Score +=3;
	
	}
	public static void scorePurple () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
		
		p1Score +=5;
		
	}
	public static void scoreFlower () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
		
		p1Score +=10;
		
	}
	public static void scoreEnemy () { // MAKE ONE FOR EACH POINT VALUE(re -3, blu +3 Etc)
		
		p1Score --;
		
	}
	
	public void hit() {
		
		p1Score -= a.sub;
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
		
for(int i =0; i < r.length; i++) {
			
			int x = (int)(Math.random() * 890) + 10;
			
			int y =(int)(Math.random() * 890) + 10;
			
			r[i] = new Red(x,y);

		}
	for(int i =0; i < Y.length; i++) {
			
			int x = (int)(Math.random() * 890) + 10;
			
			int y =(int)(Math.random() * 890) + 10;
			
			Y[i] = new Yellow(x,y);

		}
	for(int i =0; i < G.length; i++) {
		
		int x = (int)(Math.random() * 890) + 10;
		
		int y =(int)(Math.random() * 890) + 10;
		
		G[i] = new Green(x,y);

	}
	for(int i =0; i < P.length; i++) {
		
		int x = (int)(Math.random() * 890) + 10;
		
		int y =(int)(Math.random() * 890) + 10;
		
		P[i] = new Purple(x,y);

	}
	for(int i =0; i < F.length; i++) {
		
		int x = (int)(Math.random() * 890) + 10;
		
		int y =(int)(Math.random() * 890) + 10;
		
		F[i] = new Flower(x,y);

	}
for(int i =0; i < B.length; i++) {
		
		int x = (int)(Math.random() * 890) + 10;
		
		int y =(int)(Math.random() * 890) + 10;
		
		B[i] = new Blue(x,y);

	}





	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(wasClicked != true) {
		if(arg0.getButton()==1) {
			movement = "Movement:";
			movement1 = "Move with arrow keys";
			movement2 = "Press key multiple times";
			movement3 = "to increase speed";
			movement4 = "Diagonal movement works!";
		}
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
		if(wasClicked != true) {
		if(arg0.getKeyCode()==68) {
			if( hat.isTrue <13){
			hat.isTrue ++;
			//checks what image is selected
			if(hat.isTrue ==0) {
				hat.x = 350;
				hat.y = 280;
			}
			else if(hat.isTrue == 1) {
				hat.x = 380;
				hat.y = 265;
			}
			else if(hat.isTrue == 2) {
				hat.x = 405;
				hat.y = 265;
			}
			else if(hat.isTrue == 3) {
				hat.x = 390;
				hat.y = 265;
			}
			else if(hat.isTrue == 4) {
				hat.x = 390;
				hat.y = 255;
			}
			else if(hat.isTrue == 5) {
				hat.x = 380;
				hat.y = 280;
			}
			else if(hat.isTrue == 6) {
				hat.x = 380;
				hat.y = 270;
			}
			else if(hat.isTrue == 7) {
				hat.x = 380;
				hat.y = 270;
			}
			else if(hat.isTrue == 8) {
				hat.x = 380;
				hat.y = 280;
			}
			else if(hat.isTrue == 9) {
				hat.x = 390;
				hat.y = 270;
			}
			else if(hat.isTrue == 10) {
				hat.x = 380;
				hat.y = 270;
			}
			else if(hat.isTrue == 11) {
				hat.x = 380;
				hat.y = 250;
			}
			else if(hat.isTrue == 12) {
				hat.x = 400;
				hat.y = 260;
			}
			else if(hat.isTrue == 13) {
				hat.x = 400;
				hat.y = 280;
			}
			}
		}
		if(arg0.getKeyCode()==65) {
			if(hat.isTrue > 0) {
			hat.isTrue --;
			if(hat.isTrue ==0) {
				hat.x = 350;
				hat.y = 280;
			}
			else if(hat.isTrue == 1) {
				hat.x = 380;
				hat.y = 265;
			}
			else if(hat.isTrue == 2) {
				hat.x = 405;
				hat.y = 265;
			}
			else if(hat.isTrue == 3) {
				hat.x = 390;
				hat.y = 265;
			}
			else if(hat.isTrue == 4) {
				hat.x = 390;
				hat.y = 255;
			}
			else if(hat.isTrue == 5) {
				hat.x = 380;
				hat.y = 280;
			}
			else if(hat.isTrue == 6) {
				hat.x = 380;
				hat.y = 270;
			}
			else if(hat.isTrue == 7) {
				hat.x = 380;
				hat.y = 270;
			}
			else if(hat.isTrue == 8) {
				hat.x = 380;
				hat.y = 280;
			}
			else if(hat.isTrue == 9) {
				hat.x = 390;
				hat.y = 270;
			}
			else if(hat.isTrue == 10) {
				hat.x = 380;
				hat.y = 270;
			}
			else if(hat.isTrue == 11) {
				hat.x = 380;
				hat.y = 250;
			}
			else if(hat.isTrue == 12) {
				hat.x = 400;
				hat.y = 260;
			}
			else if(hat.isTrue == 13) {
				hat.x = 400;
				hat.y = 280;
			}
			}
			
		}
		}
		if(wasClicked == false) {
		if(arg0.getKeyCode()==32) {
			p1Score+=10;
			wasClicked = true;
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
			
			changeC = "";
			scoreCol =Color.ORANGE;
			
			for(int i = 0; i < r.length; i++) {
				r[i].gameStatus = true;
			}
			for(int i = 0; i < Y.length; i++) {
				Y[i].gameStatus = true;
			}
			for(int i = 0; i < G.length; i++) {
				G[i].gameStatus = true;
			}
			for(int i = 0; i < P.length; i++) {
				P[i].gameStatus = true;
			}
			for(int i = 0; i < F.length; i++) {
				F[i].gameStatus = true;
			} 
			for(int i = 0; i < B.length; i++) {
				B[i].gameStatus = true;
			}

		}
		}
		if(wasClicked == true) {
			if(p1Score>=0) {
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

