import java.util.Scanner;

public class AddTime {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("지금 시간은 오전 10시입니다.");
        System.out.println("몇 시간 후의 시간을 알려드릴까요?");
        int time = 10 + scanner.nextInt();

        System.out.println(String.format("%s %d시", ((time%24)/12 == 1 ? "오후" : "오전"), time%12));

    }
}
