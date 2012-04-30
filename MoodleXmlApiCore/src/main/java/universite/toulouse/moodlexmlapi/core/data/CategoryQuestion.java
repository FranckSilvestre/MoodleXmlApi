package universite.toulouse.moodlexmlapi.core.data;

import java.util.List;

/**
 * Class representing the dummy question of type category
 * @author fsil
 */
final public class CategoryQuestion implements Question {

    /**
     * the category
     */
    private String category;
    /**
     * the course
     */
    private String course;

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param newCategory
     *            the category to set
     */
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param newCourse
     *            the course to set
     */
    public void setCourse(final String newCourse) {
        this.course = newCourse;
    }

    /**
     * @see
     * universite.toulouse.moodlexmlapi.core.data.Question#getQuestionType()
     * @return the category
     */
    public QuestionType getQuestionType() {
        return QuestionType.category;
    }

    /**
     * @see universite.toulouse.moodlexmlapi.core.data.Question#getName()
     * return null
     */
    public String getName() {
        return null;
    }

    /**
     * @see
     * universite.toulouse.moodlexmlapi.core.data.Question#getQuestionText()
     * @return null
     */
    public QuestionText getQuestionText() {
        return null;
    }

    /**
     * @see
     * universite.toulouse.moodlexmlapi.core.data.Question#getGeneralFeedBack()
     * @return null
     */
    public String getGeneralFeedBack() {
        return null;
    }

    /**
     * @see universite.toulouse.moodlexmlapi.core.data.Question#getPenalty()
     * @return null
     */
    public Float getPenalty() {
        return null;
    }

    /**
     * @see 
     * universite.toulouse.moodlexmlapi.core.data.Question#getDefaultGrade()
     * @return null
     */
    public Float getDefaultGrade() {
        return null;
    }

    /**
     * @see universite.toulouse.moodlexmlapi.core.data.Question#isHidden()
     * @return null
     */
    public Boolean isHidden() {
        return null;
    }

    /**
     * @see universite.toulouse.moodlexmlapi.core.data.Question#getImageUrl()
     * @return null
     */
    public String getImageUrl() {
        return null;
    }

    /**
     * @see 
     * universite.toulouse.moodlexmlapi.core.data.Question#getImageBase64()
     * @return null
     */
    public String getImageBase64() {
        return null;
    }

    /**
     * @see universite.toulouse.moodlexmlapi.core.data.Question#getErrors()
     * @return null
     */
    public List<QuestionError> getErrors() {
        return null;
    }

}
