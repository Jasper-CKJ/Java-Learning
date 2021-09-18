package com.jasper.rabbitmq.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author jasper
 * @create 2021-09-16 17:55
 */
public class SleepUtils {
    /**
     * 休眠一段时间
     * @param seconds 休眠秒数
     */
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
