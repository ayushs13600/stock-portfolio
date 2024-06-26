package com.cts.authorization.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * The type Exception details.
 */
@Getter
@Setter
public class ExceptionDetails {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime timeStamp;

    private Map<String,String> errorMap;

    /**
     * Instantiates a new Exception details.
     *
     * @param timeStamp the time stamp
     * @param errorMap  the error map
     */
    public ExceptionDetails(LocalDateTime timeStamp,Map<String,String> errorMap){
        super();
        this.timeStamp = timeStamp;
        this.errorMap= errorMap;
    }
}
