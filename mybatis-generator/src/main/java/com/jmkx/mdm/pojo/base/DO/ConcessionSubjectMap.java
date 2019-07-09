package com.jmkx.mdm.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_concession_subject_map")
public class ConcessionSubjectMap extends BaseEntity {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 折让类型
     */
    @Column(name = "concession_type")
    private String concessionType;

    /**
     * 科目代码
     */
    @Column(name = "subject_code")
    private String subjectCode;

    /**
     * 科目名称
     */
    @Column(name = "subject_name")
    private String subjectName;

    /**
     * 记账方式（借/贷）
     */
    @Column(name = "clearing_method")
    private String clearingMethod;

    private String ramark;

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
     * 审核状态【0审核中，1为未通过，2为已通过】
     */
    @Column(name = "check_state")
    private Byte checkState;

    /**
     * 审核意见
     */
    @Column(name = "check_opinion")
    private String checkOpinion;

    /**
     * 审核人id
     */
    @Column(name = "check_id")
    private String checkId;

    /**
     * 审核人
     */
    private String checker;

    /**
     * 审核时间
     */
    @Column(name = "check_date")
    private Date checkDate;

    /**
     * 删除标志【0:未删除;1:已删除】
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
     * 获取折让类型
     *
     * @return concession_type - 折让类型
     */
    public String getConcessionType() {
        return concessionType;
    }

    /**
     * 设置折让类型
     *
     * @param concessionType 折让类型
     */
    public void setConcessionType(String concessionType) {
        this.concessionType = concessionType == null ? null : concessionType.trim();
    }

    /**
     * 获取科目代码
     *
     * @return subject_code - 科目代码
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * 设置科目代码
     *
     * @param subjectCode 科目代码
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
    }

    /**
     * 获取科目名称
     *
     * @return subject_name - 科目名称
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 设置科目名称
     *
     * @param subjectName 科目名称
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * 获取记账方式（借/贷）
     *
     * @return clearing_method - 记账方式（借/贷）
     */
    public String getClearingMethod() {
        return clearingMethod;
    }

    /**
     * 设置记账方式（借/贷）
     *
     * @param clearingMethod 记账方式（借/贷）
     */
    public void setClearingMethod(String clearingMethod) {
        this.clearingMethod = clearingMethod == null ? null : clearingMethod.trim();
    }

    /**
     * @return ramark
     */
    public String getRamark() {
        return ramark;
    }

    /**
     * @param ramark
     */
    public void setRamark(String ramark) {
        this.ramark = ramark == null ? null : ramark.trim();
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
     * 获取审核状态【0审核中，1为未通过，2为已通过】
     *
     * @return check_state - 审核状态【0审核中，1为未通过，2为已通过】
     */
    public Byte getCheckState() {
        return checkState;
    }

    /**
     * 设置审核状态【0审核中，1为未通过，2为已通过】
     *
     * @param checkState 审核状态【0审核中，1为未通过，2为已通过】
     */
    public void setCheckState(Byte checkState) {
        this.checkState = checkState;
    }

    /**
     * 获取审核意见
     *
     * @return check_opinion - 审核意见
     */
    public String getCheckOpinion() {
        return checkOpinion;
    }

    /**
     * 设置审核意见
     *
     * @param checkOpinion 审核意见
     */
    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion == null ? null : checkOpinion.trim();
    }

    /**
     * 获取审核人id
     *
     * @return check_id - 审核人id
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * 设置审核人id
     *
     * @param checkId 审核人id
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    /**
     * 获取审核人
     *
     * @return checker - 审核人
     */
    public String getChecker() {
        return checker;
    }

    /**
     * 设置审核人
     *
     * @param checker 审核人
     */
    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    /**
     * 获取审核时间
     *
     * @return check_date - 审核时间
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 设置审核时间
     *
     * @param checkDate 审核时间
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
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