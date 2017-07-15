package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract Label getLabel();
    protected abstract String[] getKeywords();

    public Label processText(String text) {
        return null;
    }
}
