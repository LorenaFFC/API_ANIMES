package academy.devdojo.springboot2.exception;

import java.time.LocalDateTime;

public class BadRequestExceptDetails extends ExceptionDetails{


    public BadRequestExceptDetails(String title, int status, String details, String developerMessage, LocalDateTime timestamp) {
        super(title, status, details, developerMessage, timestamp);
    }



}
    /* private String  title;
    private int status;
    private String details;
    private String developerMessage;
    private LocalDateTime timestamp;

    public BadRequestExceptDetails() {
    }

    public BadRequestExceptDetails(String title, int status, String details, String developerMessage, LocalDateTime timestamp) {
        this.title = title;
        this.status = status;
        this.details = details;
        this.developerMessage = developerMessage;
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }*/


