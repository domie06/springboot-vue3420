package com.entity.model;

import com.entity.MeizhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeizhuangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品编号
     */
    private String meizhuangUuidNumber;


    /**
     * 商品名称
     */
    private String meizhuangName;


    /**
     * 商品照片
     */
    private String meizhuangPhoto;


    /**
     * 商品类型
     */
    private Integer meizhuangTypes;


    /**
     * 商品二级类型
     */
    private Integer meizhuangErjiTypes;


    /**
     * 商品状态
     */
    private Integer meizhuangStatusTypes;


    /**
     * 购买获得积分
     */
    private Integer meizhuangPrice;


    /**
     * 商品库存
     */
    private Integer meizhuangKucunNumber;


    /**
     * 商品原价
     */
    private Double meizhuangOldMoney;


    /**
     * 现价
     */
    private Double meizhuangNewMoney;


    /**
     * 点击次数
     */
    private Integer meizhuangClicknum;


    /**
     * 商品介绍
     */
    private String meizhuangContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer meizhuangDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商品编号
	 */
    public String getMeizhuangUuidNumber() {
        return meizhuangUuidNumber;
    }


    /**
	 * 设置：商品编号
	 */
    public void setMeizhuangUuidNumber(String meizhuangUuidNumber) {
        this.meizhuangUuidNumber = meizhuangUuidNumber;
    }
    /**
	 * 获取：商品名称
	 */
    public String getMeizhuangName() {
        return meizhuangName;
    }


    /**
	 * 设置：商品名称
	 */
    public void setMeizhuangName(String meizhuangName) {
        this.meizhuangName = meizhuangName;
    }
    /**
	 * 获取：商品照片
	 */
    public String getMeizhuangPhoto() {
        return meizhuangPhoto;
    }


    /**
	 * 设置：商品照片
	 */
    public void setMeizhuangPhoto(String meizhuangPhoto) {
        this.meizhuangPhoto = meizhuangPhoto;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getMeizhuangTypes() {
        return meizhuangTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setMeizhuangTypes(Integer meizhuangTypes) {
        this.meizhuangTypes = meizhuangTypes;
    }
    /**
	 * 获取：商品二级类型
	 */
    public Integer getMeizhuangErjiTypes() {
        return meizhuangErjiTypes;
    }


    /**
	 * 设置：商品二级类型
	 */
    public void setMeizhuangErjiTypes(Integer meizhuangErjiTypes) {
        this.meizhuangErjiTypes = meizhuangErjiTypes;
    }
    /**
	 * 获取：商品状态
	 */
    public Integer getMeizhuangStatusTypes() {
        return meizhuangStatusTypes;
    }


    /**
	 * 设置：商品状态
	 */
    public void setMeizhuangStatusTypes(Integer meizhuangStatusTypes) {
        this.meizhuangStatusTypes = meizhuangStatusTypes;
    }
    /**
	 * 获取：购买获得积分
	 */
    public Integer getMeizhuangPrice() {
        return meizhuangPrice;
    }


    /**
	 * 设置：购买获得积分
	 */
    public void setMeizhuangPrice(Integer meizhuangPrice) {
        this.meizhuangPrice = meizhuangPrice;
    }
    /**
	 * 获取：商品库存
	 */
    public Integer getMeizhuangKucunNumber() {
        return meizhuangKucunNumber;
    }


    /**
	 * 设置：商品库存
	 */
    public void setMeizhuangKucunNumber(Integer meizhuangKucunNumber) {
        this.meizhuangKucunNumber = meizhuangKucunNumber;
    }
    /**
	 * 获取：商品原价
	 */
    public Double getMeizhuangOldMoney() {
        return meizhuangOldMoney;
    }


    /**
	 * 设置：商品原价
	 */
    public void setMeizhuangOldMoney(Double meizhuangOldMoney) {
        this.meizhuangOldMoney = meizhuangOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getMeizhuangNewMoney() {
        return meizhuangNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setMeizhuangNewMoney(Double meizhuangNewMoney) {
        this.meizhuangNewMoney = meizhuangNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getMeizhuangClicknum() {
        return meizhuangClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setMeizhuangClicknum(Integer meizhuangClicknum) {
        this.meizhuangClicknum = meizhuangClicknum;
    }
    /**
	 * 获取：商品介绍
	 */
    public String getMeizhuangContent() {
        return meizhuangContent;
    }


    /**
	 * 设置：商品介绍
	 */
    public void setMeizhuangContent(String meizhuangContent) {
        this.meizhuangContent = meizhuangContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getMeizhuangDelete() {
        return meizhuangDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setMeizhuangDelete(Integer meizhuangDelete) {
        this.meizhuangDelete = meizhuangDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
