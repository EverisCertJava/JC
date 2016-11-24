package mx.everis.cert.factory;

import mx.everis.cert.clases.Circle;
import mx.everis.cert.clases.Rectangle;
import mx.everis.cert.clases.Square;
import mx.everis.cert.interfaces.Shape;

public class ShapeFactory {
	public Shape getShape(String Shape) {
		if (Shape.equalsIgnoreCase("Circle")) {
			return new Circle();

		} else if (Shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();

		} else if (Shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else{
			return null;
		}
	}
}
