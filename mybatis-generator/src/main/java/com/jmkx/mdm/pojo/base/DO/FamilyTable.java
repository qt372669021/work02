package com.jmkx.mdm.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "family_table")
public class FamilyTable extends BaseEntity {
    private Integer id;

    @Column(name = "oa_code")
    private String oaCode;

    @Column(name = "leader_name")
    private String leaderName;

    @Column(name = "q_or_shu")
    private String qOrShu;

    private String call;

    @Column(name = "q_or_shu_oa_code")
    private String qOrShuOaCode;

    @Column(name = "q_or_shu_name")
    private String qOrShuName;

    private String remarks;

    private String maker;

    @Column(name = "maker_time")
    private Date makerTime;

    private String modifyer;

    @Column(name = "modify_time")
    private Date modifyTime;

    private Integer dr;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return oa_code
     */
    public String getOaCode() {
        return oaCode;
    }

    /**
     * @param oaCode
     */
    public void setOaCode(String oaCode) {
        this.oaCode = oaCode == null ? null : oaCode.trim();
    }

    /**
     * @return leader_name
     */
    public String getLeaderName() {
        return leaderName;
    }

    /**
     * @param leaderName
     */
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    /**
     * @return q_or_shu
     */
    public String getqOrShu() {
        return qOrShu;
    }

    /**
     * @param qOrShu
     */
    public void setqOrShu(String qOrShu) {
        this.qOrShu = qOrShu == null ? null : qOrShu.trim();
    }

    /**
     * @return call
     */
    public String getCall() {
        return call;
    }

    /**
     * @param call
     */
    public void setCall(String call) {
        this.call = call == null ? null : call.trim();
    }

    /**
     * @return q_or_shu_oa_code
     */
    public String getqOrShuOaCode() {
        return qOrShuOaCode;
    }

    /**
     * @param qOrShuOaCode
     */
    public void setqOrShuOaCode(String qOrShuOaCode) {
        this.qOrShuOaCode = qOrShuOaCode == null ? null : qOrShuOaCode.trim();
    }

    /**
     * @return q_or_shu_name
     */
    public String getqOrShuName() {
        return qOrShuName;
    }

    /**
     * @param qOrShuName
     */
    public void setqOrShuName(String qOrShuName) {
        this.qOrShuName = qOrShuName == null ? null : qOrShuName.trim();
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * @return maker
     */
    public String getMaker() {
        return maker;
    }

    /**
     * @param maker
     */
    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    /**
     * @return maker_time
     */
    public Date getMakerTime() {
        return makerTime;
    }

    /**
     * @param makerTime
     */
    public void setMakerTime(Date makerTime) {
        this.makerTime = makerTime;
    }

    /**
     * @return modifyer
     */
    public String getModifyer() {
        return modifyer;
    }

    /**
     * @param modifyer
     */
    public void setModifyer(String modifyer) {
        this.modifyer = modifyer == null ? null : modifyer.trim();
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return dr
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * @param dr
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}