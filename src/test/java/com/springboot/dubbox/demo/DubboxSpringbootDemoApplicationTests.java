package com.springboot.dubbox.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboxSpringbootDemoApplicationTests {

	@Reference
	//使用该注解注入服务
			IService iservice;

	@Test
	public void contextLoads() {
		System.out.println(iservice.test());//调用
	}

}
