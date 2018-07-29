package com.springbootstudy.idea20180729springbootdemo;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* 测试logger系统
* 2018年7月29日
*/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
//    方法一：简便使用方法
//      ①添加依赖
//      手动在依赖处添加(lombok.extern.slf4j.Slf4j)
//        <dependency>
//            <!--手动导入@Slf4j-->
//            <groupId>org.projectlombok</groupId>
//            <artifactId>lombok</artifactId>
//        </dependency>
//      ②安装插件
//      在file》setting》plugin》install lombok plugin》restart idea
//      ③添加注解
//      @Slf4j
//    方法二：基本使用方法
//      创建日志工厂类( org.slf4j.Logger)
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        log.info("info1...");
        log.error("error1...");
//        测试占位符
        String string = "test";
        log.info("String:{}",string);
    }

    @Test
    public void test2(){
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
    }
}
