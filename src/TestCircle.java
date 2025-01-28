//le renomer TestCircle pour que ca fonctionne
public class TestCircle{
	public static void main (String[] args) {
		Circle c1 = new Circle();
		System.out.println(" the circle has radius of "
				+ c1.getRadius() + " and ara of " + c1.getArea());
		
		Circle c2 = new Circle(2.0);
		
		System.out.println(" the circle has radius of " 
				+ c2.getRadius() + " and area of " + c2.getArea());
		
	    Circle c3 = new Circle(3.0, "blue");
		
		System.out.println(" the circle has radius of " 
				+ c3.getRadius() + " and area of " + c3.getArea()
				+ " and is color is " + c3.getColor() );
		
		//System.out.println(c1.radius); ca ne fonctinne pas car radius est priver
		
		
	}
}