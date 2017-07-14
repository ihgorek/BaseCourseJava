package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public interface TextAnalyzer {

    Label processText(String text);

}

enum Label {

    SPAM, NEGATIVE_TEXT, TOO_LONG, OK

}
