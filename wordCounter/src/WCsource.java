public class WCsource {

	public WCsource() {

	}

	public int lineCount(String data) {
		return data.split("\n").length-1;
	}

	public int wordCount(String data) {
		return data.split("\\s+").length;
	}

	public int characterCount(String data) {
		return data.length();
	}

	public int byteCount(String data) {
		final byte[] dataBytes = data.getBytes();
		return dataBytes.length;
	}
}