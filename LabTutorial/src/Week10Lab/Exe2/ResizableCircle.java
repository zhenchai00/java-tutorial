package Week10Lab.Exe2;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double x) {
		super(x);
	}
	
	public void resize (int percent) {
		radius = radius * (1 + percent / 100.0);
	}
}
