package design;

import java.util.HashMap;
import java.lang.String;

public class BorderRepresentation {
    private final String corner;
    private final String horizontal;
    private final String vertical;
    private int length;

    public BorderRepresentation(String corner, String horizontal, String vertical) {
        this.corner = corner;
        this.horizontal = horizontal;
        this.vertical    = vertical ;
    }

    public String generate(HashMap<String, String> lines) {
        findMaxLength(lines);
        String top = generateTopLine();
        String firstLine = getData(lines.get("first"));
        String middle = generateMiddleLine();
        String secondLine = getData(lines.get("second"));
        String thirdLine = getData(lines.get("third"));
        return String.format("%s\n%s\n%s\n%s\n%s\n%s",top,firstLine,middle,secondLine,thirdLine,top);
    }

    private String generateMiddleLine() {
        String result = "";
        result = result.concat(vertical);
        result = result.concat(getLine(horizontal,length));
        result = result.concat(vertical);
        return result;
    }

    private String getData(String first) {
        String result = "";
        result = result.concat(vertical);
        result = result.concat(" ");
        result = result.concat(first);
        result = result.concat(getLine(" ",length-result.length()+1));
        result = result.concat(vertical);
        return result;
    }

    private void findMaxLength(HashMap<String, String> lines) {
        int a = lines.get("first").length();
        int b = lines.get("second").length();
        int c = lines.get("third").length();
        length = (a > b && a > c)? a : (b > c)? b : c;
        length += 2;
    }

    private String generateTopLine() {
        String result = "";
        result = result.concat(corner);
        result = result.concat(getLine(horizontal,length));
        result = result.concat(corner);
        return result;
    }

    private String getLine(String symbol, int size) {
        String result = "";
        for (int i=0;i<size;i++)
            result = result.concat(symbol);
        return result;
    }
}
