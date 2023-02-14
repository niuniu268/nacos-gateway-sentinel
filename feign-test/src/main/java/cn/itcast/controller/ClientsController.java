package cn.itcast.controller;

import cn.itcast.pojo.Clients;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice")
public interface ClientsController {
    @GetMapping("/user/{id}")
    Clients findById(@PathVariable("id") Long id);
}
