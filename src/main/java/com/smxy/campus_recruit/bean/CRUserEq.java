package com.smxy.campus_recruit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CRUserEq {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String epName;

    private String epAvatar;

    private String epIntroduce;

    private String epType;

    private String epCode;

    private String epAdr;

    private String epBusPic;
}