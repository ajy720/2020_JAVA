import java.util.Scanner;

public class TimeTables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("몇 단?");
        int n = scan.nextInt();

        print(n);

    }

    private static void print(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
