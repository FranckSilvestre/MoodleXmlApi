package universite.toulouse.moodlexmlapi.core.data;

import java.util.List;

/**
 * Interface representing an imported Moodle quiz
 * @author fsil
 */
public interface ImportedQuiz extends Quiz {

    /**
     * @return the count of processed questions
     */
    int getProcessedQuestionCount();

    /**
     * @return the count of extracted questions
     */
    int getExtractedQuestionCount();

    /**
     * @return the count of non extracted questions
     */
    int getNonExtractedQuestionCount();

    /**
     * @return the list of processed questions
     */
    List<Question> getProcessedQuestionList();

    /**
     * @return the list of extracted questions
     */
    List<Question> getExtractedQuestionList();

    /**
     * @return the list of non extracted questions
     */
    List<Question> getNonExtractedQuestionList();

}
