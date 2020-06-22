import java.util.Scanner;

public class Candy2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇 개 사실거에요?");
        int n = scanner.nextInt();

        System.out.println(String.format("%d개 사실거면... 음... %d원 필요합니다.", n, (n/4)*900+(n%4)*300));
    }
}
