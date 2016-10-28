package com.sealinetech.cloudccerp.service;

import com.sealinetech.cloudccerp.pojo.DelegateUnit;

/**
 * Created by OOJEEK on 2016/10/28.
 */
public interface DelegateUnitService {
    int deleteByPrimaryKey(Integer id);

    int insert(DelegateUnit record);

    int insertSelective(DelegateUnit record);

    DelegateUnit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DelegateUnit record);

    int updateByPrimaryKey(DelegateUnit record);
}
