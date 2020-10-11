import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("첫번째 숫자 : ");
        int a = scan.nextInt();
        System.out.println("두번째 숫자 : ");
        int b = scan.nextInt();

        System.out.println(String.format("덧셈 => %d + %d = %d", a, b, a+b));
        System.out.println(String.format("뺄셈 => %d - %d = %d", a, b, a-b));
        System.out.println(String.format("곱셈 => %d * %d = %d", a, b, a*b));
        System.out.println(String.format("나눗셈 => %d / %d = %d", a, b, a/b));
        System.out.println(String.format("나머지 => %d %% %d = %d", a, b, a%b));
    }
}
