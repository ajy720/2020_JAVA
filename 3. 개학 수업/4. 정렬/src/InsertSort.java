import java.util.Scanner;


public class InsertSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇개의 랜덤 숫자를 가지고 삽입 정렬을 실시할까요?");
        int n = scanner.nextInt();

        int[] arr = ArrUtil.arr_rand(n, 10000);

        System.out.println(n + "개의 숫자");
        ArrUtil.arr_dump(arr);

        insertSort(arr);

        System.out.println("정렬 완료");
        ArrUtil.arr_dump(arr);

    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j;

            for (j = i - 1; j >= 0 && value < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = value;
        }
    }
}
