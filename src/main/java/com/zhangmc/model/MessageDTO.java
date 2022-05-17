package com.zhangmc.model;

import com.zhangmc.enums.OperateType;

/**
 * @author zhangMC
 * @description 消息对象
 * @date 2022/05/13 17:13
 **/
public class MessageDTO {

    private OperateType operateType;

    private String data;

    private String key;

    public OperateType getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateType operateType) {
        this.operateType = operateType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MessageDTO(OperateType operateType, String data, String key) {
        this.operateType = operateType;
        this.data = data;
        this.key = key;
    }

    public MessageDTO() {
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "operateType=" + operateType +
                ", data='" + data + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
