import javax.swing.plaf.ProgressBarUI;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇개의 랜덤 숫자를 가지고 쉘 정렬을 실시할까요?");
        int n = scanner.nextInt();

        int[] arr = ArrUtil.arr_rand(n, 100);
//        int[] arr = {30, 50, 7, 40, 88, 15, 44, 55, 22, 33, 77, 99, 11, 66, 1, 85};


        System.out.println(n + "개의 숫자");
        ArrUtil.arr_dump(arr);

        mergeSort(arr);

        System.out.println("정렬 완료");
        ArrUtil.arr_dump(arr);


    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        mergeSort(arr, 0, n);

    }

    private static void mergeSort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;

        if (left == mid) return;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid, right);
        merge(arr, left, right);

    }

    private static void merge(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        int idx1 = left;
        int idx2 = mid;

        int[] temp = new int[right - left];
        int tempIdx = 0;

        while (idx1 < mid && idx2 < right) {
            if (arr[idx1] < arr[idx2]) temp[tempIdx++] = arr[idx1++];
            else temp[tempIdx++] = arr[idx2++];
        }

        if (idx1 == mid) while (idx2 < right) temp[tempIdx++] = arr[idx2++];
        else if (idx2 == right) while (idx1 < mid) temp[tempIdx++] = arr[idx1++];

        for (int i = 0; i < temp.length; i++) arr[left + i] = temp[i];
        
    }
}
