package com.entity.model;

import com.entity.MinshengxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 民生新闻
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MinshengxinwenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 民生新闻名称
     */
    private String minshengxinwenName;


    /**
     * 民生新闻类型
     */
    private Integer minshengxinwenTypes;


    /**
     * 新闻照片
     */
    private String minshengxinwenPhoto;


    /**
     * 新闻详情
     */
    private String minshengxinwenContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：民生新闻名称
	 */
    public String getMinshengxinwenName() {
        return minshengxinwenName;
    }


    /**
	 * 设置：民生新闻名称
	 */
    public void setMinshengxinwenName(String minshengxinwenName) {
        this.minshengxinwenName = minshengxinwenName;
    }
    /**
	 * 获取：民生新闻类型
	 */
    public Integer getMinshengxinwenTypes() {
        return minshengxinwenTypes;
    }


    /**
	 * 设置：民生新闻类型
	 */
    public void setMinshengxinwenTypes(Integer minshengxinwenTypes) {
        this.minshengxinwenTypes = minshengxinwenTypes;
    }
    /**
	 * 获取：新闻照片
	 */
    public String getMinshengxinwenPhoto() {
        return minshengxinwenPhoto;
    }


    /**
	 * 设置：新闻照片
	 */
    public void setMinshengxinwenPhoto(String minshengxinwenPhoto) {
        this.minshengxinwenPhoto = minshengxinwenPhoto;
    }
    /**
	 * 获取：新闻详情
	 */
    public String getMinshengxinwenContent() {
        return minshengxinwenContent;
    }


    /**
	 * 设置：新闻详情
	 */
    public void setMinshengxinwenContent(String minshengxinwenContent) {
        this.minshengxinwenContent = minshengxinwenContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
