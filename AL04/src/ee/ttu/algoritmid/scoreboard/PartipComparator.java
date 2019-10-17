package ee.ttu.algoritmid.scoreboard;

import java.util.Comparator;

 public class PartipComparator implements Comparator<Participant> {
     @Override
     public int compare(Participant p1, Participant p2) {
         if(p1.getTime()==p2.getTime()){
             if (p1.getId()<p2.getId())
             {
                 return -1;
             }
             else{
                 return 1;
             }
         }
         else if(p1.getTime()>p2.getTime()){
             return -1;
         }
         else{
             return 1;
         }
     }

}
