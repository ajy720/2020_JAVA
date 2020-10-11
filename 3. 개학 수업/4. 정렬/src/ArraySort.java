import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArraySort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇개의 랜덤 숫자를 가지고 삽입 정렬을 실시할까요?");
        int n = scanner.nextInt();

        Integer[] arr = arr_rand(n);

        System.out.println(n + "개의 숫자");
        arr_dump(arr);

        Arrays.sort(arr);
        System.out.println("오름차순 정렬 완료");
        arr_dump(arr);

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("내림차순 정렬 완료");
        arr_dump(arr);

    }

    private static Integer[] arr_rand(int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void arr_dump(Integer[] arr) {
        for (int e :
                arr) {
            System.out.printf("%2d ", e);
        }
        System.out.println("\n");
    }
}
