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
        //union kasutamine
    }

    public void addPerson(String name) {
        if(name.equals("U")){
            //on unfriendly
        }
        if(name.equals("A")){
            //on friendly
        }
        else{
            //on unknown
        }
    }

    public void friendly(String name) {
        //add to friendly subset
    }

    public void unfriendly(String name) {
        //add to unfriendly subset
    }

    public Network memberOfNetwork(String name) {
        return null;
    }

}