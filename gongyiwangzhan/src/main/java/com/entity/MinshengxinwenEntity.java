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
 * 民生新闻
 *
 * @author 
 * @email
 */
@TableName("minshengxinwen")
public class MinshengxinwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MinshengxinwenEntity() {

	}

	public MinshengxinwenEntity(T t) {
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
     * 民生新闻名称
     */
    @TableField(value = "minshengxinwen_name")

    private String minshengxinwenName;


    /**
     * 民生新闻类型
     */
    @TableField(value = "minshengxinwen_types")

    private Integer minshengxinwenTypes;


    /**
     * 新闻照片
     */
    @TableField(value = "minshengxinwen_photo")

    private String minshengxinwenPhoto;


    /**
     * 新闻详情
     */
    @TableField(value = "minshengxinwen_content")

    private String minshengxinwenContent;


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
	 * 设置：民生新闻名称
	 */
    public String getMinshengxinwenName() {
        return minshengxinwenName;
    }


    /**
	 * 获取：民生新闻名称
	 */

    public void setMinshengxinwenName(String minshengxinwenName) {
        this.minshengxinwenName = minshengxinwenName;
    }
    /**
	 * 设置：民生新闻类型
	 */
    public Integer getMinshengxinwenTypes() {
        return minshengxinwenTypes;
    }


    /**
	 * 获取：民生新闻类型
	 */

    public void setMinshengxinwenTypes(Integer minshengxinwenTypes) {
        this.minshengxinwenTypes = minshengxinwenTypes;
    }
    /**
	 * 设置：新闻照片
	 */
    public String getMinshengxinwenPhoto() {
        return minshengxinwenPhoto;
    }


    /**
	 * 获取：新闻照片
	 */

    public void setMinshengxinwenPhoto(String minshengxinwenPhoto) {
        this.minshengxinwenPhoto = minshengxinwenPhoto;
    }
    /**
	 * 设置：新闻详情
	 */
    public String getMinshengxinwenContent() {
        return minshengxinwenContent;
    }


    /**
	 * 获取：新闻详情
	 */

    public void setMinshengxinwenContent(String minshengxinwenContent) {
        this.minshengxinwenContent = minshengxinwenContent;
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
        return "Minshengxinwen{" +
            "id=" + id +
            ", minshengxinwenName=" + minshengxinwenName +
            ", minshengxinwenTypes=" + minshengxinwenTypes +
            ", minshengxinwenPhoto=" + minshengxinwenPhoto +
            ", minshengxinwenContent=" + minshengxinwenContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
