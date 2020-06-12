import java.util.Scanner;

public class Candy {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("얼마치 사실거에요?");
        int money = scan.nextInt();

        System.out.println(String.format("%d원이면... 음... %d개(3 + 1) 구매하시고 %d원 남네요.", money, (money/300)+(money/300)/3, money%300));

    }
}
