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
	
	
	
	
	
	private Image img; 	
	private AffineTransform tx;

	public Hat(int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/hatB.png"); //load the image for Tree

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
		
		
		if(x<-40) {
			x=-40;
			vx = 0;
		}
		if(x>200) {
			x=200;
			vx = 0;
		}
		x += vx;
		
		y += vy;
		tx.setToTranslation(x, y);
		tx.scale(1	, 1);
		
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
