package com.sealinetech.cloudccerp.service.impl;

import com.sealinetech.cloudccerp.dao.PersonDao;
import com.sealinetech.cloudccerp.pojo.Person;
import com.sealinetech.cloudccerp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OOJEEK on 2016/10/31.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Person record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Person record) {
        return dao.insertSelective(record);
    }

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return dao.updateByPrimaryKey(record);
    }
}
