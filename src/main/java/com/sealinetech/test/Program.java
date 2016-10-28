package com.sealinetech.test;

import com.sealinetech.cloudccerp.pojo.DelegateUnit;
import com.sealinetech.cloudccerp.service.DelegateUnitService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by OOJEEK on 2016/10/28.
 */
public class Program {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Test t = (Test) ac.getBean("test");
        System.out.println(t.toString());
        DelegateUnitService service = ac.getBean(DelegateUnitService.class);
        DelegateUnit du = service.selectByPrimaryKey(1);
        System.out.println(du.toString());
    }
}
