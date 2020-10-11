public class BtoD {
    public static void convert(String bin) {
        int len = bin.length();
        int ret = 0;

        for (int i = 0; i < len; i++) {
            ret += Integer.parseInt(bin.substring(i, i+1)) * Math.pow(2, len-i-1);
        }

        System.out.println("변환된 10진수는");
        System.out.println(ret);

    }
}
