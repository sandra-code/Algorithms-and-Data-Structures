package ee.ttu.algoritmid.bond;

import java.util.HashMap;
import java.util.List;

public class DisjointSubsets {
    public HashMap objectsToNodes = new HashMap();
    public String find(String element) throws IllegalArgumentException {

        // should throw IllegalArgumentException if the element is not present
        Node node = (Node) objectsToNodes.get(element);
        if (node == null) {
            return null;
        }
            node.parent = find(node.parent.toString());
        return node.parent.toString();
    }

    public void union(String element1, String element2) throws IllegalArgumentException {
        // should throw IllegalArgumentException if any of elements is not present
        Object setX = find(element1);
        Object setY = find(element2);
        if (setX == null || setY == null || setX == setY)
            return;
        Node nodeX = (Node) objectsToNodes.get(setX);
        Node nodeY = (Node) objectsToNodes.get(setY);
        if (nodeX.count > nodeY.count) {
            nodeY.parent = element1;
        } else {
            nodeX.parent = element2;
            if (nodeX.count == nodeY.count)
                nodeY.count++;
        }
    }

    public void addSubset(String element) throws IllegalArgumentException {
        // should throw IllegalArgumentException if the element is already present
        objectsToNodes.put(element, new Node(element, 0));

    }

    public void toList(List list) {
        list.addAll(objectsToNodes.keySet());
    }


}