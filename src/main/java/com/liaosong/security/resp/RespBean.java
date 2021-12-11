package com.liaosong.security.resp;

public class RespBean {

    private static final RespBean respBean=new RespBean();

    private String status;

    private String message;

    private Object obj;

    public RespBean() {
    }

    public RespBean(String message) {
        this.message = message;
    }


    public static RespBean error(String message) {
        respBean.setStatus("500");
        respBean.setMessage(message);
        return respBean;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static RespBean ok(String message, Object obj){
        respBean.setMessage(message);
        respBean.setStatus("200");
        respBean.setObj(obj);
        return respBean;
    }

    public static RespBean ok(String message){
        respBean.setMessage(message);
        respBean.setStatus("200");
        return respBean;
    }
}
