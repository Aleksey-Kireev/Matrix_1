

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int y = 0; y<10; y++) {
           for (int x = 0; x < 10; x++) {
                if (y<=x) {
                    matrix[x][y] = 1;
                } else {
                    matrix[x][y] = 0;
                }
           }

       }
        for (int x = 0; x<10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print (matrix [x] [y] + " ");
            }
            System.out.println (" ");
        }


    }
}