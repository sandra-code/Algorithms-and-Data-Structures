package ee.ttu.algoritmid.bond;

import java.util.zip.DeflaterInputStream;

public class AL08 {

    public enum Network {
        FRIENDLY, UNFRIENDLY, UNKNOWN;
    }

    private DisjointSubsets disjointSubsets = new DisjointSubsets();

    public AL08() {
        // don't remove
    }

    public DisjointSubsets getDisjointSubsets() {
        return disjointSubsets;
    }

    public void talkedToEachOther(String name1, String name2) {
        if(memberOfNetwork(name1)==Network.UNKNOWN && memberOfNetwork(name2)!=Network.UNKNOWN ){
            if(name2.equals("A") || disjointSubsets.find(name2).equals("A")){
                friendly(name1);
            }
            else if(name2.equals("U") || disjointSubsets.find(name2).equals("U")){
                unfriendly(name1);
            }
        }
        else if(memberOfNetwork(name1)!=Network.UNKNOWN && memberOfNetwork(name2)==Network.UNKNOWN){
            if(name1.equals("A") || disjointSubsets.find(name1).equals("A")){
                friendly(name2);
            }
            else if(name1.equals("U") || disjointSubsets.find(name1).equals("U")){
                unfriendly(name2);
            }
        }
        else if(memberOfNetwork(name1)==Network.UNKNOWN && memberOfNetwork(name2)==Network.UNKNOWN){
            disjointSubsets.union(name1, name2);
        }





        //peab meelde jätma kellega on suheldud
    }

    public void addPerson(String name) {
        //System.out.println(disjointSubsets.objectsToNodes.size());
        if (disjointSubsets.objectsToNodes.size()==0){
            disjointSubsets.addSubset("A");
            disjointSubsets.addSubset("U");
        }
        disjointSubsets.addSubset(name);
    }

    public void friendly(String name) {
        ///add to friendly subset
        disjointSubsets.union(name, "A");

    }

    public void unfriendly(String name) {
        //add to unfriendly subset
        disjointSubsets.union(name,"U");
    }

    public Network memberOfNetwork(String name) {
        String parent = disjointSubsets.find(name); //tagastab parenti ehk juure
        if(parent.equals("U")){
            return Network.UNFRIENDLY;
        }
        else if(parent.equals("A")){
            return Network.FRIENDLY;
        }
        else{
            return Network.UNKNOWN;
        }

    }


    public static void main(String[] args) {
        AL08 al08 = new AL08();
        al08.addPerson("Juku");
        al08.addPerson("Mari");
        System.out.println("Juku lisamine: Juku staatus on "+al08.memberOfNetwork("Juku"));
        System.out.println("Mari lisamine: Mari staatus on  "+al08.memberOfNetwork("Mari"));
        al08.addPerson("Tiit");
        al08.talkedToEachOther("A", "Tiit");
        System.out.println("Pärast seda kui Tiit rääkis A-ga, Tiidu staatus  "+al08.memberOfNetwork("Tiit"));
        al08.talkedToEachOther("Mari", "Tiit");
        System.out.println("Pärast seda kui Tiit rääkis Mariga, Mari staatus "+al08.memberOfNetwork("Mari"));
        al08.talkedToEachOther("U", "Juku");
        System.out.println("Pärast seda kui U rääkis Jukuga, Juku staatus: "+al08.memberOfNetwork("Juku"));
        al08.addPerson("Kati");
        al08.addPerson("Mati");
        System.out.println("Kati ja Mati rääkimine:");
        al08.talkedToEachOther("Kati", "Mati");

        System.out.println("Kati lisamine: Kati staatus on "+al08.memberOfNetwork("Kati"));
        System.out.println("Mati lisamine: Mati staatus on  "+al08.memberOfNetwork("Mati"));
        al08.talkedToEachOther("Kati","Juku");
        System.out.println("Pärast seda Kati rääkis Mariga, Mati staatus on "+al08.memberOfNetwork("Mati"));


    }

}
