package com.smxy.campus_recruit.bean;

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

    private String jobName;

    private String jobMoney;

    private String jobSeTime;

    private String jobDegreeRequired;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement == null ? null : jobRequirement.trim();
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName == null ? null : epName.trim();
    }

    public String getEpAvatar() {
        return epAvatar;
    }

    public void setEpAvatar(String epAvatar) {
        this.epAvatar = epAvatar == null ? null : epAvatar.trim();
    }

    public String getEpIntroduce() {
        return epIntroduce;
    }

    public void setEpIntroduce(String epIntroduce) {
        this.epIntroduce = epIntroduce == null ? null : epIntroduce.trim();
    }

    public String getEpType() {
        return epType;
    }

    public void setEpType(String epType) {
        this.epType = epType == null ? null : epType.trim();
    }

    public String getEpCode() {
        return epCode;
    }

    public void setEpCode(String epCode) {
        this.epCode = epCode == null ? null : epCode.trim();
    }

    public String getEpAdr() {
        return epAdr;
    }

    public void setEpAdr(String epAdr) {
        this.epAdr = epAdr == null ? null : epAdr.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobMoney() {
        return jobMoney;
    }

    public void setJobMoney(String jobMoney) {
        this.jobMoney = jobMoney == null ? null : jobMoney.trim();
    }

    public String getJobSeTime() {
        return jobSeTime;
    }

    public void setJobSeTime(String jobSeTime) {
        this.jobSeTime = jobSeTime == null ? null : jobSeTime.trim();
    }

    public String getJobDegreeRequired() {
        return jobDegreeRequired;
    }

    public void setJobDegreeRequired(String jobDegreeRequired) {
        this.jobDegreeRequired = jobDegreeRequired == null ? null : jobDegreeRequired.trim();
    }
}