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
 * 校园新闻
 *
 * @author 
 * @email
 */
@TableName("xiaoyuanxinwen")
public class XiaoyuanxinwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaoyuanxinwenEntity() {

	}

	public XiaoyuanxinwenEntity(T t) {
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
     * 校园新闻名称
     */
    @TableField(value = "xiaoyuanxinwen_name")

    private String xiaoyuanxinwenName;


    /**
     * 校园新闻类型
     */
    @TableField(value = "xiaoyuanxinwen_types")

    private Integer xiaoyuanxinwenTypes;


    /**
     * 新闻照片
     */
    @TableField(value = "xiaoyuanxinwen_photo")

    private String xiaoyuanxinwenPhoto;


    /**
     * 新闻详情
     */
    @TableField(value = "xiaoyuanxinwen_content")

    private String xiaoyuanxinwenContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：校园新闻名称
	 */
    public String getXiaoyuanxinwenName() {
        return xiaoyuanxinwenName;
    }


    /**
	 * 获取：校园新闻名称
	 */

    public void setXiaoyuanxinwenName(String xiaoyuanxinwenName) {
        this.xiaoyuanxinwenName = xiaoyuanxinwenName;
    }
    /**
	 * 设置：校园新闻类型
	 */
    public Integer getXiaoyuanxinwenTypes() {
        return xiaoyuanxinwenTypes;
    }


    /**
	 * 获取：校园新闻类型
	 */

    public void setXiaoyuanxinwenTypes(Integer xiaoyuanxinwenTypes) {
        this.xiaoyuanxinwenTypes = xiaoyuanxinwenTypes;
    }
    /**
	 * 设置：新闻照片
	 */
    public String getXiaoyuanxinwenPhoto() {
        return xiaoyuanxinwenPhoto;
    }


    /**
	 * 获取：新闻照片
	 */

    public void setXiaoyuanxinwenPhoto(String xiaoyuanxinwenPhoto) {
        this.xiaoyuanxinwenPhoto = xiaoyuanxinwenPhoto;
    }
    /**
	 * 设置：新闻详情
	 */
    public String getXiaoyuanxinwenContent() {
        return xiaoyuanxinwenContent;
    }


    /**
	 * 获取：新闻详情
	 */

    public void setXiaoyuanxinwenContent(String xiaoyuanxinwenContent) {
        this.xiaoyuanxinwenContent = xiaoyuanxinwenContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Xiaoyuanxinwen{" +
            "id=" + id +
            ", xiaoyuanxinwenName=" + xiaoyuanxinwenName +
            ", xiaoyuanxinwenTypes=" + xiaoyuanxinwenTypes +
            ", xiaoyuanxinwenPhoto=" + xiaoyuanxinwenPhoto +
            ", xiaoyuanxinwenContent=" + xiaoyuanxinwenContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
