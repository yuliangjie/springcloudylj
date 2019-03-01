package com.zaltor.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author: 虞梁杰
 * @date: 2019/3/1
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
