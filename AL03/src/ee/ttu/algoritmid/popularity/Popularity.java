package ee.ttu.algoritmid.popularity;


import java.util.HashMap;

public class Popularity {

    HashMap<Integer, Point> points = new HashMap<Integer, Point>();

    public Popularity(int maxCoordinates) {
    }

    void addPoint(Integer x, Integer y) {
       Point p = new Point(x,y);
       points.put(p.hashCode(),p);
    }

    /**
     * @return the number of occurrennces of the point
     */

    int pointPopularity(Integer x,Integer y) {
        int count=0;
        Point pnt = new Point(x,y);
        for(Point p: points.values()){
            if(p.x.equals(pnt.x) && p.y.equals(pnt.y) ){
                count++;
            }
        }
        return count;
    }
    /**
     * @return the number of occurrennces of the most popular point
     * test
     */

    int maxPopularity() {


        return 0;
    }

    public static void main(String[] args) {
        Popularity pop = new Popularity(10);
        pop.addPoint(1,3);
        pop.addPoint(1,3);
        pop.addPoint(2,3);
        pop.pointPopularity(1,3);

    }


}

class Point{
    Integer x;
    Integer y;
    public Point(Integer x, Integer y){
        this.x=x;
        this.y=y;



    }
}