package com.entity.view;

import com.entity.ZhiyuanzheshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 志愿者申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhiyuanzheshenqing")
public class ZhiyuanzheshenqingView extends ZhiyuanzheshenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否同意的值
		*/
		private String zhiyuanzheshenqingYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户照片
			*/
			private String yonghuPhoto;
			/**
			* 角色
			*/
			private Integer roleTypes;
				/**
				* 角色的值
				*/
				private String roleValue;

	public ZhiyuanzheshenqingView() {

	}

	public ZhiyuanzheshenqingView(ZhiyuanzheshenqingEntity zhiyuanzheshenqingEntity) {
		try {
			BeanUtils.copyProperties(this, zhiyuanzheshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否同意的值
			*/
			public String getZhiyuanzheshenqingYesnoValue() {
				return zhiyuanzheshenqingYesnoValue;
			}
			/**
			* 设置： 是否同意的值
			*/
			public void setZhiyuanzheshenqingYesnoValue(String zhiyuanzheshenqingYesnoValue) {
				this.zhiyuanzheshenqingYesnoValue = zhiyuanzheshenqingYesnoValue;
			}


















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 角色
					*/
					public Integer getRoleTypes() {
						return roleTypes;
					}
					/**
					* 设置： 角色
					*/
					public void setRoleTypes(Integer roleTypes) {
						this.roleTypes = roleTypes;
					}


						/**
						* 获取： 角色的值
						*/
						public String getRoleValue() {
							return roleValue;
						}
						/**
						* 设置： 角色的值
						*/
						public void setRoleValue(String roleValue) {
							this.roleValue = roleValue;
						}




}
