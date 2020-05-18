import java.io.*;
import java.util.Scanner;

public class ATM {
    static Scanner scan = new Scanner(System.in);
    static int curAccount;
    static int bankAccount;
    static File accountFile;
    static ATM[] users = new ATM[5];

    int account;

    public static void main(String[] args) {
        constructor();

        do{
            System.out.println("사용자 계좌 선택 : 1~5, 종료 : 0");
            curAccount = scan.nextInt()-1;

            if(curAccount == -1){
                System.out.println("종료합니다.");
                destructor();
                return;
            }

            System.out.println("\r메뉴 선택 : 1.입금 2.출금 3.송금");
            switch (scan.nextInt()){
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    remit();
                    break;
            }
        }while (true);
    }

    private static void constructor() {
        accountFile = new File("Account.txt");

        if(!accountFile.exists()){
            try {
                FileWriter fileWriter = new FileWriter(accountFile);
                for(int i=0; i<users.length; i++) {
                    fileWriter.write("0\n");
                }
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileReader fileReader = new FileReader(accountFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i=0; i<users.length; i++){
                users[i] = new ATM();
                users[i].account = Integer.parseInt(bufferedReader.readLine());
            }

            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void destructor() {
        try {
            FileWriter fileWriter = new FileWriter(accountFile);

            for(int i=0; i<users.length; i++){
                fileWriter.write(Integer.toString(users[i].account)+'\n');
            }

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deposit() {
        System.out.println("입금할 금액 입력 : ");
        int money = scan.nextInt();
        users[curAccount].account += money;
        bankAccount += money;

        printAccount();
    }

    private static void withdraw() {
        System.out.println("출금할 금액 입력 : ");
        int money = scan.nextInt();

        if(users[curAccount].account < money){
            System.out.println("삐빅. 잔액이 부족합니다.");
            System.out.println("메뉴 화면으로 돌아갑니다.");
        }
        else{
            users[curAccount].account -= money;
            bankAccount -= money;
            printAccount();
        }
    }

    private static void remit() {
        System.out.println("송금할 계좌 입력 : ");
        int toAccount = scan.nextInt()-1;

        System.out.println("송금할 금액 입력 : ");
        int money = scan.nextInt();

        if(users[curAccount].account < money){
            System.out.println("삐빅. 잔액이 부족합니다.");
            System.out.println("메뉴 화면으로 돌아갑니다.");
        }
        else {
            users[curAccount].account -= money;
            users[toAccount].account += money;
        }

        printAccount();
    }

    private static void printAccount() {
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + "번 계좌 잔액 : " + users[i].account);
        }

        System.out.println("총 잔액 : " + bankAccount);
    }
}
