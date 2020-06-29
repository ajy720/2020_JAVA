import java.util.Scanner;

public class ATM {
    static Scanner scan = new Scanner(System.in);
    static int bankAccount;
    int money;

    public static void main(String[] args) {
        ATM[] account = new ATM[5];

        for (int i = 0; i < 5; i++) {
            account[i] = new ATM();
        }

        while (true) {
            System.out.println("\r메뉴 선택 : 1.입금  2.출금  3.송금");
            int selectMenu = inputCheck(1, 3);
            if (selectMenu == 1) {
                System.out.println("\r계좌 선택 : A = 1  B = 2  C = 3  D = 4  E = 5");

                int select = inputCheck(1, 5) - 1;
                System.out.println("\r금액 입력 : ");
                int money = scan.nextInt();

                ATM selected = account[select];
                selected.money += money;
                bankAccount += money;

            }

//출금.
            if (selectMenu == 2) {
                System.out.println("\r계좌 선택 : A = 1  B = 2  C = 3  D = 4  E = 5");
                int select = inputCheck(1, 5) - 1;
                System.out.println("출금 할 금액 입력 : ");
                int money = scan.nextInt();

                ATM selected = account[select];

                if (money > selected.money) {
                    System.out.println("돈이 없어요");
                    break;
                }

                selected.money -= money;
                bankAccount -= money;
            }

//송금.
            if (selectMenu == 3) {
                System.out.println("\r 송금 보낼 계좌 선택 : A = 1  B = 2  C = 3  D = 4  E = 5");
                int select = inputCheck(1, 5) - 1;
                System.out.println("\r송금 할 금액 입력 : ");
                int money = scan.nextInt();

                ATM selected = account[select];

                if (money > selected.money) {
                    System.out.println("돈이 없습니다.");
                    break;
                } else {
                    selected.money -= money;
                }

                System.out.println("\r송금 받을 계좌 선택 A = 1  B = 2  C = 3  D = 4  E = 5");

                //송금 받을 계좌//
                ATM selected2 = account[inputCheck(1, 5) - 1];

                selected2.money += money;
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(String.format("%c잔액: %d", 'A' + i, account[i].money));
            }
            System.out.println("총 잔액:" + bankAccount);

        }

    }

    public static int inputCheck(int start, int end) {
        while (true) {
            int select = scan.nextInt();

            if (select >= start && select <= end) {
                return select;
            } else {
                System.out.println(String.format("%d부터 %d 사이의 값을 입력하세요.", start, end));
            }

        }
    }

}