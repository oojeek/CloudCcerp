package com.sealinetech.cloudccerp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DelegateUnit implements Serializable {
    private Integer id;

    private String delegateName;

    private Integer delegateAge;

    private BigDecimal delegateDistance;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName == null ? null : delegateName.trim();
    }

    public Integer getDelegateAge() {
        return delegateAge;
    }

    public void setDelegateAge(Integer delegateAge) {
        this.delegateAge = delegateAge;
    }

    public BigDecimal getDelegateDistance() {
        return delegateDistance;
    }

    public void setDelegateDistance(BigDecimal delegateDistance) {
        this.delegateDistance = delegateDistance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}