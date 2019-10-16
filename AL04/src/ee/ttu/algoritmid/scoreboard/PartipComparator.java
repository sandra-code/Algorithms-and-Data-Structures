package ee.ttu.algoritmid.scoreboard;

import java.util.Comparator;

 public class PartipComparator implements Comparator<Participant> {
     @Override
     public int compare(Participant p1, Participant p2){
         return p1.getName().compareTo(p2.getName());
     }

}
