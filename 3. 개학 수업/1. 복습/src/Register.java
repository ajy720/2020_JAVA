import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Register {
    static Scanner scan = LoginManager.scan;
    static File memberDB = LoginManager.memberDB;

    public static void join() {
        System.out.println("-----회원가입-----");

        try {
            FileWriter fileWriter = new FileWriter(memberDB, true);

            System.out.println("아이디를 입력하세요.");
            fileWriter.append(scan.next() + '\t');

            System.out.println("비밀번호를 입력하세요.");
            fileWriter.append(scan.next() + '\n');

            fileWriter.close();

            System.out.println("회원가입에 성공했습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
