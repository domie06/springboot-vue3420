package com.entity.view;

import com.entity.MeizhuangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meizhuang")
public class MeizhuangView extends MeizhuangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 商品类型的值
		*/
		private String meizhuangValue;
		/**
		* 商品二级类型的值
		*/
		private String meizhuangErjiValue;
		/**
		* 商品状态的值
		*/
		private String meizhuangStatusValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public MeizhuangView() {

	}

	public MeizhuangView(MeizhuangEntity meizhuangEntity) {
		try {
			BeanUtils.copyProperties(this, meizhuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 商品类型的值
			*/
			public String getMeizhuangValue() {
				return meizhuangValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setMeizhuangValue(String meizhuangValue) {
				this.meizhuangValue = meizhuangValue;
			}
			/**
			* 获取： 商品二级类型的值
			*/
			public String getMeizhuangErjiValue() {
				return meizhuangErjiValue;
			}
			/**
			* 设置： 商品二级类型的值
			*/
			public void setMeizhuangErjiValue(String meizhuangErjiValue) {
				this.meizhuangErjiValue = meizhuangErjiValue;
			}
			/**
			* 获取： 商品状态的值
			*/
			public String getMeizhuangStatusValue() {
				return meizhuangStatusValue;
			}
			/**
			* 设置： 商品状态的值
			*/
			public void setMeizhuangStatusValue(String meizhuangStatusValue) {
				this.meizhuangStatusValue = meizhuangStatusValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}














}
