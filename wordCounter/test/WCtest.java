import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCtest {
    @Test
    public void line_count_should_count_no_of_lines_in_the_provided_data() {
        String data = "hello\nI'm";
        WCsource d = new WCsource();
        assertEquals(1, d.lineCount(data));
    }

    @Test
    public void line_count_should_give_zero_if_there_are_no_lines_in_gicen_data() {
        String data = "hello world";
        WCsource d = new WCsource();
        assertEquals(0, d.lineCount(data));
    }

    @Test
    public void word_count_should_give_no_of_words_in_given_data() {
        String data = "hello\n I'm";
        WCsource d = new WCsource();
        assertEquals(2, d.wordCount(data));
    }

    @Test
    public void word_count_should_give_no_of_words_in_a_line_data() {
        String data = "hello, this table  ";
        WCsource d = new WCsource();
        assertEquals(3, d.wordCount(data));
    }

    @Test
    public void character_count_should_no_of_characters_in_given_data() {
        String data = "hello, this table   ";
        WCsource d = new WCsource();
        assertEquals(20, d.characterCount(data));
    }

    @Test
    public void byte_count_should_no_of_characters_in_given_data() {
        String data = "hello, this table   \n";
        WCsource d = new WCsource();
        assertEquals(21, d.characterCount(data));
    }
}
