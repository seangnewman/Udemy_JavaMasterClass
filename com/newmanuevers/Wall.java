public class Wall {
    private double width;
    private double height;

    public Wall() {
        width = 0;
        height = 0; 
    }
    public Wall(double _width, double _height) {
        width = _width < 0? 0 : _width;
        height = _height < 0 ? 0 : _height;
    }

    public double getWidth(){
        return width;
    } 
    public double getHeight(){
        return height;
    }
    public void setWidth(double _width){
        width = _width < 0 ?0: _width;
    }
    public void setHeight(double _height){
        height = _height < 0 ? 0 : _height;
    }
    public double getArea(){
        return width * height;
    }
    
}
