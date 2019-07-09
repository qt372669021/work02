package com.jmkx.bizSettlement.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import javax.persistence.*;

@Table(name = "base_manage_law")
public class ManageLaw extends BaseEntity {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "manage_law_id")
    private String manageLawId;

    /**
     * 管理主体ID
     */
    @Column(name = "manu_id")
    private String manuId;

    /**
     * 管理主体编码
     */
    @Column(name = "manu_code")
    private String manuCode;

    /**
     * 管理主体名称
     */
    @Column(name = "manu_name")
    private String manuName;

    /**
     * 法人主体ID
     */
    @Column(name = "manage_main_id")
    private String manageMainId;

    /**
     * 法人主体编码
     */
    @Column(name = "manage_main_code")
    private String manageMainCode;

    /**
     * 法人主体名称
     */
    @Column(name = "manage_main_name")
    private String manageMainName;

    /**
     * 获取主键ID
     *
     * @return manage_law_id - 主键ID
     */
    public String getManageLawId() {
        return manageLawId;
    }

    /**
     * 设置主键ID
     *
     * @param manageLawId 主键ID
     */
    public void setManageLawId(String manageLawId) {
        this.manageLawId = manageLawId == null ? null : manageLawId.trim();
    }

    /**
     * 获取管理主体ID
     *
     * @return manu_id - 管理主体ID
     */
    public String getManuId() {
        return manuId;
    }

    /**
     * 设置管理主体ID
     *
     * @param manuId 管理主体ID
     */
    public void setManuId(String manuId) {
        this.manuId = manuId == null ? null : manuId.trim();
    }

    /**
     * 获取管理主体编码
     *
     * @return manu_code - 管理主体编码
     */
    public String getManuCode() {
        return manuCode;
    }

    /**
     * 设置管理主体编码
     *
     * @param manuCode 管理主体编码
     */
    public void setManuCode(String manuCode) {
        this.manuCode = manuCode == null ? null : manuCode.trim();
    }

    /**
     * 获取管理主体名称
     *
     * @return manu_name - 管理主体名称
     */
    public String getManuName() {
        return manuName;
    }

    /**
     * 设置管理主体名称
     *
     * @param manuName 管理主体名称
     */
    public void setManuName(String manuName) {
        this.manuName = manuName == null ? null : manuName.trim();
    }

    /**
     * 获取法人主体ID
     *
     * @return manage_main_id - 法人主体ID
     */
    public String getManageMainId() {
        return manageMainId;
    }

    /**
     * 设置法人主体ID
     *
     * @param manageMainId 法人主体ID
     */
    public void setManageMainId(String manageMainId) {
        this.manageMainId = manageMainId == null ? null : manageMainId.trim();
    }

    /**
     * 获取法人主体编码
     *
     * @return manage_main_code - 法人主体编码
     */
    public String getManageMainCode() {
        return manageMainCode;
    }

    /**
     * 设置法人主体编码
     *
     * @param manageMainCode 法人主体编码
     */
    public void setManageMainCode(String manageMainCode) {
        this.manageMainCode = manageMainCode == null ? null : manageMainCode.trim();
    }

    /**
     * 获取法人主体名称
     *
     * @return manage_main_name - 法人主体名称
     */
    public String getManageMainName() {
        return manageMainName;
    }

    /**
     * 设置法人主体名称
     *
     * @param manageMainName 法人主体名称
     */
    public void setManageMainName(String manageMainName) {
        this.manageMainName = manageMainName == null ? null : manageMainName.trim();
    }
}