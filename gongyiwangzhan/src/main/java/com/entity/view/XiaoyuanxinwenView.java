package com.entity.view;

import com.entity.XiaoyuanxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 校园新闻
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoyuanxinwen")
public class XiaoyuanxinwenView extends XiaoyuanxinwenEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 校园新闻类型的值
		*/
		private String xiaoyuanxinwenValue;



	public XiaoyuanxinwenView() {

	}

	public XiaoyuanxinwenView(XiaoyuanxinwenEntity xiaoyuanxinwenEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoyuanxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 校园新闻类型的值
			*/
			public String getXiaoyuanxinwenValue() {
				return xiaoyuanxinwenValue;
			}
			/**
			* 设置： 校园新闻类型的值
			*/
			public void setXiaoyuanxinwenValue(String xiaoyuanxinwenValue) {
				this.xiaoyuanxinwenValue = xiaoyuanxinwenValue;
			}












}
