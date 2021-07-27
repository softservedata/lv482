public class ShipsCounter {
    public static void main(String[] args) {
        int sum = 0;
        int[][] ships = {
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}
        };
        for (int i = 0; i < ships.length; i++) {
            for (int j = 0; j < ships[i].length; j++) {
                try {
                    if(ships[i][j] == 1 && ships[i][j + 1] != 1 && ships[i - 1][j] != 1) {
                        sum++;
                    }
                    //  System.out.print(ships[i][j] + " ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    // e.printStackTrace();
                    sum++;
                }
            }
            // System.out.println();
        }
        System.out.println("Ships: " + sum);
    }
}

