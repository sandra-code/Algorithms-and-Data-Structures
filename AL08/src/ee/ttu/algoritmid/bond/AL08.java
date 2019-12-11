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
                friendly(name1);
            }
            else if(memberOfNetwork(name2)==Network.UNFRIENDLY){
                unfriendly(name1);
            }
        }
        else if(memberOfNetwork(name2)==Network.UNKNOWN){
            if(memberOfNetwork(name1)==Network.FRIENDLY){
                friendly(name2);
            }
            else if(memberOfNetwork(name1)==Network.UNFRIENDLY){
                unfriendly(name2);
            }
        }

        //peab meelde jätma kellega on suheldud
    }

    public void addPerson(String name) {
        disjointSubsets.addSubset("U");
        disjointSubsets.addSubset("A");
        disjointSubsets.addSubset(name);
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


    public static void main(String[] args) {
        AL08 al08 = new AL08();
        al08.addPerson("Juku");
        al08.addPerson("Mari");
        System.out.println(al08.memberOfNetwork("Juku"));
        System.out.println(al08.memberOfNetwork("Mari"));
    }

}
