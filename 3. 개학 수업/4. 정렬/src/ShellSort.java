import java.util.Scanner;

public class ShellSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("몇개의 랜덤 숫자를 가지고 쉘 정렬을 실시할까요?");
        int n = scanner.nextInt();

        int[] arr = ArrUtil.arr_rand(n);

        System.out.println(n + "개의 숫자");
        ArrUtil.arr_dump(arr);


        for (int term = n/2; term > 0; term/=2) {
            if(term%2==0) term += 1;

            for (int k = 0; k < term; k++) {
                // 시작지점이 k, 간극이 term인 삽입 정렬
                for (int i = k; i < n; i += term) {
                    int value = arr[i];
                    int j;
                    for (j = i - term; j >= 0 && value < arr[j]; j -= term) {
                        arr[j + term] = arr[j];
                    }
                    arr[j + term] = value;
                }
            }


            System.out.printf("term: %2d 정렬 완료\n", term);
            ArrUtil.arr_dump(arr);
        }


        System.out.println("정렬 완료");
        ArrUtil.arr_dump(arr);

    }
}

