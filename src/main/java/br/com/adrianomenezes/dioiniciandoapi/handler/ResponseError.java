package br.com.adrianomenezes.dioiniciandoapi.handler;

import java.util.Date;


public class ResponseError {
     private Date timestamp = new Date();
     private String status = "error";
     private Integer statusCode = 400;
     private String error;

     public ResponseError() {

     }

     public Date getTimestamp() {
          return timestamp;
     }

     public ResponseError(Date timestamp, String status, Integer statusCode, String error) {
          this.timestamp = timestamp;
          this.status = status;
          this.statusCode = statusCode;
          this.error = error;
     }

     public void setTimestamp(Date timestamp) {
          this.timestamp = timestamp;
     }

     public String getStatus() {
          return status;
     }

     public void setStatus(String status) {
          this.status = status;
     }

     public Integer getStatusCode() {
          return statusCode;
     }

     public void setStatusCode(Integer statusCode) {
          this.statusCode = statusCode;
     }

     public String getError() {
          return error;
     }

     public void setError(String error) {
          this.error = error;
     }
}
