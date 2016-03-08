import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class PrintLabel {

    HashMap<String, String> userOptions = new HashMap<>();

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


    public void getAllFunctions(Orderize o) {
        userOptions.put("lastFirst", "Names of all guests in last name first format:\n" + o.getLastFirstNames());
        userOptions.put("firstLast", "Names of all guests in first name first format:\n" + o.getFitstLastNames());
    }

    public void getAllFunctions(Orderize o, String countryName) {
        userOptions.put("firstCountry", o.getGuestsByCountry(countryName));
    }


    public static void main(String[] args) throws Exception {
        String data, option, countryName = "";
        option = args[0].substring(2);
        PrintLabel p = new PrintLabel();
        Orderize o = new Orderize();
        if(args.length>2){
            countryName = args[1];
            data = readFile(args[2]);
        }else
            data = readFile(args[1]);
        o.createPerson(data);
        p.getAllFunctions(o);
        p.getAllFunctions(o,countryName);
        String result = p.userOptions.get(option);
        System.out.println(result);
    }
}
