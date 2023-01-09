package com.zhu.SpringBootTest.controller;

import com.zhu.SpringBootTest.component.NacosTestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosTestController {

    @Autowired
    NacosTestComponent component;

    @PostMapping(value = "/nacos/test1")
    public void testNacos1() {
        component.test1();
    }
}
