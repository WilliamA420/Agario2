
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
public class Red {
	Random rnd = new Random(1234);
	//x and y position of the Red
	double x; 
	double y;
	//tells whether the game is in progress or over
	boolean gameStatus = false;
	boolean purge = true;
	//the movement variables for Red
	int speed = -7; //going left
	double ax;
	double vx ;
	boolean pointStatus = false;
	
	//score that is synched with the the other scores in bird and cactus class
	public int i = 0;
	
	 Timer timer = new Timer();
     
      
     
      
	
	private Image img; 	
	private AffineTransform tx;
	
	 
	
	
	//Red img variables and display
	public Red(int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/red.png"); //load the image for Tree

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
	//method which constantly updates and finds out the position and score of game in relation to the Red
	public void update() {
		//if statement makes it so that after scoring 1200 points the Reds will start to appear 
		//and progressivly speedup as long as you are alive and the score is going up
		if(gameStatus == true &&  pointStatus == true) {
			x =10000;
			
		}
		if(purge == false ) {
			x = (int)(Math.random() * 890) + 10;
			
			y =(int)(Math.random() * 890) + 10;
			pointStatus = false;
			purge = true;
		}
		
		
		//if statement to make the Red reset its x position between 1500 to 1000 
				//if statement that declares when game is over that the Red stop moving and be sent to x
		//position of 100
			
		//x position updates based of velocity and acceleration
		
		//x += vx;
		//vx = ax;
		//size of Red declared
		
		
		
		
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
			URL imageURL = Red.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}




