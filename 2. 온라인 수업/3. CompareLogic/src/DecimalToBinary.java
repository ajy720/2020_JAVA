
public class DecimalToBinary {

	public static String DToB(int decimal) {
		String ret = "";
		while(decimal > 0) {
			ret = (decimal % 2) + ret;
			decimal /= 2;
		}
		
		return ret;
	}
	
}
