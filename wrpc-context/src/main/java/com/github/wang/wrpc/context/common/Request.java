package com.github.wang.wrpc.context.common;

import com.github.wang.wrpc.context.config.RpcDefaultConfig;
import lombok.Data;

import java.util.concurrent.atomic.AtomicLong;


@Data
public class Request {

    private static final AtomicLong INVOKE_ID = new AtomicLong(0);

    private long id;

    private boolean isBack;//是否响应

    private boolean heartbeat;//是否心跳消息

    private byte serializerId = RpcDefaultConfig.SERIALIZATION_ID;

    private Object body;

    public Request() {
        this.isBack = true;
        this.id = newId();
    }

    public Request(byte serializerId) {
        this.isBack = true;
        this.id = newId();
        this.serializerId = serializerId;
    }

    public Request(long id) {
        this.id = id;
    }

    private static long newId() {
        // getAndIncrement() When it grows to MAX_VALUE, it will grow to MIN_VALUE, and the negative can be used as ID
        return INVOKE_ID.getAndIncrement();
    }

}
