// Input integer n number for numbers of rows that needs to be printed.
// Example with 4 rows: 
//4
//1 
//1 1 
//1 2 1 
//1 3 3 1




import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Integer[] pascal = new Integer[n + 1];
        Integer[] pascalOld = new Integer[n + 1];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            pascal[i + 1] = 0;
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print("1 ");
                    pascal[j] = 1;
                    continue;
                }
                sum = pascalOld[j] + pascalOld[j - 1];
                pascal[j] = sum;
                System.out.print(sum+" ");
            }
            for (int j = 0; j < pascal.length; j++) {
                if (pascal[j] != null) {
                    pascalOld[j] = pascal[j];

                }
            }
            System.out.println();
        }
    }
}
