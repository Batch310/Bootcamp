package id.bootcamp.java310.dog_service.utils.response;


public class NotFound {
    public String status;
    public String message;
    public int code;

    public NotFound(String status, String message, int code) {
        this.status = status;
        this.message = message;
        this.code = code;
    }

}
