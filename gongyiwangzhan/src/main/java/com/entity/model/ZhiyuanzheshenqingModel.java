package com.entity.model;

import com.entity.ZhiyuanzheshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 志愿者申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhiyuanzheshenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请内容
     */
    private String zhiyuanzheshenqingContent;


    /**
     * 申请材料
     */
    private String zhiyuanzheshenqingFile;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 是否同意
     */
    private Integer zhiyuanzheshenqingYesnoTypes;


    /**
     * 创建时间
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请内容
	 */
    public String getZhiyuanzheshenqingContent() {
        return zhiyuanzheshenqingContent;
    }


    /**
	 * 设置：申请内容
	 */
    public void setZhiyuanzheshenqingContent(String zhiyuanzheshenqingContent) {
        this.zhiyuanzheshenqingContent = zhiyuanzheshenqingContent;
    }
    /**
	 * 获取：申请材料
	 */
    public String getZhiyuanzheshenqingFile() {
        return zhiyuanzheshenqingFile;
    }


    /**
	 * 设置：申请材料
	 */
    public void setZhiyuanzheshenqingFile(String zhiyuanzheshenqingFile) {
        this.zhiyuanzheshenqingFile = zhiyuanzheshenqingFile;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getZhiyuanzheshenqingYesnoTypes() {
        return zhiyuanzheshenqingYesnoTypes;
    }


    /**
	 * 设置：是否同意
	 */
    public void setZhiyuanzheshenqingYesnoTypes(Integer zhiyuanzheshenqingYesnoTypes) {
        this.zhiyuanzheshenqingYesnoTypes = zhiyuanzheshenqingYesnoTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
