import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class PrintLabel {

    public PrintLabel() {
    }

    private static String readFile(String fileNmae) throws Exception {
        FileReader file = new FileReader(fileNmae);
        BufferedReader br = new BufferedReader(file);
        String data = "";
        String chunk;
        while ((chunk = br.readLine()) != null) {
            data += chunk + "\n";
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        String data, option, countryName = "";
        option = args[0].substring(2);
        PrintLabel p = new PrintLabel();
        Invitees invitees = new Invitees();
        if(args.length>2){
            countryName = args[1];
            data = readFile(args[2]);
        }else
            data = readFile(args[1]);
        invitees.createPerson(data);
        LabelStyles labelStyles = new LabelStyles(invitees);
        labelStyles.mapLables();
        labelStyles.mapLables(countryName);
        HashMap<String,String> userOptions = labelStyles.getLables();
        String result = userOptions.get(option);
        System.out.println(result);
    }
}
