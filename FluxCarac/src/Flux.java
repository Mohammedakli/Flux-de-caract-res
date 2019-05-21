import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Flux {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("test.txt");
			int c = reader.read();
			System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
