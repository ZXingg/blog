package com.zxing.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World 控制器.
 * 
 * @author <a href="https://zxing.com">ZXing</a>
 * @date 2017年1月26日
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit zxing.com!";
	}
 
}
 