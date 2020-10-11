public class DtoC {
    public static void convert(int n) {
        String ret = "";

        while(n>0){
            ret = (n%2) + ret;
            n /= 2;
        }

        System.out.println("변환된 2진수는");
        System.out.print(ret);
        return;
    }
}
