package com.example.xxx.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description: Rooter
 * @author: leiming5
 * @date: 2021-01-06 09:41
 */
@Data
@Component
@ConfigurationProperties(prefix = "rooter")
public class Rooter {
    private static String one;
    private static int two;
    private static String zxc;

    public  void setOne(String one) {
        Rooter.one = one;
    }

    public  void setTwo(int two) {
        Rooter.two = two;
    }

    public  void setZxc(String zxc) {
        Rooter.zxc = zxc;
    }

    public static String getOne() {
        return one;
    }

    public static int getTwo() {
        return two;
    }

    public static String getZxc() {
        return zxc;
    }
}
