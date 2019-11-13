package model;

import java.sql.Date;


public class TeacherTable {
    private String gh;//工号
    private String xm;//姓名
    private String xb;//性别
    private String csrq;//出生日期
    private String xl;//学历
    private String jbgz;//基本工资
    private String yxh;//院系号
    private String pwd;
    public String getCsrq(){
        return csrq;
    }
    public void setCsrq(String csrq){
        this.csrq = csrq;
    }
    public String getGh(){
        return gh;
    }
    public void setGh(String gh){
        this.gh = gh;
    }
    public String getXm(){
        return xm;
    }
    public void setXm(String xm){
        this.xm = xm;
    }
    public String getXb(){
        return xb;
    }
    public void setXb(String xb){
        this.xb = xb;
    }
    public String getXl(){
        return xl;
    }
    public void setXl(String xl){
        this.xl = xl;
    }
    public String getJbgz(){
        return jbgz;
    }
    public void setJbgz(String jbgz){
        this.jbgz = jbgz;
    }
    public String getYxh(){
        return yxh;
    }
    public void setYxh(String yxh){
        this.yxh = yxh;
    }
    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){ this.csrq = csrq; }

}
