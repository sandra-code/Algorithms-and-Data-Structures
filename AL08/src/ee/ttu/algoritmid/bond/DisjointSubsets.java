package ee.ttu.algoritmid.bond;

import java.util.HashMap;

public class DisjointSubsets {
    public HashMap<String, Node> objectsToNodes = new HashMap<>();
    public String find(String element) throws IllegalArgumentException {

        // should throw IllegalArgumentException if the element is not present
        Node node = objectsToNodes.get(element);
        if (node == null)
            throw new IllegalArgumentException("test");
        if (element != node.parent)
            node.parent = find(node.parent);
        return node.parent;
    }

    public void union(String element1, String element2) throws IllegalArgumentException {
        // should throw IllegalArgumentException if any of elements is not present
        //Pseudocode:
        //Union(i,j)
        //i_id <- Find(i)
        //i_id <- Find(j)
        //if i_id = j_id:
        //  return
        //if rank[i_id]>rank[j_id]:
        //      parent[j_id]<-i_id
        //else:
        //      parent[i_id]<-j_id
        //      if rank[i_id] = rank[j_id]:
        //          rank[j_id]<- rank[j_id] + 1
        Object setX = find(element1);
        Object setY = find(element2);
        if (setX == null || setY == null || setX == setY)
           return;
        Node nodeX =  objectsToNodes.get(setX);
        Node nodeY =  objectsToNodes.get(setY);
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
        if(objectsToNodes.containsKey(element)){
            throw new IllegalArgumentException();
        }
        else {
            objectsToNodes.put(element, new Node(element, 0));
        }
    }
}