package com.test.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod在测试方法之前执行");
    }
    @AfterMethod
    public void  AfterMethod(){
        System.out.println("AfterMethod在测试方法之后执行");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass在类运行之前运行");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass在类运行之后运行");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
