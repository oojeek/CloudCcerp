package com.sealinetech.cloudccerp.service;

import com.sealinetech.cloudccerp.pojo.Person;

/**
 * Created by OOJEEK on 2016/10/31.
 */
public interface PersonService {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}
