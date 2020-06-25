package com.learning.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {

    private int userId;

    private String userName;

    private String userPassword;

}


