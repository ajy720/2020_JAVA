public class ParameterTimesTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			printTimesTable(i);
		}
	}

	private static void printTimesTable(int step) {
		System.out.println(String.format("\n %d단", step));
		for(int j=1; j<10; j++) {
			System.out.println(String.format("%d * %d = %d", step, j, step*j));
		}
	}
}
