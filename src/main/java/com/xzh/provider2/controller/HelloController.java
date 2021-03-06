package com.xzh.provider2.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author XZHH
 * @Description:
 * @create 2019/4/23 0023 12:03
 * @modify By:
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "这是服务提供者2，参数："+name;
    }

    @PostMapping("/hello")
    @ResponseBody
    public String ribbonPost(@RequestBody String name) {
        return "这是服务提供者2，post请求,参数：" + name;
    }

}
