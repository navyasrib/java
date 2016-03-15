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

    public StringBuilder generate(HashMap<String, String> lines) {
        findMaxLength(lines);
        StringBuilder top = generateTopLine();
        StringBuilder firstLine = getData(lines.get("first"));
        StringBuilder middle = generateMiddleLine();
        StringBuilder secondLine = getData(lines.get("second"));
        StringBuilder thirdLine = getData(lines.get("third"));
        StringBuilder result = new StringBuilder();
        result.append(top).append("\n").append(firstLine).append("\n").append(middle).append("\n").append(secondLine).append("\n").append(thirdLine).append("\n").append(top);
        return result;
    }

    private StringBuilder generateMiddleLine() {
        StringBuilder result = new StringBuilder();
        return result.append(vertical).append(getLine(horizontal,length)).append(vertical);
    }

    private StringBuilder getData(String first) {
        StringBuilder result = new StringBuilder();
        return result.append(vertical).append(" ").append(first).append(getLine(" ",length-result.length()+1)).append(vertical);
    }

    private void findMaxLength(HashMap<String, String> lines) {
        int a = lines.get("first").length();
        int b = lines.get("second").length();
        int c = lines.get("third").length();
        length = (a > b && a > c)? a : (b > c)? b : c;
        length += 2;
    }

    private StringBuilder generateTopLine() {
        StringBuilder result = new StringBuilder();
        return result.append(corner).append(getLine(horizontal,length)).append(corner);
    }

    private StringBuilder getLine(String symbol, int size) {
        StringBuilder result = new StringBuilder();
        for (int i=0;i<size;i++)
            result.append(symbol);
        return result;
    }
}
