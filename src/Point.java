public class Point {
    private double x;
    private double y;
    Point(){

    }
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double xSpeed) {
        this.x = xSpeed;
    }

    public void setY(double ySpeed) {
        this.y = ySpeed;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public double[] getXY(){
        double[] xy = new double[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
