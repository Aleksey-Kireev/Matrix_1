
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//  ----- =====  Заполнение массива 1 и 0 по возрастанию   ===== -----

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

//  ----- =====  Заполнение массива рандомно от 0 до 100   ===== -----

    System.out.println (" ");
    System.out.println (" ");

        int[][] matrixRND = new int[10][10];
        for (int y = 0; y<10; y++) {
            for (int x = 0; x < 10; x++) {
                matrixRND [x][y] = (int) (Math.random() * 100);
            }
        }

        for (int x = 0; x<10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print (matrixRND [x] [y] + " ");
            }
            System.out.println (" ");
        }

//  ----- =====  Сортировка массива   ===== -----
 /*       System.out.println (" ");
        Arrays.sort(matrixRND);
        System.out.println ("Отсортированный массив");
        for (int x = 0; x<10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print (matrixRND [x] [y] + " ");
            }
            System.out.println (" ");
        }
*/
    }
}