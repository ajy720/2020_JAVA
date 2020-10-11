
public class BinaryToDecimal {
	public static int BToD(String binary) {
		int ret = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			ret += Integer.parseInt(binary.substring(i, i+1)) * (int)Math.pow(2, binary.length()-i-1);
		}
		
		return ret;
	}
}
