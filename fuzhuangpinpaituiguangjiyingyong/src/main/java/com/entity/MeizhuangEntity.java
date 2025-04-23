package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品
 *
 * @author 
 * @email
 */
@TableName("meizhuang")
public class MeizhuangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeizhuangEntity() {

	}

	public MeizhuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 商品编号
     */
    @TableField(value = "meizhuang_uuid_number")

    private String meizhuangUuidNumber;


    /**
     * 商品名称
     */
    @TableField(value = "meizhuang_name")

    private String meizhuangName;


    /**
     * 商品照片
     */
    @TableField(value = "meizhuang_photo")

    private String meizhuangPhoto;


    /**
     * 商品类型
     */
    @TableField(value = "meizhuang_types")

    private Integer meizhuangTypes;


    /**
     * 商品二级类型
     */
    @TableField(value = "meizhuang_erji_types")

    private Integer meizhuangErjiTypes;


    /**
     * 商品状态
     */
    @TableField(value = "meizhuang_status_types")

    private Integer meizhuangStatusTypes;


    /**
     * 购买获得积分
     */
    @TableField(value = "meizhuang_price")

    private Integer meizhuangPrice;


    /**
     * 商品库存
     */
    @TableField(value = "meizhuang_kucun_number")

    private Integer meizhuangKucunNumber;


    /**
     * 商品原价
     */
    @TableField(value = "meizhuang_old_money")

    private Double meizhuangOldMoney;


    /**
     * 现价
     */
    @TableField(value = "meizhuang_new_money")

    private Double meizhuangNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "meizhuang_clicknum")

    private Integer meizhuangClicknum;


    /**
     * 商品介绍
     */
    @TableField(value = "meizhuang_content")

    private String meizhuangContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "meizhuang_delete")

    private Integer meizhuangDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商品编号
	 */
    public String getMeizhuangUuidNumber() {
        return meizhuangUuidNumber;
    }
    /**
	 * 获取：商品编号
	 */

    public void setMeizhuangUuidNumber(String meizhuangUuidNumber) {
        this.meizhuangUuidNumber = meizhuangUuidNumber;
    }
    /**
	 * 设置：商品名称
	 */
    public String getMeizhuangName() {
        return meizhuangName;
    }
    /**
	 * 获取：商品名称
	 */

    public void setMeizhuangName(String meizhuangName) {
        this.meizhuangName = meizhuangName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getMeizhuangPhoto() {
        return meizhuangPhoto;
    }
    /**
	 * 获取：商品照片
	 */

    public void setMeizhuangPhoto(String meizhuangPhoto) {
        this.meizhuangPhoto = meizhuangPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getMeizhuangTypes() {
        return meizhuangTypes;
    }
    /**
	 * 获取：商品类型
	 */

    public void setMeizhuangTypes(Integer meizhuangTypes) {
        this.meizhuangTypes = meizhuangTypes;
    }
    /**
	 * 设置：商品二级类型
	 */
    public Integer getMeizhuangErjiTypes() {
        return meizhuangErjiTypes;
    }
    /**
	 * 获取：商品二级类型
	 */

    public void setMeizhuangErjiTypes(Integer meizhuangErjiTypes) {
        this.meizhuangErjiTypes = meizhuangErjiTypes;
    }
    /**
	 * 设置：商品状态
	 */
    public Integer getMeizhuangStatusTypes() {
        return meizhuangStatusTypes;
    }
    /**
	 * 获取：商品状态
	 */

    public void setMeizhuangStatusTypes(Integer meizhuangStatusTypes) {
        this.meizhuangStatusTypes = meizhuangStatusTypes;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getMeizhuangPrice() {
        return meizhuangPrice;
    }
    /**
	 * 获取：购买获得积分
	 */

    public void setMeizhuangPrice(Integer meizhuangPrice) {
        this.meizhuangPrice = meizhuangPrice;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getMeizhuangKucunNumber() {
        return meizhuangKucunNumber;
    }
    /**
	 * 获取：商品库存
	 */

    public void setMeizhuangKucunNumber(Integer meizhuangKucunNumber) {
        this.meizhuangKucunNumber = meizhuangKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getMeizhuangOldMoney() {
        return meizhuangOldMoney;
    }
    /**
	 * 获取：商品原价
	 */

    public void setMeizhuangOldMoney(Double meizhuangOldMoney) {
        this.meizhuangOldMoney = meizhuangOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getMeizhuangNewMoney() {
        return meizhuangNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setMeizhuangNewMoney(Double meizhuangNewMoney) {
        this.meizhuangNewMoney = meizhuangNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getMeizhuangClicknum() {
        return meizhuangClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setMeizhuangClicknum(Integer meizhuangClicknum) {
        this.meizhuangClicknum = meizhuangClicknum;
    }
    /**
	 * 设置：商品介绍
	 */
    public String getMeizhuangContent() {
        return meizhuangContent;
    }
    /**
	 * 获取：商品介绍
	 */

    public void setMeizhuangContent(String meizhuangContent) {
        this.meizhuangContent = meizhuangContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMeizhuangDelete() {
        return meizhuangDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setMeizhuangDelete(Integer meizhuangDelete) {
        this.meizhuangDelete = meizhuangDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Meizhuang{" +
            "id=" + id +
            ", meizhuangUuidNumber=" + meizhuangUuidNumber +
            ", meizhuangName=" + meizhuangName +
            ", meizhuangPhoto=" + meizhuangPhoto +
            ", meizhuangTypes=" + meizhuangTypes +
            ", meizhuangErjiTypes=" + meizhuangErjiTypes +
            ", meizhuangStatusTypes=" + meizhuangStatusTypes +
            ", meizhuangPrice=" + meizhuangPrice +
            ", meizhuangKucunNumber=" + meizhuangKucunNumber +
            ", meizhuangOldMoney=" + meizhuangOldMoney +
            ", meizhuangNewMoney=" + meizhuangNewMoney +
            ", meizhuangClicknum=" + meizhuangClicknum +
            ", meizhuangContent=" + meizhuangContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", meizhuangDelete=" + meizhuangDelete +
            ", createTime=" + createTime +
        "}";
    }
}
