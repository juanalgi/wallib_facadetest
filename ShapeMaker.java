
public class ShapeMaker {
	
	private Shape circulo;
	private Shape rectangulo;
	private Shape cuadrado;
	
	public ShapeMaker() {
		
		circulo = new Circle();
		rectangulo = new Rectangle();
		cuadrado = new Square();
		
	}
	
	private void genericDraw(Shape figura) {
		
		figura.draw();
	}
	
	public void drawCircle() {
		
		genericDraw(circulo);
	}
	
	public void drawRectangle() {
		
		genericDraw(rectangulo);
	}
	
	public void drawSquare() {
		
		genericDraw(cuadrado);
	}

}
