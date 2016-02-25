import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WcSeparateTest {
	@Test
	public void Should_separate_the_file_names_and_options() {
		WcSeparate a = new WcSeparate();
		String[] args = {"-l", "a.txt"};
		a.separator(args);
		assertEquals("{options: -l, fileNames: a.txt}",a.toString());
	}
	@Test
	public void Should_give_file_name_when_there_are_no_options() {
		WcSeparate a = new WcSeparate();
		String[] args = {"a.txt"};
		a.separator(args);
		assertEquals("{options: null, fileNames: a.txt}",a.toString());
	}
}