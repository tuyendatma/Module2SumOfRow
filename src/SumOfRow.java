import java.util.Arrays;
import java.util.Scanner;

public class SumOfRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu rong ma tran");
        int width = scanner.nextInt();
        System.out.println("moi ban nhap chieu dai ma tran");
        int height = scanner.nextInt();
        int[][] matrix = new int[width][height];
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                System.out.print("nhap gia tri tai x= "+i+" y= "+j+"\t");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("nhap cot ban muon tinh tong(tinh tu 0):");
        int row = scanner.nextInt();
        int sum = calculatorSum(matrix,row);
        System.out.println(sum);
    }
    public static int calculatorSum(int[][] arr, int row){
        int sum =0;
        for (int[] ints : arr) {
            sum += ints[row];
        }
        return sum;
    }
}
