package theater;

/**
 * Class representing a play.
 *
 * <p>Contains the play's name and type (e.g., tragedy, comedy).</p>
 */
public class Play {

    private String name;
    private String type;
    /**
     * Constructor for Play.
     *
     * @param name the name of the play, cannot be null
     * @param type the type of the play, cannot be null
     */

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
