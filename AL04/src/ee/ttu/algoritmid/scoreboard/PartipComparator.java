package ee.ttu.algoritmid.scoreboard;

import java.util.Comparator;

 public class PartipComparator implements Comparator<Participant> {
     @Override
     public int compare(Participant p1, Participant p2){
         return Integer.compare(p1.getId(),p2.getId());
     }

}
