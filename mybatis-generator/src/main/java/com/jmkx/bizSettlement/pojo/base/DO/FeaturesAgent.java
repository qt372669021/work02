package com.jmkx.bizSettlement.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_features_agent")
public class FeaturesAgent extends BaseEntity {
    /**
     * 主键id
     */
    @Id
    @Column(name = "features_id")
    private String featuresId;

    /**
     * 商家id
     */
    @Column(name = "manu_id")
    private String manuId;

    /**
     * 商家编号
     */
    @Column(name = "manu_code")
    private String manuCode;

    /**
     * 商家
     */
    @Column(name = "manu_name")
    private String manuName;

    /**
     * 商家助记码
     */
    @Column(name = "manu_mnem_code")
    private String manuMnemCode;

    /**
     * 流出方ID
     */
    @Column(name = "out_flow_side_id")
    private String outFlowSideId;

    /**
     * 流出方编号
     */
    @Column(name = "out_flow_side_code")
    private String outFlowSideCode;

    /**
     * 流出方名称
     */
    @Column(name = "out_flow_side_name")
    private String outFlowSideName;

    /**
     * 流出方助记码
     */
    @Column(name = "out_flow_side_mnem_code")
    private String outFlowSideMnemCode;

    /**
     * 流入方ID
     */
    @Column(name = "in_flow_side_id")
    private String inFlowSideId;

    /**
     * 流入方编号
     */
    @Column(name = "in_flow_side_code")
    private String inFlowSideCode;

    /**
     * 流入方名称
     */
    @Column(name = "in_flow_side_name")
    private String inFlowSideName;

    /**
     * 流入方助记码
     */
    @Column(name = "in_flow_side_mnem_code")
    private String inFlowSideMnemCode;

    /**
     * 收货地址
     */
    private String address;

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
     * 获取主键id
     *
     * @return features_id - 主键id
     */
    public String getFeaturesId() {
        return featuresId;
    }

    /**
     * 设置主键id
     *
     * @param featuresId 主键id
     */
    public void setFeaturesId(String featuresId) {
        this.featuresId = featuresId == null ? null : featuresId.trim();
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
     * 获取商家编号
     *
     * @return manu_code - 商家编号
     */
    public String getManuCode() {
        return manuCode;
    }

    /**
     * 设置商家编号
     *
     * @param manuCode 商家编号
     */
    public void setManuCode(String manuCode) {
        this.manuCode = manuCode == null ? null : manuCode.trim();
    }

    /**
     * 获取商家
     *
     * @return manu_name - 商家
     */
    public String getManuName() {
        return manuName;
    }

    /**
     * 设置商家
     *
     * @param manuName 商家
     */
    public void setManuName(String manuName) {
        this.manuName = manuName == null ? null : manuName.trim();
    }

    /**
     * 获取商家助记码
     *
     * @return manu_mnem_code - 商家助记码
     */
    public String getManuMnemCode() {
        return manuMnemCode;
    }

    /**
     * 设置商家助记码
     *
     * @param manuMnemCode 商家助记码
     */
    public void setManuMnemCode(String manuMnemCode) {
        this.manuMnemCode = manuMnemCode == null ? null : manuMnemCode.trim();
    }

    /**
     * 获取流出方ID
     *
     * @return out_flow_side_id - 流出方ID
     */
    public String getOutFlowSideId() {
        return outFlowSideId;
    }

    /**
     * 设置流出方ID
     *
     * @param outFlowSideId 流出方ID
     */
    public void setOutFlowSideId(String outFlowSideId) {
        this.outFlowSideId = outFlowSideId == null ? null : outFlowSideId.trim();
    }

    /**
     * 获取流出方编号
     *
     * @return out_flow_side_code - 流出方编号
     */
    public String getOutFlowSideCode() {
        return outFlowSideCode;
    }

    /**
     * 设置流出方编号
     *
     * @param outFlowSideCode 流出方编号
     */
    public void setOutFlowSideCode(String outFlowSideCode) {
        this.outFlowSideCode = outFlowSideCode == null ? null : outFlowSideCode.trim();
    }

    /**
     * 获取流出方名称
     *
     * @return out_flow_side_name - 流出方名称
     */
    public String getOutFlowSideName() {
        return outFlowSideName;
    }

    /**
     * 设置流出方名称
     *
     * @param outFlowSideName 流出方名称
     */
    public void setOutFlowSideName(String outFlowSideName) {
        this.outFlowSideName = outFlowSideName == null ? null : outFlowSideName.trim();
    }

    /**
     * 获取流出方助记码
     *
     * @return out_flow_side_mnem_code - 流出方助记码
     */
    public String getOutFlowSideMnemCode() {
        return outFlowSideMnemCode;
    }

    /**
     * 设置流出方助记码
     *
     * @param outFlowSideMnemCode 流出方助记码
     */
    public void setOutFlowSideMnemCode(String outFlowSideMnemCode) {
        this.outFlowSideMnemCode = outFlowSideMnemCode == null ? null : outFlowSideMnemCode.trim();
    }

    /**
     * 获取流入方ID
     *
     * @return in_flow_side_id - 流入方ID
     */
    public String getInFlowSideId() {
        return inFlowSideId;
    }

    /**
     * 设置流入方ID
     *
     * @param inFlowSideId 流入方ID
     */
    public void setInFlowSideId(String inFlowSideId) {
        this.inFlowSideId = inFlowSideId == null ? null : inFlowSideId.trim();
    }

    /**
     * 获取流入方编号
     *
     * @return in_flow_side_code - 流入方编号
     */
    public String getInFlowSideCode() {
        return inFlowSideCode;
    }

    /**
     * 设置流入方编号
     *
     * @param inFlowSideCode 流入方编号
     */
    public void setInFlowSideCode(String inFlowSideCode) {
        this.inFlowSideCode = inFlowSideCode == null ? null : inFlowSideCode.trim();
    }

    /**
     * 获取流入方名称
     *
     * @return in_flow_side_name - 流入方名称
     */
    public String getInFlowSideName() {
        return inFlowSideName;
    }

    /**
     * 设置流入方名称
     *
     * @param inFlowSideName 流入方名称
     */
    public void setInFlowSideName(String inFlowSideName) {
        this.inFlowSideName = inFlowSideName == null ? null : inFlowSideName.trim();
    }

    /**
     * 获取流入方助记码
     *
     * @return in_flow_side_mnem_code - 流入方助记码
     */
    public String getInFlowSideMnemCode() {
        return inFlowSideMnemCode;
    }

    /**
     * 设置流入方助记码
     *
     * @param inFlowSideMnemCode 流入方助记码
     */
    public void setInFlowSideMnemCode(String inFlowSideMnemCode) {
        this.inFlowSideMnemCode = inFlowSideMnemCode == null ? null : inFlowSideMnemCode.trim();
    }

    /**
     * 获取收货地址
     *
     * @return address - 收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货地址
     *
     * @param address 收货地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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