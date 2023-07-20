public class Circle extends Shape {
private double radius;
	

   public Circle(String color, double radius) {
      super(color);
      this.radius = radius;
   }
   public static void main (String[] args){

Circle c=new Circle("red",20.00);
 Double nn=c.getArea();

   System.out.println(nn);
	  
   }
   @Override
   public double getArea(){
      return Math.PI * radius * radius;
   }
  
}