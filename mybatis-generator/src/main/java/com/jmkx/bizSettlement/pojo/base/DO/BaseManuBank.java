package com.jmkx.bizSettlement.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_manu_bank")
public class BaseManuBank extends BaseEntity {
    /**
     * 主键id
     */
    @Id
    @Column(name = "bank_id")
    private String bankId;

    /**
     * 商家id
     */
    @Column(name = "manu_id")
    private String manuId;

    /**
     * 开户户名
     */
    @Column(name = "open_name")
    private String openName;

    /**
     * 开户银行
     */
    @Column(name = "open_bank")
    private String openBank;

    /**
     * 开户帐号
     */
    @Column(name = "bank_num")
    private String bankNum;

    /**
     * 创建人id
     */
    @Column(name = "maker_id")
    private String makerId;

    /**
     * 创建人
     */
    private String maker;

    /**
     * 创建时间
     */
    @Column(name = "make_date")
    private Date makeDate;

    /**
     * 修改人id
     */
    @Column(name = "modify_id")
    private String modifyId;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 删除标志【0:未删除;1:已删除】
     */
    private Byte dr;

    /**
     * 获取主键id
     *
     * @return bank_id - 主键id
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置主键id
     *
     * @param bankId 主键id
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * 获取商家id
     *
     * @return manu_id - 商家id
     */
    public String getManuId() {
        return manuId;
    }

    /**
     * 设置商家id
     *
     * @param manuId 商家id
     */
    public void setManuId(String manuId) {
        this.manuId = manuId == null ? null : manuId.trim();
    }

    /**
     * 获取开户户名
     *
     * @return open_name - 开户户名
     */
    public String getOpenName() {
        return openName;
    }

    /**
     * 设置开户户名
     *
     * @param openName 开户户名
     */
    public void setOpenName(String openName) {
        this.openName = openName == null ? null : openName.trim();
    }

    /**
     * 获取开户银行
     *
     * @return open_bank - 开户银行
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * 设置开户银行
     *
     * @param openBank 开户银行
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    /**
     * 获取开户帐号
     *
     * @return bank_num - 开户帐号
     */
    public String getBankNum() {
        return bankNum;
    }

    /**
     * 设置开户帐号
     *
     * @param bankNum 开户帐号
     */
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum == null ? null : bankNum.trim();
    }

    /**
     * 获取创建人id
     *
     * @return maker_id - 创建人id
     */
    public String getMakerId() {
        return makerId;
    }

    /**
     * 设置创建人id
     *
     * @param makerId 创建人id
     */
    public void setMakerId(String makerId) {
        this.makerId = makerId == null ? null : makerId.trim();
    }

    /**
     * 获取创建人
     *
     * @return maker - 创建人
     */
    public String getMaker() {
        return maker;
    }

    /**
     * 设置创建人
     *
     * @param maker 创建人
     */
    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    /**
     * 获取创建时间
     *
     * @return make_date - 创建时间
     */
    public Date getMakeDate() {
        return makeDate;
    }

    /**
     * 设置创建时间
     *
     * @param makeDate 创建时间
     */
    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    /**
     * 获取修改人id
     *
     * @return modify_id - 修改人id
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * 设置修改人id
     *
     * @param modifyId 修改人id
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 获取修改时间
     *
     * @return modify_date - 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifyDate 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取删除标志【0:未删除;1:已删除】
     *
     * @return dr - 删除标志【0:未删除;1:已删除】
     */
    public Byte getDr() {
        return dr;
    }

    /**
     * 设置删除标志【0:未删除;1:已删除】
     *
     * @param dr 删除标志【0:未删除;1:已删除】
     */
    public void setDr(Byte dr) {
        this.dr = dr;
    }
}