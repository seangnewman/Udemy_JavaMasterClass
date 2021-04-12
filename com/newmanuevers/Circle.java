public class Circle {
   private double _radius;

   public Circle(double radius) {
     _radius = radius < 0 ? 0 : radius;
   }
    
   public double getRadius(){
       return _radius;
   }

   public double getArea(){
       return Math.PI * Math.pow(_radius, 2);
   }
}
