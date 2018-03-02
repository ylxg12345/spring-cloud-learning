package com.byzuse.service;

import org.springframework.stereotype.Component;

/**
 * Created by byzuse
 * datetime: 2017/5/24 15:53.
 */
@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
