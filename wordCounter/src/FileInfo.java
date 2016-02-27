import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileInfo {
    public String fileName;
    public String data;

    public FileInfo(String name) {
        this.fileName = name;
    }

    public void getData() throws Exception {
        File fileName = new File(this.fileName);
        FileReader readFile = new FileReader(fileName);
        BufferedReader buffer = new BufferedReader(readFile);
        String chunk = "";
        String tempData = chunk;
        while ((chunk = buffer.readLine()) != null) {
            tempData += chunk + "\n";
        }
        readFile.close();
        this.data = tempData;
    }
}