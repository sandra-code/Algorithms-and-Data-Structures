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
            disjointSubsets.union(name1, name2);
        }
        else if(memberOfNetwork(name2)==Network.UNKNOWN){
            disjointSubsets.union(name2, name1);
        }

        //peab meelde jätma kellega on suheldud
    }

    public void addPerson(String name) {
        if(memberOfNetwork(name)==Network.UNFRIENDLY){
            //on unfriendly
            disjointSubsets.addSubset("U");
           unfriendly(name);
        }
        else if(memberOfNetwork(name)==Network.FRIENDLY){
            //on friendly
            disjointSubsets.addSubset("A");
            friendly(name);
        }
        else{
            disjointSubsets.addSubset(name);
        }




    }

    public void friendly(String name) {
        //add to friendly subset
        disjointSubsets.union(name, disjointSubsets.find("A"));

    }

    public void unfriendly(String name) {
        //add to unfriendly subset
        disjointSubsets.union(name, disjointSubsets.find("U"));
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

}