import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import source.*;

class WC {
	public static void getCount(String data) {
		WCsource d = new WCsource(data);
		System.out.println("lines "+d.lineCount()+"\twords "+d.wordCount()+"\ncharacters "+d.characterCount());
	}

	public static void main(String[] args) throws Exception {
		File fileName = new File(args[0]);
		FileReader readFile = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(readFile);
		String chunk = "";
		String data = chunk;
		while((chunk=buffer.readLine())!=null) {
			data += chunk + "\n";
		};
		readFile.close();
		System.out.println(data);

		getCount(data);
	}
}