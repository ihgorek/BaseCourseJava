package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {

    abstract Label getLabel();
    abstract String[] getKeywords();



}
