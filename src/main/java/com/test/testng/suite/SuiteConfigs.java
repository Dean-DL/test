//SuiteConfigs 为了进行所有测试套件的配置，在这儿写测试的套件之前需要运行的方法。
package com.test.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfigs {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
