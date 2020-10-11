import java.util.Scanner;

public class alert {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int finish_hh, finish_mm, ready_hh,ready_mm, move_hh, move_mm, wakeup_hh, wakeup_mm;
        System.out.print("기상시간을 알려드립니다 !!\r");
        System.out.print("등교시간을 입력해주세요\r");
        System.out.print("몇시 -> ");;
        finish_hh = scan.nextInt();
        System.out.print("몇분 -> ");
        finish_mm = scan.nextInt();
        System.out.print("준비시간을 입력해주세요\r");
        System.out.print("몇시 -> ");
        ready_hh = scan.nextInt();
        System.out.print("몇분 -> ");
        ready_mm = scan.nextInt();
        System.out.println("이동시간을 입력해주세요\r");
        System.out.print("몇시 -> ");
        move_hh = scan.nextInt();
        System.out.print("몇분 -> ");
        move_mm = scan.nextInt();

        wakeup_hh = finish_hh - ready_hh;
        if(finish_mm < ready_mm) {
            wakeup_mm = ready_mm - finish_mm;
            wakeup_mm = (int)60 - wakeup_mm;
            wakeup_hh --;
        }
        else wakeup_mm = finish_mm - ready_mm;
        wakeup_hh = wakeup_hh - move_hh;
        if(wakeup_mm < move_mm) {
            wakeup_mm = move_mm - wakeup_mm;
            wakeup_mm = (int)60 - wakeup_mm;
            wakeup_hh --;
        }
        else wakeup_mm = wakeup_mm - move_mm;

        System.out.print("기상시간은 ");
        System.out.print(wakeup_hh+" : ");
        System.out.print(wakeup_mm);
    }
}
