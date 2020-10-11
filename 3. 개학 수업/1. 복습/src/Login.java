import java.io.*;
import java.util.Scanner;

public class Login {
    static Scanner scan = LoginManager.scan;
    static File memberDB = LoginManager.memberDB;

    public static void login() {
        System.out.println("-----로그인-----");
        System.out.println("아이디를 입력하세요.");
        String passId = scan.next();

        System.out.println("비밀번호를 입력하세요.");
        String passPw = scan.next();

        try {
            FileReader fileReader = new FileReader(memberDB);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while((line = bufferedReader.readLine()) != null){
                if(line.indexOf(passId) != -1 && line.indexOf(passPw) != -1){
                    System.out.println("로그인에 성공하셨습니다.");
                    bufferedReader.close();
                    return;
                }
            }
            System.out.println("로그인에 실패하셨습니다.");
            bufferedReader.close();
            return;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
