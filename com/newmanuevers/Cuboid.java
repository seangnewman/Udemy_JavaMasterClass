public class Cuboid extends Rectangle{
    private double _height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        _height = height < 0 ? 0 : height;
    }

    public double getHeight(){
        return _height;
    }

    public double getVolume(){
        return _height * getArea();
    }
    
}
