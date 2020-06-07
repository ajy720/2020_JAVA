import javax.management.ObjectName;

public class TwosComplement {
    public static int[] tc(int[] binary) {
        int[] ones = OnesComplement.oc(binary);
        int[] twos = new int[binary.length];
        int carry = 1;

        for (int i = binary.length-1; i >= 0 ; i--) {
            twos[i] = ones[i] ^ carry;
            carry = ones[i] & carry;
        }

        return twos;
    }
}
