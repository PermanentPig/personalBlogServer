package com.blog.personalblog.util;

public class ResultUtil {
    public static MyResult success(Object object) {
        MyResult result = new MyResult();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static MyResult success() {
        return success(null);
    }

    public static MyResult error(Integer code, String msg) {
        MyResult result = new MyResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
