package com.sealinetech.cloudccerp.service.impl;

import com.sealinetech.cloudccerp.dao.DelegateUnitMapper;
import com.sealinetech.cloudccerp.pojo.DelegateUnit;
import com.sealinetech.cloudccerp.service.DelegateUnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by OOJEEK on 2016/10/28.
 */
@Service
public class DelegateUnitServiceImpl implements DelegateUnitService {
    @Resource
    private DelegateUnitMapper dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DelegateUnit record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(DelegateUnit record) {
        return dao.insertSelective(record);
    }

    @Override
    public DelegateUnit selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DelegateUnit record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DelegateUnit record) {
        return dao.updateByPrimaryKey(record);
    }
}
