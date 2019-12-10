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
    }

    public void addPerson(String name) {

        disjointSubsets.addSubset(name);
    }

    public void friendly(String name) {
    }

    public void unfriendly(String name) {
    }

    public Network memberOfNetwork(String name) {
        return null;
    }

}