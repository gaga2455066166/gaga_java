package com.cjl.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 */
public class User implements Serializable {
    private String suser;
    private String spwd;
    private String sname;
    private String ssex;
    private String dbirth;
    private String semail;
    private String sphone;
    private String saddress;
    private String scode;
    private Integer nlevel = 0;
    private String dregdate = null;
    private String slock = null;
    private String dlastdate = null;
    private Integer nlogin = null;

    public String getSuser() {
        return suser;
    }

    public void setSuser(String suser) {
        this.suser = suser;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getDbirth() {
        return dbirth;
    }

    public void setDbirth(String dbirth) {
        this.dbirth = dbirth;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public Integer getNlevel() {
        return nlevel;
    }

    public void setNlevel(Integer nlevel) {
        this.nlevel = nlevel;
    }

    public String getDregdate() {
        return dregdate;
    }

    public void setDregdate(String dregdate) {
        this.dregdate = dregdate;
    }

    public String getSlock() {
        return slock;
    }

    public void setSlock(String slock) {
        this.slock = slock;
    }

    public String getDlastdate() {
        return dlastdate;
    }

    public void setDlastdate(String dlastdate) {
        this.dlastdate = dlastdate;
    }

    public Integer getNlogin() {
        return nlogin;
    }

    public void setNlogin(Integer nlogin) {
        this.nlogin = nlogin;
    }

    @Override
    public String toString() {
        return "User{" +
                "suser='" + suser + '\'' +
                ", spwd='" + spwd + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", dbirth=" + dbirth +
                ", semail='" + semail + '\'' +
                ", sphone='" + sphone + '\'' +
                ", saddress='" + saddress + '\'' +
                ", scode='" + scode + '\'' +
                ", nlevel=" + nlevel +
                ", dregdate=" + dregdate +
                ", slock='" + slock + '\'' +
                ", dlastdate=" + dlastdate +
                ", nlogin=" + nlogin +
                '}';
    }
}

