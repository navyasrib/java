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

    private static String LastFirst(Orderize o) {
        return o.getLastFirstNames();
    }

    public HashMap<String, String> getAllFunctions(Orderize o) {
        HashMap<String, String> functions = new HashMap<>();
        functions.put("lastFirst", LastFirst(o));
        return functions;
    }

    public static void main(String[] args) throws Exception {
        String data = readFile(args[1]);
        Orderize o = new Orderize();
        o.createPerson(data);
        PrintLabel p = new PrintLabel();
        String functionName = args[0].substring(2);
        HashMap<String, String> functionallities = p.getAllFunctions(o);
        String result = functionallities.get(functionName);
        System.out.println("Names of all guests in last name first format:\n" + result);
    }
}
