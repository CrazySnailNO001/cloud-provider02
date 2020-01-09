package com.xzh.provider2.controller;

import com.xzh.provider2.dto.UserRequestDto;
import org.springframework.web.bind.annotation.*;

/**
 * @author XZHH
 * @Description:
 * @create 2019/4/23 0023 12:03
 * @modify By:
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index(@RequestParam(required = false) String name) throws InterruptedException {
//        Thread.sleep(8000);
        return "这是服务提供者2，参数：" + name;
    }

    @PostMapping("/hello")
    @ResponseBody
    public String ribbonPost(@RequestBody UserRequestDto userRequestDto) {
        return "这是服务提供者2，post请求,参数：" + userRequestDto.getName();
    }

}
