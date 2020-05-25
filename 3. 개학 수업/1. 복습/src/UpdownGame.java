import java.util.Scanner;

public class UpdownGame {
    private static int rand;
    private static int CHANCE = 10;
    public static void main(String[] args) {
        System.out.println("게임을 시작합니다. 기회는 " + CHANCE + "번");
        rand = (int) (Math.random() * 1000);
        Scanner scan = new Scanner(System.in);
//        System.out.println(rand);

        for (int i = 0; i < CHANCE; i++) {
            if(check(scan.nextInt())){
                System.out.println("성공!");
                return;
            }
            System.out.println((CHANCE-i-1) +"번 남았습니다.");
        }
        System.out.println("실패");
    }

    private static boolean check(int in) {
        if(in > rand){
            System.out.println("DOWN!");
        }
        else if(in < rand){
            System.out.println("UP!");
        }
        else{
            return true;
        }
        return false;
    }
}
