package ee.ttu.algoritmid.trampoline;


import java.util.*;
import java.util.List;

public class HW02 implements TrampolineCenter {
    //Row ja col näitavad, mis suunas saab liikuda

    private static int[] row = {  0, 1 };
    private static int[] col = { 1, 0 };
    @Override
    public List<String> findMinJumps(int[][] map) {
        int x=0;
        int y=0;
        LinkedList<String> pathList = new LinkedList<>();
        Map<Node, Node> prev = new HashMap<>();
        Queue<Node> q = new ArrayDeque<>();
        Node src = new Node(x, y, null);

        q.add(src);
        Node curr = new Node(0,0, null);
        Set<String> visited = new HashSet<>();
        String key = src.x + "," + src.y;
        visited.add(key);


        while (!q.isEmpty())
        {
             curr = q.poll();
            int i = curr.x, j = curr.y;
            if (i == map.length- 1 && j == map.length- 1) {
                break;
            }

            int n = map[i][j];
            for (int k = 0; k < 2; k++)
            {
                x = i + row[k] * n;
                y = j + col[k] * n;

                if (isValid(x, y, map.length))
                {
                    Node next = new Node(x, y, curr);
                    key = next.x + "," + next.y;

                    if (!visited.contains(key)) {

                        q.add(next);
                        visited.add(key);
                        prev.put(next,curr);

                    }
                }
            }
        }

        for (Node ver = curr ; ver!= null; ver = prev.get(ver)){
                if(ver.parent ==null){
                    break;
                }
                else{
                    if(ver.y==ver.parent.y){

                        String jump = "S"+map[ver.parent.x][ver.parent.y];

                        pathList.add(jump);
                    }
                    else{

                        String jump = "E"+map[ver.parent.x][ver.parent.y];

                        pathList.add(jump);
                    }
                }

            }
        Collections.reverse(pathList);

        return pathList;
    }

    private static boolean isValid(int x, int y, int N) {
        return (x >= 0 && x < N) && (y >= 0 && y < N);
    }
}