package com.miguan.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.miguan.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001 {
    public static void main(String[] args){
        SpringApplication.run(ProductProvider_8001.class,args);
    }
}
