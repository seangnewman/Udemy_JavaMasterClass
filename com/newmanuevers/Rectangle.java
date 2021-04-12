public class Rectangle {
    private double _width;
    private double _length;

    public Rectangle(double width, double length) {
      _width = width < 0 ? 0 : width;
      _length = length < 0 ? 0 : length;
    }

    public double getWidth(){
      return _width;
    }

    public double getLength(){
      return _length;
    }

    public double getArea(){
      return _width * _length;
    }
     
}
