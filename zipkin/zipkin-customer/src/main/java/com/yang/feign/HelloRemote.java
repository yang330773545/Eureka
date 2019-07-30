package com.yang.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//熔断调用 fallback
@FeignClient(name="zipkin-producer")
public interface HelloRemote {
	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name")String name);

}
