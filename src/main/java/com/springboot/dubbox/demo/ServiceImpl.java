package com.springboot.dubbox.demo;

/**
 * Created by maybo on 2017/2/4.
 */

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by 王念 on 2016/4/21.
 */
@Service
@EnableAutoConfiguration
public class ServiceImpl implements IService {
    public String test() {
        System.out.printf("RPC调用成功");
        return "RPC调用成功";
    }
}
