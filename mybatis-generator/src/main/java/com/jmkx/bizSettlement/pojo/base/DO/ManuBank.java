package com.jmkx.bizSettlement.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import javax.persistence.*;

@Table(name = "base_manage_main_bank")
public class ManuBank extends BaseEntity {
    /**
     * 主键
     */
    @Id
    private String id;

    @Column(name = "manage_main_id")
    private String manageMainId;

    /**
     * 账号
     */
    private String account;

    /**
     * 开户行
     */
    @Column(name = "open_bank")
    private String openBank;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 社会信用代码
     */
    @Column(name = "credit_code")
    private String creditCode;

    /**
     * 是否默认【1:否; 1:是】
     */
    @Column(name = "is_default")
    private Boolean isDefault;

    /**
     * 删除标记【0:未删除; 1:已删除】
     */
    private Byte dr;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return manage_main_id
     */
    public String getManageMainId() {
        return manageMainId;
    }

    /**
     * @param manageMainId
     */
    public void setManageMainId(String manageMainId) {
        this.manageMainId = manageMainId == null ? null : manageMainId.trim();
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取开户行
     *
     * @return open_bank - 开户行
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * 设置开户行
     *
     * @param openBank 开户行
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取邮编
     *
     * @return post_code - 邮编
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置邮编
     *
     * @param postCode 邮编
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    /**
     * 获取社会信用代码
     *
     * @return credit_code - 社会信用代码
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * 设置社会信用代码
     *
     * @param creditCode 社会信用代码
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    /**
     * 获取是否默认【1:否; 1:是】
     *
     * @return is_default - 是否默认【1:否; 1:是】
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认【1:否; 1:是】
     *
     * @param isDefault 是否默认【1:否; 1:是】
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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