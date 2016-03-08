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


    public void getAllFunctions(Invitees o) {
        userOptions.put("lastFirst", "Names of all guests in last name first format:\n" + o.getLastFirstNames());
        userOptions.put("firstLast", "Names of all guests in first name first format:\n" + o.getFitstLastNames());
    }

    public void getAllFunctions(Invitees o, String countryName) {
        userOptions.put("firstCountry", "Guests from "+countryName+" are:\n"+o.getGuestsFirstLastCountry(countryName));
        userOptions.put("lastCountry", "Guests from "+countryName+" are:\n"+o.getGuestsByLastFirstCountry(countryName));
    }


    public static void main(String[] args) throws Exception {
        String data, option, countryName = "";
        option = args[0].substring(2);
        PrintLabel p = new PrintLabel();
        Invitees o = new Invitees();
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
