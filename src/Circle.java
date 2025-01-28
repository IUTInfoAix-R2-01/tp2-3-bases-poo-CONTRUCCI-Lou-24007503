//le renomer Circle pour que ca fonctionne
public class Circle {  
   private double radius;
   private String color;
  
   public Circle() {  
      radius = 1.0;
      color = "red";
   }
   
   public Circle(double r) {  
      radius = r;
      color = "red";
   }
   
   public Circle (double r, String c) { 
	   radius = r ;
	   color = c; 
   }
   
   public String getColor() { 
	  return color ; 
   }
   
   public double getRadius() {
     return radius; 
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
}