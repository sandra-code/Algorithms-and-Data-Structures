package ee.ttu.algoritmid.scoreboard;

import java.util.*;

public class ScoreBoard {

    TreeSet<Participant> set= new TreeSet<Participant>(new PartipComparator());
    Iterator<Participant> value = set.iterator();
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

        List<Participant> l = new ArrayList<>();
        int start = 0;
        while(value.hasNext() && start<n){
            Participant p = value.next();
            l.add(p);
            System.out.println(p);
        }
        return l;
    }

    public static void main(String[] args) {
        ScoreBoard sb = new ScoreBoard();
        sb.add(new Participant(2,"test",20));
        sb.get(1);
    }
}



