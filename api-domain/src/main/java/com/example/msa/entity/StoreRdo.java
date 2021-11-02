package com.example.msa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;


@Getter
@Setter
public class StoreRdo {

    private String id;
    private String name;
    private String address;
    private String category;
    private String keyword;
}
