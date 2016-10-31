package com.sealinetech.cloudccerp;

import com.sealinetech.cloudccerp.pojo.DelegateUnit;
import com.sealinetech.cloudccerp.pojo.Person;
import com.sealinetech.cloudccerp.service.DelegateUnitService;
import com.sealinetech.cloudccerp.service.PersonService;
import com.sealinetech.cloudccerp.service.impl.PersonServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by OOJEEK on 2016/10/31.
 */
public class IntegrateTest {
    @Test
    public void springMybatis()
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        DelegateUnitService service = ac.getBean(DelegateUnitService.class);
        DelegateUnit du = service.selectByPrimaryKey(1);
        System.out.println(du.toString());
        List<DelegateUnit> unitList = service.getRecordList();
        for (DelegateUnit unit : unitList) {
            System.out.println(unit);
        }


        PersonService service1 = ac.getBean(PersonServiceImpl.class);
        Person psn = service1.selectByPrimaryKey(1);
        System.out.println(psn.toString());
    }
}
