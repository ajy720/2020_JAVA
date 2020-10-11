
public class OnesComplement {
	
	// TwosComplement Class에서 재사용 하기 위해서 Static 전역변수 사용
	static int[] onesComplement;

	public static void oc(int[] bin) {
		
		// 2진수를 1의 보수로
		onesComplement = oc2(bin); 
		
		System.out.println("\r\r1의 보수는");
		Complement.print(onesComplement);
	}
	
	public static int[] oc2(int[] bin) {
		int len = bin.length;
		int[] onesComplement = new int[len];
		
		for (int i = 0; i < len; i++) {
			onesComplement[i] = 1 - bin[i];
		}
		
		return onesComplement;
	}

}
