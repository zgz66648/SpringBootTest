package com.zhu.SpringBootTest.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NacosTestComponent {
    @Value("${rocketmq.127.0.0.1:8848.accessKey}")
    private String accessKey;

    public void test1() {
        System.out.println("----accessKey: " + accessKey);
    }
}
