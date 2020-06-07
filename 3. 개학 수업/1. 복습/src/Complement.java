import java.util.Scanner;

public class Complement {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("변환할 2진수를 입력하세요.");
        String binary = scan.nextLine();

        int len = binary.length();
        int[] bin = new int[len];

        for (int i = 0; i < len; i++) bin[i] = Integer.parseInt(binary.substring(i, i+1));


        print(OnesComplement.oc(bin));

        print(TwosComplement.tc(bin));
    }

    public static void print(int[] bin){
        for (int i = 0; i < bin.length; i++) System.out.print(bin[i] + " ");
        System.out.println('\n');
    }
}
