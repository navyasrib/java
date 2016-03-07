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
        userOptions.put("getCountry", o.getGuestsByCountry(countryName));
    }


    public static void main(String[] args) throws Exception {
        String data, option, countryName = null;
        option = args[0].substring(2);
        PrintLabel p = new PrintLabel();
        Orderize o = new Orderize();
        countryName = (args.length>2)? args[1] : "";
        data = (args.length>2)? readFile(args[2]) : readFile(args[1]);
        o.createPerson(data);
        p.getAllFunctions(o);
        String result = p.userOptions.get(option);
        p.getAllFunctions(o,countryName);
        result = p.userOptions.get(option);
        System.out.println(result);

    }
}
