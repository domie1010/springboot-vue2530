package com.entity.model;

import com.entity.XiaoyuanxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 校园新闻
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoyuanxinwenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 校园新闻名称
     */
    private String xiaoyuanxinwenName;


    /**
     * 校园新闻类型
     */
    private Integer xiaoyuanxinwenTypes;


    /**
     * 新闻照片
     */
    private String xiaoyuanxinwenPhoto;


    /**
     * 新闻详情
     */
    private String xiaoyuanxinwenContent;


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
	 * 获取：校园新闻名称
	 */
    public String getXiaoyuanxinwenName() {
        return xiaoyuanxinwenName;
    }


    /**
	 * 设置：校园新闻名称
	 */
    public void setXiaoyuanxinwenName(String xiaoyuanxinwenName) {
        this.xiaoyuanxinwenName = xiaoyuanxinwenName;
    }
    /**
	 * 获取：校园新闻类型
	 */
    public Integer getXiaoyuanxinwenTypes() {
        return xiaoyuanxinwenTypes;
    }


    /**
	 * 设置：校园新闻类型
	 */
    public void setXiaoyuanxinwenTypes(Integer xiaoyuanxinwenTypes) {
        this.xiaoyuanxinwenTypes = xiaoyuanxinwenTypes;
    }
    /**
	 * 获取：新闻照片
	 */
    public String getXiaoyuanxinwenPhoto() {
        return xiaoyuanxinwenPhoto;
    }


    /**
	 * 设置：新闻照片
	 */
    public void setXiaoyuanxinwenPhoto(String xiaoyuanxinwenPhoto) {
        this.xiaoyuanxinwenPhoto = xiaoyuanxinwenPhoto;
    }
    /**
	 * 获取：新闻详情
	 */
    public String getXiaoyuanxinwenContent() {
        return xiaoyuanxinwenContent;
    }


    /**
	 * 设置：新闻详情
	 */
    public void setXiaoyuanxinwenContent(String xiaoyuanxinwenContent) {
        this.xiaoyuanxinwenContent = xiaoyuanxinwenContent;
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
