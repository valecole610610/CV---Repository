package hsaPack;
import hsa2.*;

public class test {

public static void main(String[] args) throws InterruptedException {
	GraphicsConsole c = new GraphicsConsole(1080, 1920, "Random String");
	
	int x = 100, y=100;
	int x2 = 0;
	
	while (x < 300) {
		c.clear();
		c.setColor(Color.RED);
		
		c.fillStar(x, y, 50, 75);
		
		c.fillStar(x2, 200, 10, 10);
		Thread.sleep(15);
		
		x++;
		y++;
	}
	
	Image rocket = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("rocketship.png"));
	
	c.drawImage(rocket, 10, 10);
}