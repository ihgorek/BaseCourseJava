package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public class SpamAnalyzer
    extends KeywordAnalyzer
    implements TextAnalyzer{
    private String[]  keywords;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        int k;
        k = 0;
        for (int i = 0; i < keywords.length; i++) {
            if (text.indexOf(keywords[i]) != 0) {
                k++;
            }
        }
        if (k != 0) {
            return Label.SPAM;
        }
        else return Label.OK;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }



}
