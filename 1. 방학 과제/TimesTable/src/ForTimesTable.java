public class ForTimesTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			System.out.println(String.format("\n %d단", i));
			for(int j=1; j<10; j++) {
				System.out.println(String.format("%d * %d = %d", i, j, i*j));
			}
		}
	}

}
