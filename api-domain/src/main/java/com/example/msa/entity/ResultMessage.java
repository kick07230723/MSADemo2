package com.example.msa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
//import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResultMessage<T> {

    private String code;
    private String message;
    private T payload;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date when;

    public ResultMessage() {
        this.when = new Date();
    }

    public ResultMessage(T payload) {
        this.when = new Date();
        this.payload = payload;
    }

}
