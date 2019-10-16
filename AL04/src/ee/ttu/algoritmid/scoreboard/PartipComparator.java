package ee.ttu.algoritmid.scoreboard;

import java.util.Comparator;

 public class PartipComparator implements Comparator<Participant> {
     @Override
     public int compare(Participant p1, Participant p2){
         if(p1.equals(p2)==true){
             return 0;
         }

         return -1;
     }

}
