package com.entity.view;

import com.entity.JuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 物品捐赠
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("juanzeng")
public class JuanzengView extends JuanzengEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 物品类型的值
		*/
		private String wupinValue;
		/**
		* 是否接收的值
		*/
		private String juanzengValue;



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

	public JuanzengView() {

	}

	public JuanzengView(JuanzengEntity juanzengEntity) {
		try {
			BeanUtils.copyProperties(this, juanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 物品类型的值
			*/
			public String getWupinValue() {
				return wupinValue;
			}
			/**
			* 设置： 物品类型的值
			*/
			public void setWupinValue(String wupinValue) {
				this.wupinValue = wupinValue;
			}
			/**
			* 获取： 是否接收的值
			*/
			public String getJuanzengValue() {
				return juanzengValue;
			}
			/**
			* 设置： 是否接收的值
			*/
			public void setJuanzengValue(String juanzengValue) {
				this.juanzengValue = juanzengValue;
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
