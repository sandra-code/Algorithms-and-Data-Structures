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
            if(memberOfNetwork(name2)==Network.FRIENDLY){
                friendly(name2);
            }
            else if(memberOfNetwork(name2)==Network.UNFRIENDLY){
                unfriendly(name2);
            }
        }
        else if(memberOfNetwork(name2)==Network.UNKNOWN){
            if(memberOfNetwork(name1)==Network.FRIENDLY){
                friendly(name1);
            }
            else if(memberOfNetwork(name1)==Network.UNFRIENDLY){
                unfriendly(name1);
            }
        }

        //peab meelde jätma kellega on suheldud
    }

    public void addPerson(String name) {
        disjointSubsets.addSubset(name);
    }

    public void friendly(String name) {
        //add to friendly subset
        disjointSubsets.union(name, disjointSubsets.find(name));

    }

    public void unfriendly(String name) {
        //add to unfriendly subset
        disjointSubsets.union(name, disjointSubsets.find(name));
    }

    public Network memberOfNetwork(String name) {
        String parent = disjointSubsets.find(name); //tagastab parenti ehk juure
        if(parent.equals(name)){
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