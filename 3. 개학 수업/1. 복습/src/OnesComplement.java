public class OnesComplement {
    public static int[] oc(int[] binary) {
        int[] ones = new int[binary.length];

        for (int i = 0; i < binary.length; i++) ones[i] = binary[i] == 1 ? 0 : 1;

        return ones;
    }
}
