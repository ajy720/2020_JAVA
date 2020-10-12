import java.util.Scanner;

public class compareSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇개의 숫자를 가지고 정렬을 비교할까요?");
        int n = scanner.nextInt();

        int[] arr;
        arr = ArrUtil.arr_rand(n, n);

        System.out.println("숫자들");
//        ArrUtil.arr_dump(arr);

        int[] arr_insert = arr.clone();
        int[] arr_array = arr.clone();
        int[] arr_shell = arr.clone();

        for (int i = 0; i < 3; i++) {
            long start = System.currentTimeMillis();
            switch (i) {
                case 0:
                    System.out.print("쉘정렬 ");
                    ShellSort.shellSort(arr_shell);
                    break;
                case 1:
                    System.out.print("자바정렬 ");
                    ArraySort.arraySort(arr_array);
                    break;
                case 2:
                    System.out.print("삽입정렬 ");
                    InsertSort.insertSort(arr_insert);
                    break;

            }
            long end = System.currentTimeMillis();

            System.out.println((end - start) + "밀리초");
        }
    }
}
