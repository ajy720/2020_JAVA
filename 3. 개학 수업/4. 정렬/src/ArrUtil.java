public class ArrUtil {
    public static int[] arr_rand(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        return arr;
    }

    public static void arr_dump(int[] arr) {
        for (int e :
                arr) {
            System.out.printf("%2d ", e);
        }
        System.out.println();
    }

}
