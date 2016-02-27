public class WcMethods {
	private int l,w,c;
	private String file;
	public WcMethods() {}

	public void operate(String data, String fileName) {
		this.file = fileName;
		WCsource count = new WCsource();
		l = count.lineCount(data);
		w = count.wordCount(data);
		c = count.characterCount(data);
	}

	public String toString() {
		return l+"	"+w+"	"+c+"	"+file;
	}

	public boolean equals(Object other) {
		WcMethods another = (WcMethods) other;
		return this.file==another.file && this.l==another.l && this.w==another.w && this.c==another.c;
	}

}
