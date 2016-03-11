import com.sun.deploy.util.StringUtils;
import design.Template;
import guest.GuestTemplate;
import guest.Guests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;

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
        String data = readFile(args[0]);
        Guests guests = Guests.parseGuests(data);
        GuestTemplate guestTemplate = new GuestTemplate(guests, new Template("title FirstNmae LastName\ncity, state\ncountry"));
        List<String> result = guestTemplate.getGuestsWithBorder();
        String output = StringUtils.join(result,"\n");
        System.out.println(output);
    }
}
