package com.czxy.xuecheng.common.exception;

import com.czxy.xuecheng.common.model.response.ResultCode;

/**
 * 自定义异常类型
 * @version 1.0
 **/
public class CustomException extends RuntimeException {

    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
        System.err.println("测试数据");
    }
    public ResultCode getResultCode(){
        System.err.println("65654645323213232321");
        return resultCode;
    }


}
