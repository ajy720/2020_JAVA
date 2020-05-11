import java.io.*;
import java.util.Scanner;

public class Login {

    static Scanner scan = new Scanner(System.in);

    public static void Login() {
        int pass = 0;
        System.out.println("Login을 위해 ID와 PW를 입력하세요.");

        System.out.println("ID 입력 :");
        String id = scan.nextLine();

        System.out.println("PW 입력 :");
        String pw = scan.nextLine();

        File file = new File("MemberDB.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                int passID = line.indexOf(id);
                int passPW = line.indexOf(pw);

                System.out.println(passID + "\t" + passPW);

                if(passID!=-1 && passPW!=-1){
                    System.out.println("로그인 성공");
                    pass = 1;
                }

            }
            if(pass==0) System.out.println("로그인 실패");
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

