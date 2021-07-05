package com.smxy.campus_recruit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CRJobList {
    private Integer id;

    private String name;

    private String phone;

    private String jobRequirement;

    private String epName;

    private String epAvatar;

    private String epIntroduce;

    private String epType;

    private String epCode;

    private String epAdr;
}