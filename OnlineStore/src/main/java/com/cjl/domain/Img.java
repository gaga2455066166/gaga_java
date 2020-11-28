package com.cjl.domain;

public class Img {
    private Integer nid;
    private String nimg;//图片标号
    private String simg;//图片地址

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNimg() {
        return nimg;
    }

    public void setNimg(String nimg) {
        this.nimg = nimg;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg;
    }

    @Override
    public String toString() {
        return "Img{" +
                "nid=" + nid +
                ", nimg='" + nimg + '\'' +
                ", simg='" + simg + '\'' +
                '}';
    }
}
