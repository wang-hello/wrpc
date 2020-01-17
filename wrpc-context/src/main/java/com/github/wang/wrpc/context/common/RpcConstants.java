package com.github.wang.wrpc.context.common;

/**
 * @author : wang
 * @date : 2020/1/6
 */
public class RpcConstants {

    /**
     * 配置key:weight
     */
    public static final String  CONFIG_KEY_WEIGHT                  = "weight";

    /**
     * 配置key:appName
     */
    public static final String  CONFIG_KEY_APP_NAME                = "appName";

    /**
     * 配置key:serialization
     */
    public static final String  CONFIG_KEY_SERIALIZATION           = "serialization";


    /**
     * 默认的io线程数
     */
    public static final int DEFAULT_IO_THREADS = Math.min(Runtime.getRuntime().availableProcessors() + 1, 32);


    public static final long HEARTBEAT_TIMEOUT = 1000 * 5;






}
