package universite.toulouse.moodlexmlapi.core.data;

import java.util.List;

/**
 * @author fsil
 */
public class GenericQuestion implements Question {

    private QuestionType questionType;
    private String name;
    private QuestionText questionText;
    private String generalFeedBack;
    private Float penalty;
    private Float defaultGrade;
    private Boolean isHidden;
    private String imageUrl;
    private String imageBase64;
    private List<QuestionError> errors;

    /**
     * @return the questionType
     */
    public QuestionType getQuestionType() {
        return questionType;
    }

    /**
     * @param newquestionType
     *            the questionType to set
     */
    public void setQuestionType(final QuestionType newquestionType) {
        this.questionType = newquestionType;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param newname
     *            the name to set
     */
    public void setName(final String newname) {
        this.name = newname;
    }

    /**
     * @return the questionText
     */
    public QuestionText getQuestionText() {
        return questionText;
    }

    /**
     * @param newquestionText
     *            the questionText to set
     */
    public void setQuestionText(final QuestionText newquestionText) {
        this.questionText = newquestionText;
    }

    /**
     * @return the generalFeedBack
     */
    public String getGeneralFeedBack() {
        return generalFeedBack;
    }

    /**
     * @param newgeneralFeedBack
     *            the generalFeedBack to set
     */
    public void setGeneralFeedBack(final String newgeneralFeedBack) {
        this.generalFeedBack = newgeneralFeedBack;
    }

    /**
     * @return the penalty
     */
    public Float getPenalty() {
        return penalty;
    }

    /**
     * @param newpenalty
     *            the penalty to set
     */
    public void setPenalty(final Float newpenalty) {
        this.penalty = newpenalty;
    }

    /**
     * @return the defaultGrade
     */
    public Float getDefaultGrade() {
        return defaultGrade;
    }

    /**
     * @param newdefaultGrade
     *            the defaultGrade to set
     */
    public void setDefaultGrade(final Float newdefaultGrade) {
        this.defaultGrade = newdefaultGrade;
    }

    /**
     * @return the isHidden
     */
    public Boolean isHidden() {
        return isHidden;
    }

    /**
     * @param newisHidden
     *            the isHidden to set
     */
    public void setIsHidden(final Boolean newisHidden) {
        this.isHidden = newisHidden;
    }

    /**
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param newimageUrl
     *            the imageUrl to set
     */
    public void setImageUrl(final String newimageUrl) {
        this.imageUrl = newimageUrl;
    }

    /**
     * @return the imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    /**
     * @param newimageBase64
     *            the imageBase64 to set
     */
    public void setImageBase64(final String newimageBase64) {
        this.imageBase64 = newimageBase64;
    }

    /**
     * @return the errors
     */
    public List<QuestionError> getErrors() {
        return errors;
    }

    /**
     * @param newerrors
     *            the errors to set
     */
    public void setErrors(final List<QuestionError> newerrors) {
        this.errors = newerrors;
    }

}
