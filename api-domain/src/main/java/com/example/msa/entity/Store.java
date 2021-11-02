package com.example.msa.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Store {

    private String id;
    private String name;
    private String address;
    private String category;
    private String keyword;

    private Integer offset;
    private Integer limit;
    private String sort;
    private String direction;

    public Store(){
        if(offset == null)
            offset = 10;
        if(limit == null)
            limit = 0;
    }
}
