package universite.toulouse.moodlexmlapi.core.data;

/**
 * @author fsil
 */
public class QuestionText {

    private String text;
    private QuestionTextFormat questionTextFormat;

    /**
     * Construct a question text
     * @param newtext
     *            the text
     * @param newquestionTextFormat
     *            the text format
     */
    public QuestionText(final String newtext, 
            final QuestionTextFormat newquestionTextFormat) {
        this.text = newtext;
        this.questionTextFormat = newquestionTextFormat;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @return the questionTextFormat
     */
    public QuestionTextFormat getQuestionTextFormat() {
        return questionTextFormat;
    }

}
