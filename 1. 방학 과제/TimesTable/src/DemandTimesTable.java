import java.util.Scanner;

public class DemandTimesTable {
	public static void main(String[] args) {
		int key;
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 몇 단을 출력할까요?");
		
		key = scan.nextInt();
		scan.close();
		
		printTimesTable(key);
	}
	
	private static void printTimesTable(int step) {
		System.out.println(String.format("\n %d단", step));
		for(int j=1; j<10; j++) {
			System.out.println(String.format("%d * %d = %d", step, j, step*j));
		}
	}
}
