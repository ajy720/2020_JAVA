import java.util.Scanner;

public class CharCounter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�޸��忡 �ڼҼ��� �Է��Ͻø� ���ڼ��� �����ݴϴ�.");
		System.out.println("������ ������ �����ϰ� â�� �ݾ��ּ���.");
		DirectTyping.inputString();
		
		System.out.println("���ڼ��� ���÷��� ���� 1�� �����ּ���.");
		
		if(scan.nextInt() == 1) {
			FileReadChar.countChar();
		}else {
			System.out.println("���� 1�� ������ �ʾƼ� ����˴ϴ�.");
			scan.close();
		}
		
	}

}
