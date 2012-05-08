package universite.toulouse.moodlexmlapi.core.data;
/**
 * A question error
 * @author fsil
 *
 */
public class QuestionError {

    private String code;
    private String description;

    /**
     * Create a question error object
     * @param newcode the code
     * @param newdescription the description
     */
    public QuestionError(final String newcode, final String newdescription) {
        this.code = newcode;
        this.description = newdescription;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}
