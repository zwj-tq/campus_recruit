package com.smxy.campus_recruit.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张伟杰
 * @ClassName ResultData.java
 * @Description TODO
 * @createTime 2021年06月30日 17:11:00
 */
@Data
@Accessors(chain = true)
public class ResultData {
    /**
     * 状态码：200-成功  199-失败
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Map<String, Object> extend = new HashMap<>();

    /**
     * 获取请求成功信息的封装类
     */
    public static ResultData success() {
        ResultData resultData = new ResultData().setCode(200).setMessage("请求成功");
        return resultData;
    }

    /**
     * 获取请求失败信息的封装类
     */
    public static ResultData failure() {
        ResultData resultData = new ResultData().setCode(199).setMessage("处理失败");
        return resultData;
    }

    /**
     * 添加返回数据
     */
    public ResultData addExtend(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }
}
