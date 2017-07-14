package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public class NegativeTextAnalyzer
    extends KeywordAnalyzer
    implements TextAnalyzer {

    private String[] keywords = {":)","=(",":|"};


    public NegativeTextAnalyzer() {
    }

    @Override
    public Label processText(String text) {
        int k = 0;
        for (int i = 0; i < keywords.length; i++){
            if (text.indexOf(keywords[i]) != 0){
                k++;
            }
        }
        if (k != 0){
            return Label.NEGATIVE_TEXT;
        }
        else {
            return Label.OK;
        }
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

