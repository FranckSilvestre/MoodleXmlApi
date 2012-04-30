package universite.toulouse.moodlexmlapi.core.data;

import java.util.List;

/**
 * Interface representing a Moodle question
 * @author fsil
 */
public interface Question {

    /**
     * @return the question type
     */
    QuestionType getQuestionType();

    /**
     * @return the question name
     */
    String getName();

    /**
     * @return the question text
     */
    QuestionText getQuestionText();

    /**
     * @return the general feedback
     */
    String getGeneralFeedBack();

    /**
     * @return the penalty
     */
    Float getPenalty();

    /**
     * @return the default grade
     */
    Float getDefaultGrade();

    /**
     * @return true if the question was hidden in the quiz
     */
    Boolean isHidden();

    /**
     * @return the url image if exists
     */
    String getImageUrl();

    /**
     * @return the base 64 encoded string of the image
     */
    String getImageBase64();

    /**
     * @return the list of errors associated with the current question
     */
    List<QuestionError> getErrors();

}
