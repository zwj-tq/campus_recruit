package com.smxy.campus_recruit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CRUserAdmin {
    private Integer id;

    private String username;

    private String password;

    private Integer userType;

    private String phone;

}