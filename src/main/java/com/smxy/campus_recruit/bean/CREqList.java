package com.smxy.campus_recruit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CREqList {
    private Integer id;

    private String epName;

    private String epAvatar;

    private String epIntroduce;

    private String epType;

    private String epCode;

    private String epAdr;

    private String epBusPic;

    private String reviewStatus;
}