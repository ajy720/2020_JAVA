import java.util.Scanner;

public class DBDBDIP {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("2진수 -> 10진수 : 1 | 10진수 -> 2진수 : 2");
        switch (scan.nextInt()){
            case 1:
                BtoD.convert(scan.next());
                break;
            case 2:
                DtoC.convert(scan.nextInt());
                break;
        }
    }
}
