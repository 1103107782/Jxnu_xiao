package base;

import java.io.Serializable;
import java.sql.Date;


public class mTeacher implements Serializable{
    public mTeacher(){}
    private String gh;//工号
    private String xm;//姓名
    private String xb;//性别
    private String csrq;//出生日期
    private String xl;//学历
    private String jbgz;//基本工资
    private String yxh;//院系号
    private String pwd;

    public String getgh() {
        return this.gh;
    }

    public String getXm() {
        return this.xm;
    }

    public String getXb() {
        return this.xb;
    }

    public String getXl() {
        return this.xl;
    }

    public String getYxh() {
        return this.yxh;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getCsrq() {
        return this.csrq;
    }

    public String getjbgz() {
        return this.jbgz;
    }

    public void setGh(String gh){
        this.gh=gh;
    }
    public void setXm(String xm){
        this.xm=xm;
    }
    public void setXb(String xb){
        this.xb=xb;
    }
    public void setCsrq(String csrq){
        this.csrq=csrq;
    }
    public void setXl(String xl){
        this.xl=xl;
    }
    public void setJbgz(String jbgz){
        this.jbgz=jbgz;
    }
    public void setYxh(String yxh){
        this.yxh=yxh;
    }
    public void setPwd(String pwd){
        this.pwd=pwd;
    }
}
