import java.awt.Font;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.lang.Thread;
public class ai {
	Random rnd = new Random(1234);
	//x and y position of the Blue
	double x; 
	double y;
	double point = 0;
	double score =0;
	double sub = -10;
	double xmultiplier = 1;
	double ymultiplier =1;
	//tells whether the game is in progress or over
	boolean gameStatus = false;
	boolean purge = true;
	double level = 1;
	//the movement variables for Blue
	int speed = -10; //going left
	double ax;
	double vx ;
	double ay;
	double vy ;
	boolean pointStatus = false;
	
	//score that is synched with the the other scores in bird and cactus class
	public int i = 0;
	
	 Timer timer = new Timer();
     
      
     
      
	
	private Image img; 	
	private AffineTransform tx;
	
	 
	
	
	//Blue img variables and display
	public ai(int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/Pacman.png"); //load the image for Tree

		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}
	
	public void changePicture(String newFileName) {
		img = getImage(newFileName);
		init(x, y);
		
		
	}
	
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;

		//call update to update the actualy picture location
		update();
		g2.drawImage(img, tx, null);
		
		
		
		
		
	

	}
	//method which constantly updates and finds out the position and score of game in relation to the Blue
	public void update() {
		//if statement makes it so that after scoring 1200 points the Blues will start to appear 
		//and progressivly speedup as long as you are alive and the score is going up
		if(x < -10 ) {
			xmultiplier*=-1;
		}
		if(x > 970) {
			xmultiplier*=-1;
			
	
		}
		
		if(y < -10) {
			ymultiplier*=-1;
		}
		if(y > 890) {
			ymultiplier*=-1;
			
	
		}
		if(score <100) {
			
			sub = 1;
			
			vx =5*xmultiplier;
			vy=5*ymultiplier;
			
			
			
		}
		
		if(score > 100 &&score <300 || level == 2) {
			
			sub = 2;
			
			vx =8*xmultiplier;
			vy=8*ymultiplier;
			level = 2;
			
		}

		if(score > 300 &&score <500 || level == 3) {
			
			sub = 8;
			
			vx =10*xmultiplier;
			vy=10*ymultiplier;
			level = 3;
			
			
		}
		if(score > 500 &&score <700 || level == 4) {
			
			sub = 12;
			
			vx =12*xmultiplier;
			vy=12*ymultiplier;
			level = 4;
			
			
		}
		if(score >700 || level == 5) {
			
			sub = 25;
			
			vx =14*xmultiplier;
			vy=14*ymultiplier;
			level = 5;
			
			
		}
		
		
		//if statement to make the Blue reset its x position between 1500 to 1000 
				//if statement that declares when game is over that the Blue stop moving and be sent to x
		//position of 100
			
		//x position updates based of velocity and acceleration
		
		x += vx;
		vx = ax;
		y += vy;
		vy = ay;
		//size of Blue declaBlue
		
		
		
		
		tx.setToTranslation(x, y);
		tx.scale(1, 1);
		
	}
	/* update the picture variable location */

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.5, .5);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = ai.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}


