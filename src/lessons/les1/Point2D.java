package lessons.les1;

/**
 * Это точка 2D
 */
public class Point2D {
    private int x, y;


    /**
     * Это конструктор ...
     * @param valueX это координата x
     * @param valueY это координата y
     */
    public Point2D(int valueX, int valueY){
        x = valueX;
        y = valueY;
    }
    public Point2D(int value){
//        this.x = value;
//        this.y = value;
        this(value,value);
    }
    public Point2D(){
        this(10,11);
    }

    public int getX(){
        return x;
    }
     public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;

    }
    public void setY(int value){
        this.y = value;

    }

    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x -b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
