package com.entity.vo;

import com.entity.MinshengxinwenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 民生新闻
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("minshengxinwen")
public class MinshengxinwenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
