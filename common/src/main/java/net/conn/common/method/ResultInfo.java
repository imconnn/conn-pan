package net.conn.common.method;

/**
 * @Author Conn
 * @Date 2018/9/29
 */
public class ResultInfo {
    /**
     * 代码 1：成功  0：失败
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 对象
     */
    private Object result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static ResultInfo success() {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(1);
        resultInfo.setMsg("success");
        return resultInfo;
    }


    public static ResultInfo failure() {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(0);
        resultInfo.setMsg("failure");
        return resultInfo;
    }

    public static ResultInfo failure(String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(0);
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public ResultInfo build(Object result) {
        if (null != result) {
            this.result = result;
        } else {
            this.result = null;
        }
        return this;
    }
}
