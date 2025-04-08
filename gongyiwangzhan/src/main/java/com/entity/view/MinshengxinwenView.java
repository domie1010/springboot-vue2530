package com.entity.view;

import com.entity.MinshengxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 民生新闻
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("minshengxinwen")
public class MinshengxinwenView extends MinshengxinwenEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 民生新闻类型的值
		*/
		private String minshengxinwenValue;



	public MinshengxinwenView() {

	}

	public MinshengxinwenView(MinshengxinwenEntity minshengxinwenEntity) {
		try {
			BeanUtils.copyProperties(this, minshengxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 民生新闻类型的值
			*/
			public String getMinshengxinwenValue() {
				return minshengxinwenValue;
			}
			/**
			* 设置： 民生新闻类型的值
			*/
			public void setMinshengxinwenValue(String minshengxinwenValue) {
				this.minshengxinwenValue = minshengxinwenValue;
			}












}
