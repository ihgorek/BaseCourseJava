package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public class NegativeTextAnalyzer
        extends KeywordAnalyzer
        implements TextAnalyzer {

    public NegativeTextAnalyzer() {
    }
    private String[] keywords = new String[] {":(","=(",":|"};

    @Override
    public Label processText(String text) {
        int k = 0;
        for (int i = 0; i < keywords.length; i++){
            if(text.contains(keywords[i]))k++;
        }
        if(k!=0)return Label.NEGATIVE_TEXT;
        else return Label.OK;
    }


    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

}
