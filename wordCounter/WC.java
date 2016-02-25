import source.*;

class WC {
    public static void getCount(String data) {
        WCsource d = new WCsource(data);
        System.out.println("lines " + d.lineCount() + "\twords " + d.wordCount() + "\ncharacters " + d.characterCount());
    }

    public static void main(String[] args) throws Exception {
        WcSeparate commands = new WcSeparate();
        commands.separator(args);

        String fileName = commands.fileNames;
        System.out.println(fileName);

        FileInfo file = new FileInfo(fileName);
        file.getData();
        System.out.println(file.data);
    }
}