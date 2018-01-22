package base;

import com.alibaba.fastjson.JSON;

public class Result<T> {
    private boolean isSuccess;
    private String code;
    private String zhMsg;
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess(){
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZhMsg() {
        return zhMsg;
    }

    public void setZhMsg(String zhMsg) {
        this.zhMsg = zhMsg;
    }
    @Override
    public String toString(){
        String jsonString=JSON.toJSONString(this);
        System.err.println(jsonString);
        return jsonString;
    }
}
