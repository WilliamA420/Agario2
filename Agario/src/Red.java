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

public class Red{
	Random rnd = new Random(1234);
	//add location attributes
	double x; //position of the bird
	double y;
	public boolean gameStatus = false;
	private Image img; 	
	
	
	private AffineTransform tx;
	
	private int count = 0;
	
	
	
	public Red(int x, int y) {
		this.x = x;
		this.y = y;
		 //load the image for Tree
		img = getImage("/imgs/red.png");
		

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
		int p = (int)(Math.random() * 3) + 0;
		Graphics2D g1 = (Graphics2D) g;
		
		Graphics2D g2 = (Graphics2D) g;
		Graphics2D g3 = (Graphics2D) g;
		Graphics2D g4 = (Graphics2D) g;
		//call update to update the actualy picture location
		update();
		
		
			g1.drawImage(img, tx, null);
		
		
		
		Font f1 = new Font(Font.SERIF, Font.BOLD, 100);
		g.setFont(f1);
		
		
		
		
	

	}
	
	public void gameS() {
		gameStatus = true;
	}
	public void update() {
				
				
		}
		
		
	/* update the picture variable location */

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.8, .8);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Green.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}















