package base;

import java.io.Serializable;


public class mstudent implements Serializable{
public mstudent(){};
private String xh;//学号
private String xm;//姓名

private String pscj;//平时成绩
private String kscj;//考试成绩
private String zpcj;//总评成绩
public void setXh(String xh){
    this.xh=xh;
}
public void setXm(String xm){
    this.xm=xm;
}

public void setPscj(String pscj){
    this.pscj=pscj;
}
public void setKscj(String kscj){
    this.kscj=kscj;
}
public void setZpcj(String zpcj){
    this.zpcj=zpcj;
}
public String getXh(){
    return this.xh;
}
public String getXm(){
    return this.xm;
}

public String getPscj(){
    return this.pscj;
}
public String getKscj(){
    return this.kscj;
}
public String getZpcj(){
    return this.zpcj;
}
}
