package com.jmkx.bizSettlement.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rb_allocating_rebate_policy")
public class AllocatingRebatePolicy extends BaseEntity {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 管理主体ID
     */
    @Column(name = "manu_id")
    private String manuId;

    /**
     * 管理主体名称
     */
    @Column(name = "manu_name")
    private String manuName;

    /**
     * 管理主体序号
     */
    @Column(name = "manu_code")
    private String manuCode;

    /**
     * 管理主体编号
     */
    @Column(name = "manu_mnem_code")
    private String manuMnemCode;

    /**
     * 法人主体ID
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 法人主体编号
     */
    @Column(name = "manage_code")
    private String manageCode;

    /**
     * 法人主体名称
     */
    @Column(name = "manage_name")
    private String manageName;

    /**
     * 客户ID
     */
    @Column(name = "dealer_id")
    private String dealerId;

    /**
     * 客户序号
     */
    @Column(name = "dealer_code")
    private String dealerCode;

    /**
     * 客户名称
     */
    @Column(name = "dealer_name")
    private String dealerName;

    /**
     * 客户编号
     */
    @Column(name = "dealer_mnem_code")
    private String dealerMnemCode;

    /**
     * 药品id
     */
    @Column(name = "drugs_id")
    private String drugsId;

    /**
     * 药品编号
     */
    @Column(name = "drugs_code")
    private String drugsCode;

    /**
     * 药品名称
     */
    @Column(name = "drugs_name")
    private String drugsName;

    /**
     * 药品规格
     */
    @Column(name = "drugs_spec")
    private String drugsSpec;

    /**
     * 药品助记码
     */
    @Column(name = "drugs_mnem_code")
    private String drugsMnemCode;

    /**
     * 政策编号
     */
    @Column(name = "policy_code")
    private String policyCode;

    /**
     * 生效日期
     */
    @Column(name = "effect_date")
    private Date effectDate;

    /**
     * 返利系数
     */
    @Column(name = "rebate_coeff")
    private BigDecimal rebateCoeff;

    /**
     * 计算方式【1:比例式; 2:数值式】
     */
    @Column(name = "calcula_type")
    private Byte calculaType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 审核状态【0:待审核; 2:已审核】
     */
    @Column(name = "check_state")
    private Byte checkState;

    /**
     * 审核人ID
     */
    @Column(name = "check_id")
    private String checkId;

    /**
     * 审核人
     */
    @Column(name = "check_name")
    private String checkName;

    /**
     * 审核时间
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 创建人ID
     */
    @Column(name = "create_id")
    private String createId;

    /**
     * 创建人
     */
    @Column(name = "create_name")
    private String createName;

    /**
     *  创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人ID
     */
    @Column(name = "modify_id")
    private String modifyId;

    /**
     * 修改人
     */
    @Column(name = "modify_name")
    private String modifyName;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

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
     * 获取管理主体序号
     *
     * @return manu_code - 管理主体序号
     */
    public String getManuCode() {
        return manuCode;
    }

    /**
     * 设置管理主体序号
     *
     * @param manuCode 管理主体序号
     */
    public void setManuCode(String manuCode) {
        this.manuCode = manuCode == null ? null : manuCode.trim();
    }

    /**
     * 获取管理主体编号
     *
     * @return manu_mnem_code - 管理主体编号
     */
    public String getManuMnemCode() {
        return manuMnemCode;
    }

    /**
     * 设置管理主体编号
     *
     * @param manuMnemCode 管理主体编号
     */
    public void setManuMnemCode(String manuMnemCode) {
        this.manuMnemCode = manuMnemCode == null ? null : manuMnemCode.trim();
    }

    /**
     * 获取法人主体ID
     *
     * @return manage_id - 法人主体ID
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置法人主体ID
     *
     * @param manageId 法人主体ID
     */
    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
    }

    /**
     * 获取法人主体编号
     *
     * @return manage_code - 法人主体编号
     */
    public String getManageCode() {
        return manageCode;
    }

    /**
     * 设置法人主体编号
     *
     * @param manageCode 法人主体编号
     */
    public void setManageCode(String manageCode) {
        this.manageCode = manageCode == null ? null : manageCode.trim();
    }

    /**
     * 获取法人主体名称
     *
     * @return manage_name - 法人主体名称
     */
    public String getManageName() {
        return manageName;
    }

    /**
     * 设置法人主体名称
     *
     * @param manageName 法人主体名称
     */
    public void setManageName(String manageName) {
        this.manageName = manageName == null ? null : manageName.trim();
    }

    /**
     * 获取客户ID
     *
     * @return dealer_id - 客户ID
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * 设置客户ID
     *
     * @param dealerId 客户ID
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    /**
     * 获取客户序号
     *
     * @return dealer_code - 客户序号
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * 设置客户序号
     *
     * @param dealerCode 客户序号
     */
    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode == null ? null : dealerCode.trim();
    }

    /**
     * 获取客户名称
     *
     * @return dealer_name - 客户名称
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * 设置客户名称
     *
     * @param dealerName 客户名称
     */
    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    /**
     * 获取客户编号
     *
     * @return dealer_mnem_code - 客户编号
     */
    public String getDealerMnemCode() {
        return dealerMnemCode;
    }

    /**
     * 设置客户编号
     *
     * @param dealerMnemCode 客户编号
     */
    public void setDealerMnemCode(String dealerMnemCode) {
        this.dealerMnemCode = dealerMnemCode == null ? null : dealerMnemCode.trim();
    }

    /**
     * 获取药品id
     *
     * @return drugs_id - 药品id
     */
    public String getDrugsId() {
        return drugsId;
    }

    /**
     * 设置药品id
     *
     * @param drugsId 药品id
     */
    public void setDrugsId(String drugsId) {
        this.drugsId = drugsId == null ? null : drugsId.trim();
    }

    /**
     * 获取药品编号
     *
     * @return drugs_code - 药品编号
     */
    public String getDrugsCode() {
        return drugsCode;
    }

    /**
     * 设置药品编号
     *
     * @param drugsCode 药品编号
     */
    public void setDrugsCode(String drugsCode) {
        this.drugsCode = drugsCode == null ? null : drugsCode.trim();
    }

    /**
     * 获取药品名称
     *
     * @return drugs_name - 药品名称
     */
    public String getDrugsName() {
        return drugsName;
    }

    /**
     * 设置药品名称
     *
     * @param drugsName 药品名称
     */
    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName == null ? null : drugsName.trim();
    }

    /**
     * 获取药品规格
     *
     * @return drugs_spec - 药品规格
     */
    public String getDrugsSpec() {
        return drugsSpec;
    }

    /**
     * 设置药品规格
     *
     * @param drugsSpec 药品规格
     */
    public void setDrugsSpec(String drugsSpec) {
        this.drugsSpec = drugsSpec == null ? null : drugsSpec.trim();
    }

    /**
     * 获取药品助记码
     *
     * @return drugs_mnem_code - 药品助记码
     */
    public String getDrugsMnemCode() {
        return drugsMnemCode;
    }

    /**
     * 设置药品助记码
     *
     * @param drugsMnemCode 药品助记码
     */
    public void setDrugsMnemCode(String drugsMnemCode) {
        this.drugsMnemCode = drugsMnemCode == null ? null : drugsMnemCode.trim();
    }

    /**
     * 获取政策编号
     *
     * @return policy_code - 政策编号
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * 设置政策编号
     *
     * @param policyCode 政策编号
     */
    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode == null ? null : policyCode.trim();
    }

    /**
     * 获取生效日期
     *
     * @return effect_date - 生效日期
     */
    public Date getEffectDate() {
        return effectDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectDate 生效日期
     */
    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    /**
     * 获取返利系数
     *
     * @return rebate_coeff - 返利系数
     */
    public BigDecimal getRebateCoeff() {
        return rebateCoeff;
    }

    /**
     * 设置返利系数
     *
     * @param rebateCoeff 返利系数
     */
    public void setRebateCoeff(BigDecimal rebateCoeff) {
        this.rebateCoeff = rebateCoeff;
    }

    /**
     * 获取计算方式【1:比例式; 2:数值式】
     *
     * @return calcula_type - 计算方式【1:比例式; 2:数值式】
     */
    public Byte getCalculaType() {
        return calculaType;
    }

    /**
     * 设置计算方式【1:比例式; 2:数值式】
     *
     * @param calculaType 计算方式【1:比例式; 2:数值式】
     */
    public void setCalculaType(Byte calculaType) {
        this.calculaType = calculaType;
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
     * 获取审核状态【0:待审核; 2:已审核】
     *
     * @return check_state - 审核状态【0:待审核; 2:已审核】
     */
    public Byte getCheckState() {
        return checkState;
    }

    /**
     * 设置审核状态【0:待审核; 2:已审核】
     *
     * @param checkState 审核状态【0:待审核; 2:已审核】
     */
    public void setCheckState(Byte checkState) {
        this.checkState = checkState;
    }

    /**
     * 获取审核人ID
     *
     * @return check_id - 审核人ID
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置审核人ID
     *
     * @param checkId 审核人ID
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    /**
     * 获取审核人
     *
     * @return check_name - 审核人
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * 设置审核人
     *
     * @param checkName 审核人
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName == null ? null : checkName.trim();
    }

    /**
     * 获取审核时间
     *
     * @return check_time - 审核时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置审核时间
     *
     * @param checkTime 审核时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取创建人ID
     *
     * @return create_id - 创建人ID
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * 设置创建人ID
     *
     * @param createId 创建人ID
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * 获取创建人
     *
     * @return create_name - 创建人
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置创建人
     *
     * @param createName 创建人
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取 创建时间
     *
     * @return create_time -  创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *
     * @param createTime  创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人ID
     *
     * @return modify_id - 修改人ID
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * 设置修改人ID
     *
     * @param modifyId 修改人ID
     */
    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    /**
     * 获取修改人
     *
     * @return modify_name - 修改人
     */
    public String getModifyName() {
        return modifyName;
    }

    /**
     * 设置修改人
     *
     * @param modifyName 修改人
     */
    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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