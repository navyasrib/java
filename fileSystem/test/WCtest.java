import org.junit.Test;
import static org.junit.Assert.assertEquals;
import source.*;

public class WCtest {
	@Test
	public void line_count_should_count_no_of_lines_in_the_provided_data() {
		String data = "hello, this table is surrounded by six people including me.\nI'm sitting between shruti and supriya";
		WCsource d = new WCsource(data);
		assertEquals(1, d.lineCount());
	}
	@Test
	public void line_count_should_give_zero_if_there_are_no_lines_in_gicen_data() {
		String data = "hello world";
		WCsource d = new WCsource(data);
		assertEquals(0, d.lineCount());
	}
	@Test
	public void word_count_should_give_no_of_words_in_given_data() {
		String data = "hello, this table is surrounded by six people including \tme.\n I'm sitting between shruti and supriya";
		WCsource d = new WCsource(data);
		assertEquals(16, d.wordCount());
	}
	@Test
	public void word_count_should_give_no_of_words_in_a_line_data() {
		String data = "hello, this table  ";
		WCsource d = new WCsource(data);
		assertEquals(3, d.wordCount());
	}
	@Test
	public void character_count_should_no_of_characters_in_given_data() {
		String data = "hello, this table   ";
		WCsource d = new WCsource(data);
		assertEquals(20, d.characterCount());
	}
	@Test
	public void byte_count_should_no_of_characters_in_given_data() {
		String data = "hello, this table   \n";
		WCsource d = new WCsource(data);
		assertEquals(21, d.characterCount());
	}
}