import java.util.Scanner;

public class CheckObesity {

	public static void main(String[] args) {		
		float height, weight;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 키는 몇 cm 입니까? : ");
		height = sc.nextFloat();

		System.out.println("당신의 몸무게는 몇 kg 입니까? : ");
		weight = sc.nextFloat();
		
		float bmi = weight/((height*height)/10000);
		
		if(bmi >= 30) System.out.println("당신은 고도비만입니다.");
		else if(bmi >= 25) System.out.println("당신은 비만입니다.");
		else if(bmi >= 23) System.out.println("당신은 과체중입니다.");
		else if(bmi >= 18.5) System.out.println("당신은 정상입니다.");
		else System.out.println("당신은 저체중입니다.");
		
		
	}

}
