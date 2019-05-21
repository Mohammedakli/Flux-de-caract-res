import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Flux {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File in = new File("input.txt");
		File out = new File("output.txt");
		FileReader reader = new FileReader(in);
		FileWriter writer = new FileWriter(out, true);
		int c;
		while((c = reader.read()) != -1) {
			writer.write(c);
		}
		reader.close();
		writer.close();
	}

}
