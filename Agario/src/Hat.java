import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Hat{
	//add location attributes
	public int x, y;//position of the pillar
	public int vx; // velocty of x
	public int vy = 0;
	public double length = 2.5;
	public double width = 2.5;
	public static int isTrue = 0;
	
	
	public Image img; 	
	public Image img2; 
	public Image img3;
	public Image img4;
	public Image img5;
	public Image img6;
	public Image img7;
	public Image img8;
	public Image img9;
	public Image img10;
	public Image img11;
	public Image img12;
	public Image img13;
	public Image img14;
	public AffineTransform tx;

	public Hat(int x, int y) {
		this.x = x;
		this.y = y; 
		img = getImage("/imgs/hatB.png"); //load the image for Tree
		img2 = getImage("/imgs/Clown.png");
		img3 = getImage("/imgs/Brit.png");
		img4 = getImage("/imgs/France.png");
		img5 = getImage("/imgs/Germany.png");
		img6 = getImage("/imgs/Italy.png");
		img7 = getImage("/imgs/Lux.png");
		img8 = getImage("/imgs/Poland.png");
		img9 = getImage("/imgs/Swed.png");
		img10 = getImage("/imgs/Switz.png");
		img11 = getImage("/imgs/Ukraine.png");
		img12 = getImage("/imgs/US.png");
		img13 = getImage("/imgs/Yugo.png");
		img14 = getImage("/imgs/Pacman.png");
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
		if(isTrue == 0) {
		g2.drawImage(img, tx, null);
		}
		else if(isTrue == 1) {
			g2.drawImage(img2, tx, null);
		}
		else if(isTrue == 2) {
			g2.drawImage(img3, tx, null);
		}
		else if(isTrue == 3) {
			g2.drawImage(img4, tx, null);
		}
		else if(isTrue == 4) {
			g2.drawImage(img5, tx, null);
		}
		else if(isTrue == 5) {
			g2.drawImage(img6, tx, null);
		}
		else if(isTrue == 6) {
			g2.drawImage(img7, tx, null);
		}
		else if(isTrue == 7) {
			g2.drawImage(img8, tx, null);
		}
		else if(isTrue == 8) {
			g2.drawImage(img9, tx, null);
		}
		else if(isTrue == 9) {
			g2.drawImage(img10, tx, null);
		}
		else if(isTrue == 10) {
			g2.drawImage(img11, tx, null);
		}
		else if(isTrue == 11) {
			g2.drawImage(img12, tx, null);
		}
		else if(isTrue == 12) {
			g2.drawImage(img13, tx, null);
		}
		else if(isTrue == 13) {
			g2.drawImage(img14, tx, null);
		}
	}
	
	public void moveL() {
		 vx -= 5;
		
		//find a cap for vy
	}
	
	public void moveR() {
		 vx += 5;
		 
		//find a cap for vy
	}
	public void moveU() {
		 vy -= 5;
		
		//find a cap for vy
	}
	public void moveD() {
		 vy += 5;
		
		//find a cap for vy
	}
	/* update the picture variable location */
	private void update() {
		if(isTrue == 0) {
			
			if(y<-10) {
				y=-10;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-40) {
				x=-40;
				vx = 0;
			}
			if(x>950) {
				x=950;
				vx = 0;
			}
			
		}
		if(isTrue == 1) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 2) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>890) {
				y=890;
				vy = 0;
			}
			
			if(x<-20) {
				x=-20;
				vx = 0;
			}
			if(x>970) {
				x=970;
				vx = 0;
			}
		}
		
		if(isTrue == 3) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-20) {
				x=-20;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 4) {
			if(y<-30) {
				y=-30;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>890) {
				y=890;
				vy = 0;
			}
			
			if(x<-20) {
				x=-20;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 5) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 6) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 7) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 8) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		if(isTrue == 9) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>890) {
				y=890;
				vy = 0;
			}
			
			if(x<-20) {
				x=-20;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 10) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 11) {
			if(y<-25) {
				y=-25;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>890) {
				y=890;
				vy = 0;
			}
			
			if(x<-30) {
				x=-30;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		
		if(isTrue == 12) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>885) {
				y=885;
				vy = 0;
			}
			
			if(x<-20) {
				x=-20;
				vx = 0;
			}
			if(x>960) {
				x=960;
				vx = 0;
			}
		}
		if(isTrue == 13) {
			if(y<-20) {
				y=-20;
				vy = 0;
			}
			if(vy>15 ) {
				vy=15;
			}
			if(vy<-15 ) {
				vy=-15;
			}
			if(vx>15 ) {
				vx=15;
			}
			if(vx<-15 ) {
				vx=-15;
			}
			if(y>900) {
				y=900;
				vy = 0;
			}
			
			if(x<-20) {
				x=-20;
				vx = 0;
			}
			if(x>970) {
				x=970;
				vx = 0;
			}
		}
		x += vx;
		
		y += vy;
		tx.setToTranslation(x, y);
		tx.scale(length	, width);
		
		//cap for vy
		
		
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.5, .5);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Hat.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
