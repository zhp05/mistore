package cn.edu.sdu.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {

    private int user_id;
    private String userName;
    private String password;
    private String userPhoneNumber;
    private String email;
    private String gender;

}
