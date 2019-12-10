package ee.ttu.algoritmid.bond;

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
        if(memberOfNetwork(name1)==Network.UNKNOWN){
            name1 = name2;
        }
        else if(memberOfNetwork(name2)==Network.UNKNOWN){
            name2 = name1;
        }
    }

    public void addPerson(String name) {
        if(name.equals("U")){
            //on unfriendly
           unfriendly(name);
        }
        if(name.equals("A")){
            //on friendly
            friendly(name);
        }
        else{
            //on unknown
        }
    }

    public void friendly(String name) {
        //add to friendly subset
        disjointSubsets.union("A", name);

    }

    public void unfriendly(String name) {
        //add to unfriendly subset
        disjointSubsets.union("U", name);
    }

    public Network memberOfNetwork(String name) {
        String root = disjointSubsets.find(name); //tagastab root ehk parenti
        if(root.equals("U")){
            return Network.UNFRIENDLY;
        }
        else if(root.equals("A")){
            return  Network.FRIENDLY;
        }
        else{ return Network.UNKNOWN;}

    }

}