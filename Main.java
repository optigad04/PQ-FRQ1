import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();

        int[][] array2D = new int[rows][columns];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                array2D[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int[] maxRow = new int[columns];

        for (int i = 0; i < array2D.length; i++){
            int sum = 0;
            for (int j = 0; j < array2D[i].length; j++){
                sum += array2D[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                maxRow = array2D[i];
            }
        }
        System.out.print("Row with maximum sum: ");
        for (int value : maxRow){
            System.out.print(value + " ");
        }
        System.out.println("\nTotal: " + maxSum);

        sc.close();
    }
}