
public class TwosComplement {

	public static void tc(int[] bin) {
		int len = bin.length;
		int[] onesComplement = OnesComplement.onesComplement; // OnesComplement에서 가져오기
		int[] twosComplement = new int[len];
		int carry = 1;
		
		// 반가산기 원리를 이용한 2의 보수 처리기
		for (int i = len - 1; i >= 0; i--) {
			twosComplement[i] = onesComplement[i] ^ carry;
			carry = onesComplement[i] & carry;
		}
		
		System.out.println("\r\r2의 보수는");
		Complement.print(twosComplement);
	}

}
