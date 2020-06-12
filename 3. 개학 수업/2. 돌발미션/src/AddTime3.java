import java.util.Scanner;

public class AddTime3 {
    static Scanner scanner = new Scanner(System.in);
    static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        System.out.println("오늘은 6월 30일, 지금 시간은 오전 10시입니다.");
        System.out.println("몇 시간 후의 시간을 알려드릴까요?");
        int time = 10 + scanner.nextInt();
        int date = 30 + time/24;

        int nowMonth = 6;
        while(date - month[nowMonth%12] > 0){
            date -= month[nowMonth%12];
            nowMonth++;
        }


        System.out.println(String.format("%d월 %d일 %s %d시", nowMonth, date,((time%24)/12 == 1 ? "오후" : "오전"), time%12));
    }
}