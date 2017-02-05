package hero_app.dto;

/**
 * @author advortco
 */
public class DataDTO {

    private String description;

    public DataDTO(String description) {
        this.description = description;
    }

    public DataDTO() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
