import java.io.*;
import java.util.Scanner;

public class Login {
    static Scanner scan = new Scanner(System.in);

    static void MemberLogin(){
        System.out.println("아이디를 입력하세요.");
        String passId = scan.nextLine();

        System.out.println("비밀번호를 입력하세요.");
        String passPw = scan.nextLine();

        int pass = 0;

        File file = new File("memberDB.txt");
        try {
            FileReader fileWriter = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileWriter);
            String line = "";

            while ((line = bufferedReader.readLine()) != null){



                if(line.indexOf(passId) != -1 && line.indexOf(passPw) != -1){
                    System.out.println("로그인에 성공했습니다.");
                    pass = 1;
                }
            }
            if(pass == 0) System.out.println("로그인에 실패했습니다.");
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
