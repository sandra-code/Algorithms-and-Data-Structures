package ee.ttu.algoritmid.trampoline;

import java.util.List;

public class HW02tester {

    public static void main(String[] args) {
        HW02 h = new HW02();

        int[][] map = new int[][]{
                { 8, 10, 20, 1, 2, 6, 1, 2, 2 },
                { 1, 10, 1, 10, 2, 2, 1, 2, 2 },
                { 1, 10, 1, 1, 20, 2, 1, 2, 2 },
                { 2, 1, 5, 1, 1, 20, 1, 2, 2 },
                { 1, 2, 2, 10, 1, 1, 10, 2, 2 },
                { 2, 1, 3, 1, 10, 1, 1, 20, 2 },
                { 1, 2, 2, 1, 2, 10, 1, 1, 2 },
                { 1, 1, 1, 1, 2, 2, 10, 1, 1 },
                { 8, 2, 1, 1, 2, 2, 1, 1, 0 }
        };


        h.findMinJumps(map);


/*
        if (node != null) {

            h.printPath(node, map);

        }

        List jumpList = h.findMinJumps(map);
        System.out.println("\n1. " + jumpList + ", " + jumpList.size() + " jumps\n");

        map = new int[][]{
                {  1, 1, 20, 1, 2, 2, 1, 2, 2 },
                { 20, 1, 1, 10, 2, 2, 1, 2, 2 },
                { 1, 10, 1, 1, 20, 2, 1, 2, 2 },
                { 2, 1, 10, 1, 1, 20, 1, 2, 2 },
                { 1, 2, 2, 10, 1, 1, 10, 2, 2 },
                { 2, 1, 1, 1, 10, 1, 1, 20, 2 },
                { 1, 2, 2, 1, 2, 10, 1, 1, 20 },
                { 2, 1, 1, 1, 2, 2, 10, 1, 1 },
                { 3, 2, 1, 1, 2, 2, 1, 10, 0 }
        };
        jumpList = h.findMinJumps(map);
        System.out.println("2. " + jumpList + ", " + jumpList.size() + " jumps\n");

        map = new int[][]{
                { 1, 10, 20, 1, 2, 2, 1, 2, 2 },
                { 1, 10, 1, 10, 2, 2, 1, 2, 2 },
                { 1, 10, 1, 1, 20, 2, 1, 2, 2 },
                { 2, 1, 10, 1, 1, 20, 1, 2, 2 },
                { 1, 2, 2, 10, 1, 1, 10, 2, 2 },
                { 2, 1, 1, 1, 10, 1, 1, 20, 2 },
                { 1, 2, 2, 1, 2, 10, 1, 1, 20 },
                { 1, 1, 1, 1, 2, 2, 10, 1, 1 },
                { 1, 2, 1, 1, 2, 2, 1, 1, 0 }
        };
        jumpList = h.findMinJumps(map);
        System.out.println("3. " + jumpList + ", " + jumpList.size() + " jumps\n");

        map = new int[][]{
                { 8, 10, 20, 1, 2, 6, 1, 2, 2 },
                { 1, 10, 1, 10, 2, 2, 1, 2, 2 },
                { 1, 10, 1, 1, 20, 2, 1, 2, 2 },
                { 2, 1, 5, 1, 1, 20, 1, 2, 2 },
                { 1, 2, 2, 10, 1, 1, 10, 2, 2 },
                { 2, 1, 3, 1, 10, 1, 1, 20, 2 },
                { 1, 2, 2, 1, 2, 10, 1, 1, 2 },
                { 1, 1, 1, 1, 2, 2, 10, 1, 1 },
                { 8, 2, 1, 1, 2, 2, 1, 1, 0 }
        };
        jumpList = h.findMinJumps(map);
        System.out.println("4. " + jumpList + ", " + jumpList.size() + " jumps");
        /*
        Vastused =
        1. [S1, E2, S1], 3 jumps

        2. [E1, S1, E1, S1, E1, S1, E1, S1, E1, S1, E1, S1, E1, S1, E1, S1], 16 jumps

        3. [S1, S1, S1, S2, E2, S1, E2, S2, E2, E1, E1], 11 jumps

        4. [S8, E8], 2 jumps

         */

    }
}