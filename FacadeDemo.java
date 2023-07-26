
public class FacadeDemo {
	
	public static void main(String argv[]) {
		
		ShapeMaker geometricMaker = new ShapeMaker();
		
		geometricMaker.drawCircle();
		geometricMaker.drawRectangle();
		geometricMaker.drawSquare();
		
	}
}
