package com.xzh.provider2.controller;

import com.xzh.provider2.dto.UserRequestDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：xzh
 * @date ：Created in 2020-01-09 11:17
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/jdk_http_client")
public class HttpClientProviderController {

    @GetMapping("/getTest")
    public String getTest(@RequestParam(required = false) String name) {
        return "这是服务提供者2，getTest -- 参数 name ：" + name;
    }

    @PostMapping(value = "/postJsonTest", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String postJsonTest(@RequestBody UserRequestDto userRequestDto) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception...");
        }
        return "这是服务提供者2，postJsonTest,参数 name：" + userRequestDto.getName() + ", age :" + userRequestDto.getAge();
    }

    @PostMapping(value = "/postFormTest", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String postFormTest(@RequestBody UserRequestDto userRequestDto) {
        System.out.println("================");
        return "这是服务提供者2，postFormTest,参数 name：" + userRequestDto.getName() + ", age :" + userRequestDto.getAge();
    }
}
