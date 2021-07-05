package com.smxy.campus_recruit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CRUserStu {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String stuStatus;

    private String stuAvatar;

    private String stuSex;

    private Date stuStartTime;

    private String stuAdr;

    private String stuExpectJob;
}