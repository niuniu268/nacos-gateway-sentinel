package cn.itcast.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class Config implements Ordered {
    @Override
    public int getOrder () {
        return -1;
    }
}
