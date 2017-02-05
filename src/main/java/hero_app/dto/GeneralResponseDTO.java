package hero_app.dto;


public class GeneralResponseDTO {

    private String status;
    private Object data;
    private String error = "";

    public GeneralResponseDTO(Object data) {
        this.status = "success";
        this.data = data;
        this.error = "";
    }

    public GeneralResponseDTO(String error) {
        this.status = "failure";
        this.error = error;
        this.data = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
