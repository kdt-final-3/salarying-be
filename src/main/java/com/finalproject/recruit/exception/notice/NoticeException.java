package com.finalproject.recruit.exception.notice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NoticeException extends RuntimeException{
    private ErrorCode errorCode;
    private String message;
    public NoticeException(ErrorCode err) {
        this.errorCode = err;
    }

    @Override
    public String getMessage(){
        if(message == null){
            return "{" +
                    "\"state\":" + "\"" + errorCode.getStatus() + "\"" + "\n" +
                    "\t" + "\"message\":" + errorCode.getMessage() +
                    "}";
        }
        return "{" +
                "\"state\":" + "\"" + errorCode.getStatus() + "\"" + "\n" +
                "\t" + "\"message\":" + message +
                "}";
    }
}
