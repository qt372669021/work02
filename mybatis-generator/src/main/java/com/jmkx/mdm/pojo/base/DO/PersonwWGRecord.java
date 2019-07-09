package com.jmkx.mdm.pojo.base.DO;

import com.jmkx.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "person_wg_record")
public class PersonwWGRecord extends BaseEntity {
    private Integer id;

    private String name;

    @Column(name = "is_three_classes")
    private Integer isThreeClasses;

    private String year;

    private String mouth;

    @Column(name = "original_plate")
    private String originalPlate;

    @Column(name = "original_dept")
    private String originalDept;

    @Column(name = "original_job")
    private String originalJob;

    @Column(name = "original_class")
    private String originalClass;

    @Column(name = "punish_basis")
    private String punishBasis;

    private String wg;

    @Column(name = "administrative_sanction")
    private String administrativeSanction;

    @Column(name = "economic_punishment")
    private String economicPunishment;

    @Column(name = "punishment_code")
    private String punishmentCode;

    @Column(name = "zhu_ci")
    private String zhuCi;

    @Column(name = "behavior_class")
    private String behaviorClass;

    @Column(name = "wg_class")
    private String wgClass;

    private String price;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return is_three_classes
     */
    public Integer getIsThreeClasses() {
        return isThreeClasses;
    }

    /**
     * @param isThreeClasses
     */
    public void setIsThreeClasses(Integer isThreeClasses) {
        this.isThreeClasses = isThreeClasses;
    }

    /**
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * @return mouth
     */
    public String getMouth() {
        return mouth;
    }

    /**
     * @param mouth
     */
    public void setMouth(String mouth) {
        this.mouth = mouth == null ? null : mouth.trim();
    }

    /**
     * @return original_plate
     */
    public String getOriginalPlate() {
        return originalPlate;
    }

    /**
     * @param originalPlate
     */
    public void setOriginalPlate(String originalPlate) {
        this.originalPlate = originalPlate == null ? null : originalPlate.trim();
    }

    /**
     * @return original_dept
     */
    public String getOriginalDept() {
        return originalDept;
    }

    /**
     * @param originalDept
     */
    public void setOriginalDept(String originalDept) {
        this.originalDept = originalDept == null ? null : originalDept.trim();
    }

    /**
     * @return original_job
     */
    public String getOriginalJob() {
        return originalJob;
    }

    /**
     * @param originalJob
     */
    public void setOriginalJob(String originalJob) {
        this.originalJob = originalJob == null ? null : originalJob.trim();
    }

    /**
     * @return original_class
     */
    public String getOriginalClass() {
        return originalClass;
    }

    /**
     * @param originalClass
     */
    public void setOriginalClass(String originalClass) {
        this.originalClass = originalClass == null ? null : originalClass.trim();
    }

    /**
     * @return punish_basis
     */
    public String getPunishBasis() {
        return punishBasis;
    }

    /**
     * @param punishBasis
     */
    public void setPunishBasis(String punishBasis) {
        this.punishBasis = punishBasis == null ? null : punishBasis.trim();
    }

    /**
     * @return wg
     */
    public String getWg() {
        return wg;
    }

    /**
     * @param wg
     */
    public void setWg(String wg) {
        this.wg = wg == null ? null : wg.trim();
    }

    /**
     * @return administrative_sanction
     */
    public String getAdministrativeSanction() {
        return administrativeSanction;
    }

    /**
     * @param administrativeSanction
     */
    public void setAdministrativeSanction(String administrativeSanction) {
        this.administrativeSanction = administrativeSanction == null ? null : administrativeSanction.trim();
    }

    /**
     * @return economic_punishment
     */
    public String getEconomicPunishment() {
        return economicPunishment;
    }

    /**
     * @param economicPunishment
     */
    public void setEconomicPunishment(String economicPunishment) {
        this.economicPunishment = economicPunishment == null ? null : economicPunishment.trim();
    }

    /**
     * @return punishment_code
     */
    public String getPunishmentCode() {
        return punishmentCode;
    }

    /**
     * @param punishmentCode
     */
    public void setPunishmentCode(String punishmentCode) {
        this.punishmentCode = punishmentCode == null ? null : punishmentCode.trim();
    }

    /**
     * @return zhu_ci
     */
    public String getZhuCi() {
        return zhuCi;
    }

    /**
     * @param zhuCi
     */
    public void setZhuCi(String zhuCi) {
        this.zhuCi = zhuCi == null ? null : zhuCi.trim();
    }

    /**
     * @return behavior_class
     */
    public String getBehaviorClass() {
        return behaviorClass;
    }

    /**
     * @param behaviorClass
     */
    public void setBehaviorClass(String behaviorClass) {
        this.behaviorClass = behaviorClass == null ? null : behaviorClass.trim();
    }

    /**
     * @return wg_class
     */
    public String getWgClass() {
        return wgClass;
    }

    /**
     * @param wgClass
     */
    public void setWgClass(String wgClass) {
        this.wgClass = wgClass == null ? null : wgClass.trim();
    }

    /**
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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