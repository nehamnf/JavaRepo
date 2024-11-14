package com.myspringboot.rest01.entity;

public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, long timeStamp, String message) {
        this.status = status;
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
    @Override
    public String toString() {
        return "StudentErrorResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

}
