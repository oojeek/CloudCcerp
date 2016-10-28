package com.sealinetech.cloudccerp.dao;

import com.sealinetech.cloudccerp.pojo.DelegateUnit;
import org.codehaus.plexus.component.annotations.Component;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
public interface DelegateUnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DelegateUnit record);

    int insertSelective(DelegateUnit record);

    DelegateUnit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DelegateUnit record);

    int updateByPrimaryKey(DelegateUnit record);
}