package ee.ttu.algoritmid.scoreboard;

import java.util.*;

public class ScoreBoard {

    TreeSet<Participant> set= new TreeSet<>(new PartipComparator());
    static List<Participant> l = new ArrayList<>();

    /**
     * Adds a participant's time to the checkpoint scoreboard
     */
    public void add(Participant participant) {
        set.add(participant);
    }

    /**
     * Returns top n number of participants in the checkpoint to be displayed on the scoreboard
     * This method will be queried by the tests every time a new participant is added

     */
    public List<Participant> get(int n) {
        Iterator<Participant> value = set.iterator();
        int start = 0;
        while(value.hasNext() && start<=n){
            Participant p = value.next();
            l.add(p);
            start++;
        }
        return l;
    }
    public static void print(List<Participant> l){
        List<Participant> list = l;
        for (int i =0; i<l.size(); i++){
            System.out.println(l.get(i).getTime() + " "+ l.get(i).getId() );
        }
    }
    public static void main(String[] args) {
        ScoreBoard sb = new ScoreBoard();
        sb.add(new Participant(2,"test",20));
        sb.add(new Participant(3,"tests",34));
        sb.add(new Participant(1,"tests",34));
        sb.add(new Participant(56,"tests",19));
        sb.add(new Participant(7,"tests",19));
        sb.add(new Participant(80,"tests",19));
        sb.get(3);
        print(l);
    }
}



