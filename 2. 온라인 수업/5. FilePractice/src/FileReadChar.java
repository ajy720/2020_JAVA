import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Struct;

public class FileReadChar {

	public static void countChar() {
		int charChar = 0;
		int charCnt = 0;
		int spaceCnt = 0;
		int lineCnt = 0;
		
		try {
			FileReader filereader = new FileReader("Test.txt");
			while((charChar = filereader.read()) != -1) {
				switch (charChar) {
				case 13: lineCnt++; break;
				case 32: spaceCnt++; break;
				case 10: break;
				default: charCnt++; break;
				}
			}
			System.out.println("문자 수 : " + charCnt);
			System.out.println("공백 수 : " + spaceCnt);
			System.out.println("공백 포함 문자 수 : " + (spaceCnt + charCnt));
			System.out.println("개행 수 : " + lineCnt);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
