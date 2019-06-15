import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/*Flux exercice*/  
public class Flux {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileInputStream input = new FileInputStream("input.txt");
		FileOutputStream output = new FileOutputStream("output.txt", true);
		int c;
		while((c = input.read()) != -1) {
			output.write(c);
		}
		Path example = Paths.get("input.txt").toAbsolutePath(); 
		System.out.println(example.getParent());
		input.close();
		output.close();*/
		
		/**System.out.println(args[0]);
		
		if(args[0].equals("10")){
			for(int i = 0; i < Integer.parseInt(args[0]); i++) {
				//File f = File.createTempFile(i+"test",".txt");
				File f = new File(i+".txt");
				f.createNewFile();
				System.out.println(f.getAbsolutePath());
			}
		}**/
		
		String[] tab = new String[4];
		BufferedReader bufferedReader = new BufferedReader(new FileReader("doublons.txt"));
		String line;
		int a = 0;
		for (int i = 0; i < tab.length; i++) {
			tab[i] = "";
		}
		while((line = bufferedReader.readLine()) != null) {
			for(int i = 0; i < tab.length; i++) {
				if(tab[i].equals(line)){
					break;
				}
				else {
					tab[a] = line;
					a++;
					break;
				}
			}
			if(a >= 4) {
				a =0;
			}
		}
		
		FileOutputStream output = new FileOutputStream("doublons.txt", true);
		for(int i = 0; i < tab.length; i++) {
			byte[] c = tab[i].getBytes();
			output.write(c);
		}
		output.close();
		
	}
	

}
