import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*exercice*/  
public class Flux {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input = new FileInputStream("input.txt");
		FileOutputStream output = new FileOutputStream("output.txt", true);
		int c;
		while((c = input.read()) != -1) {
			output.write(c);
		}
		
		input.close();
		output.close();
	}

}
