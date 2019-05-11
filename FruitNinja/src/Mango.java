import java.awt.Image;
public class Mango extends Fruits
{

	public Mango(double xLocation, double yLocation, double maxHeight, double initialVelocity, double failingVelocity) {
		 this.xLocation = xLocation;
	        this.yLocation = yLocation;
	        this.maxHeight = maxHeight;
	        this.initialVelocity = initialVelocity;
	        this.failingVelocity = failingVelocity;
	        Images= new Image("this");
	}

}
