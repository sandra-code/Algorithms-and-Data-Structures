package ee.ttu.algoritmid.popularity;


import java.util.*;

public class Popularity {
    HashMap<Integer, Point> points;


    public Popularity(int maxCoordinates) {
        points = new HashMap<Integer, Point>(maxCoordinates);

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
     *
     */
    int maxPopularity() {
        Map<Point, Integer> countMap = new HashMap<>();

        for (Map.Entry<Integer, Point> entry : points.entrySet()) {
            if (countMap.containsKey(entry.getValue())) {
                countMap.put(entry.getValue(), countMap.get(entry.getValue()) + 1);
            } else {
                countMap.put(entry.getValue(), 1);
            }
        }
        // Got the number of maximum occuarance
        Integer maxNum = Collections.max(countMap.values());
        /**
        int result = 0;
        // Iterate to search the result.
        for (Map.Entry<Point, Integer> entry : countMap.entrySet()) {
            if(maxNum==entry.getValue()){
                result=entry.getKey();
            }

        }**/
        System.out.println(maxNum);
        return maxNum;
    }

    public static void main(String[] args) {
        Popularity pop = new Popularity(10);
        pop.addPoint(1,3);
        pop.addPoint(1,3);
        pop.addPoint(2,3);
        pop.addPoint(2,3);
        pop.addPoint(2,3);
        pop.maxPopularity();

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