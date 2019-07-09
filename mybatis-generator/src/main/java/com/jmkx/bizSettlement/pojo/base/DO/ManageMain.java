package com.jmkx.bizSettlement.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import javax.persistence.*;

@Table(name = "base_manage_main")
public class ManageMain extends BaseEntity {
    /**
     * 管理主体主键
     */
    @Id
    @Column(name = "manage_main_id")
    private String manageMainId;

    /**
     * 管理主体编码
     */
    @Column(name = "manage_main_code")
    private String manageMainCode;

    /**
     * 管理主体名称
     */
    @Column(name = "manage_main_name")
    private String manageMainName;

    /**
     * 账套地址
     */
    @Column(name = "system_ip")
    private String systemIp;

    /**
     * 备注
     */
    private String remark;

    /**
     * 删除标记【0:未删除; 1:已删除】
     */
    private Byte dr;

    /**
     * 获取管理主体主键
     *
     * @return manage_main_id - 管理主体主键
     */
    public String getManageMainId() {
        return manageMainId;
    }

    /**
     * 设置管理主体主键
     *
     * @param manageMainId 管理主体主键
     */
    public void setManageMainId(String manageMainId) {
        this.manageMainId = manageMainId == null ? null : manageMainId.trim();
    }

    /**
     * 获取管理主体编码
     *
     * @return manage_main_code - 管理主体编码
     */
    public String getManageMainCode() {
        return manageMainCode;
    }

    /**
     * 设置管理主体编码
     *
     * @param manageMainCode 管理主体编码
     */
    public void setManageMainCode(String manageMainCode) {
        this.manageMainCode = manageMainCode == null ? null : manageMainCode.trim();
    }

    /**
     * 获取管理主体名称
     *
     * @return manage_main_name - 管理主体名称
     */
    public String getManageMainName() {
        return manageMainName;
    }

    /**
     * 设置管理主体名称
     *
     * @param manageMainName 管理主体名称
     */
    public void setManageMainName(String manageMainName) {
        this.manageMainName = manageMainName == null ? null : manageMainName.trim();
    }

    /**
     * 获取账套地址
     *
     * @return system_ip - 账套地址
     */
    public String getSystemIp() {
        return systemIp;
    }

    /**
     * 设置账套地址
     *
     * @param systemIp 账套地址
     */
    public void setSystemIp(String systemIp) {
        this.systemIp = systemIp == null ? null : systemIp.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取删除标记【0:未删除; 1:已删除】
     *
     * @return dr - 删除标记【0:未删除; 1:已删除】
     */
    public Byte getDr() {
        return dr;
    }

    /**
     * 设置删除标记【0:未删除; 1:已删除】
     *
     * @param dr 删除标记【0:未删除; 1:已删除】
     */
    public void setDr(Byte dr) {
        this.dr = dr;
    }
}