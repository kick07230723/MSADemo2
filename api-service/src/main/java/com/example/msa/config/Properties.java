package com.example.msa.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Properties {

    //@Value("${spring.profiles}")
    private String springProfiles;

}
