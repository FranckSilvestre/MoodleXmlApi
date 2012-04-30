package universite.toulouse.moodlexmlapi.core;
/**
 * Class representing an invalid quiz format error
 * @author fsil
 */
public class InvalidQuizFormatException extends Exception {

    /**
     * Construct an invalid quiz exception
     * @param parentException the parent exception
     */
    public InvalidQuizFormatException(final Throwable parentException) {
        super("invalidQuizFormat", parentException);
    }

}
