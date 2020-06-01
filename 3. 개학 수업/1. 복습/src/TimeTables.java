import java.util.Scanner;

public class TimeTables {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇 단?");

        printTable(scan.nextInt());
    }

    private static void printTable(int n){
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("%d * %d = %2d", n, i, n*i));
        }
        
    }
}
