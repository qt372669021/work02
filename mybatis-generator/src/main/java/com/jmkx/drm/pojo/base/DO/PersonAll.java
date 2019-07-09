package com.jmkx.drm.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import javax.persistence.*;

@Table(name = "t_person_all")
public class PersonAll extends BaseEntity {
    /**
     * 0在职，1非在职
     */
    private Integer status;

    @Column(name = "oa_num")
    private String oaNum;

    /**
     * 获取0在职，1非在职
     *
     * @return status - 0在职，1非在职
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0在职，1非在职
     *
     * @param status 0在职，1非在职
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return oa_num
     */
    public String getOaNum() {
        return oaNum;
    }

    /**
     * @param oaNum
     */
    public void setOaNum(String oaNum) {
        this.oaNum = oaNum == null ? null : oaNum.trim();
    }
}