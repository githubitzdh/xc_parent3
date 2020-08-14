package com.czxy.xuecheng.common.exception;

import com.czxy.xuecheng.common.model.response.ResultCode;

/**
 * 自定义异常类型
 * @version 1.0
 **/
public class CustomException extends RuntimeException {

    //544565465
    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
        System.err.println("测试数据");
    }
    public ResultCode getResultCode(){
        System.err.println("5132321");
        System.err.println("322349092034");
        return resultCode;
    }


}
