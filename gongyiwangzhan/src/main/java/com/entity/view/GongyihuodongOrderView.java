package com.entity.view;

import com.entity.GongyihuodongOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 公益活动预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongyihuodong_order")
public class GongyihuodongOrderView extends GongyihuodongOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否同意的值
		*/
		private String gongyihuodongOrderValue;



		//级联表 gongyihuodong
			/**
			* 活动名称
			*/
			private String gongyihuodongName;
			/**
			* 活动类型
			*/
			private Integer gongyihuodongTypes;
				/**
				* 活动类型的值
				*/
				private String gongyihuodongValue;
			/**
			* 活动照片
			*/
			private String gongyihuodongPhoto;
			/**
			* 活动详情
			*/
			private String gongyihuodongContent;
			/**
			* 参与时间
			*/
			private String canyuTime;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 发布时间
			*/
			private Date insertTime;

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

	public GongyihuodongOrderView() {

	}

	public GongyihuodongOrderView(GongyihuodongOrderEntity gongyihuodongOrderEntity) {
		try {
			BeanUtils.copyProperties(this, gongyihuodongOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否同意的值
			*/
			public String getGongyihuodongOrderValue() {
				return gongyihuodongOrderValue;
			}
			/**
			* 设置： 是否同意的值
			*/
			public void setGongyihuodongOrderValue(String gongyihuodongOrderValue) {
				this.gongyihuodongOrderValue = gongyihuodongOrderValue;
			}







				//级联表的get和set gongyihuodong
					/**
					* 获取： 活动名称
					*/
					public String getGongyihuodongName() {
						return gongyihuodongName;
					}
					/**
					* 设置： 活动名称
					*/
					public void setGongyihuodongName(String gongyihuodongName) {
						this.gongyihuodongName = gongyihuodongName;
					}
					/**
					* 获取： 活动类型
					*/
					public Integer getGongyihuodongTypes() {
						return gongyihuodongTypes;
					}
					/**
					* 设置： 活动类型
					*/
					public void setGongyihuodongTypes(Integer gongyihuodongTypes) {
						this.gongyihuodongTypes = gongyihuodongTypes;
					}


						/**
						* 获取： 活动类型的值
						*/
						public String getGongyihuodongValue() {
							return gongyihuodongValue;
						}
						/**
						* 设置： 活动类型的值
						*/
						public void setGongyihuodongValue(String gongyihuodongValue) {
							this.gongyihuodongValue = gongyihuodongValue;
						}
					/**
					* 获取： 活动照片
					*/
					public String getGongyihuodongPhoto() {
						return gongyihuodongPhoto;
					}
					/**
					* 设置： 活动照片
					*/
					public void setGongyihuodongPhoto(String gongyihuodongPhoto) {
						this.gongyihuodongPhoto = gongyihuodongPhoto;
					}
					/**
					* 获取： 活动详情
					*/
					public String getGongyihuodongContent() {
						return gongyihuodongContent;
					}
					/**
					* 设置： 活动详情
					*/
					public void setGongyihuodongContent(String gongyihuodongContent) {
						this.gongyihuodongContent = gongyihuodongContent;
					}
					/**
					* 获取： 参与时间
					*/
					public String getCanyuTime() {
						return canyuTime;
					}
					/**
					* 设置： 参与时间
					*/
					public void setCanyuTime(String canyuTime) {
						this.canyuTime = canyuTime;
					}
					/**
					* 获取： 发布时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 发布时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
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
