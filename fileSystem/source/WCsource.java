package source;

public class WCsource {
	private final String data;

	public WCsource(String text) {
		data = text;
	}

	public int lineCount() {
		return data.split("\n").length-1;
	}

	public int wordCount() {
		String[] modifiedData = data.split("\\s+");
		int count = 0;
		for (int i=0; i<modifiedData.length; i++)
			if (modifiedData[i] != "") count++;
		return count;
	}

	public int characterCount() {
		return data.length();
	}

	public int byteCount() {
		final byte[] dataBytes = data.getBytes();
		return dataBytes.length;
	}
}