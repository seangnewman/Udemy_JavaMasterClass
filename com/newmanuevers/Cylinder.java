public class Cylinder extends Circle {

    private double _height;

    public Cylinder(double radius, double height) {
        super(radius);
        _height = height < 0 ? 0 : height;

    }

    public double getHeight(){
        return _height;
    }

    public double getVolume(){
        return _height * getArea();
    }
}
