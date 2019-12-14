package ee.ttu.algoritmid.trampoline;

import java.util.List;

public class HW02tester {

    public static void main(String[] args) {
        HW02 h = new HW02();

        int[][] map = new int[][]{
                { 1, 2, 2 },
                { 2, 10, 1 },
                { 3, 2, 0 }
        };
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
    }
}