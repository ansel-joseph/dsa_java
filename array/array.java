import java.util.*;

public class array {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element for position (" + i + "," + j + "):");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be found: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j]==x){
                    System.out.println("Element found at : " + i + "," + j);
                }
            }
            System.out.println();
        }

    }
}