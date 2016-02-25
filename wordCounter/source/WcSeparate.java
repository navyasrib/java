public class WcSeparate {
	public String options;
	public String fileNames;

	public WcSeparate() {}
	
	public void separator(String[] arguments) {
		if(arguments.length>1) {
			this.options = arguments[0];
			this.fileNames = arguments[1];
		}
		else 
			this.fileNames = arguments[0];
	}

	public String toString() {
		return "{options: "+this.options +", fileNames: "+this.fileNames +"}";
	}
}