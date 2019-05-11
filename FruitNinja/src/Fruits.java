import java.awt.Image;

public class Fruits {
	    protected double xLocation=0.0;
	    protected double yLocation=0.0;
	    protected double maxHeight=0.0;
	    protected double initialVelocity=0.0;
	    protected double failingVelocity=0.0;
	    protected Image[] Images = new Image[2];
	    
	    public Fruits() {
	       
	    }


	    public Fruits(double xLocation, double yLocation, double maxHeight, double initialVelocity, double failingVelocity) {
	        this.xLocation = xLocation;
	        this.yLocation = yLocation;
	        this.maxHeight = maxHeight;
	        this.initialVelocity = initialVelocity;
	        this.failingVelocity = failingVelocity;
	    }


		public double getxLocation() {
			return xLocation;
		}


		public void setxLocation(double xLocation) {
			this.xLocation = xLocation;
		}


		public double getyLocation() {
			return yLocation;
		}


		public void setyLocation(double yLocation) {
			this.yLocation = yLocation;
		}


		public double getMaxHeight() {
			return maxHeight;
		}


		public void setMaxHeight(double maxHeight) {
			this.maxHeight = maxHeight;
		}


		public double getInitialVelocity() {
			return initialVelocity;
		}


		public void setInitialVelocity(double initialVelocity) {
			this.initialVelocity = initialVelocity;
		}


		public double getFailingVelocity() {
			return failingVelocity;
		}


		public void setFailingVelocity(double failingVelocity) {
			this.failingVelocity = failingVelocity;
		}


		public Image[] getImages() {
			return Images;
		}


		public void setCrosserImages(Image[] Images) {
			this.Images = Images;
		}

	    
	
}
