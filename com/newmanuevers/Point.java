public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int _x, int _y) {
        x = _x;
        y = _y;

    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int _x){
        x = _x;
    }
    public void setY(int _y){
        y = _y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double distance(int _x, int _y){
        return Math.sqrt(Math.pow(x - _x,2) + Math.pow(y - _y,2));
    }

    public double distance(Point pt){
        return Math.sqrt(Math.pow(x - pt.x,2) + Math.pow(y - pt.y,2));
    }
}
