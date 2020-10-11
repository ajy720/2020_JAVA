import java.util.Scanner;

public class Crypto {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("복호화 : 1 | 암호화 : 2");
        switch (scanner.nextInt()){
            case 1:
                System.out.printf("복호화 할 메세지를 입력하세요.");
                encrypto(scanner.next());
                break;
            case 2:
                System.out.println("");
                break;
            default:
                break;
        }


    }

    private static void encrypto(String s) {
    }
}
