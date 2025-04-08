package com.entity.model;

import com.entity.GongyihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公益活动
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongyihuodongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动名称
     */
    private String gongyihuodongName;


    /**
     * 活动类型
     */
    private Integer gongyihuodongTypes;


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


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：活动名称
	 */
    public String getGongyihuodongName() {
        return gongyihuodongName;
    }


    /**
	 * 设置：活动名称
	 */
    public void setGongyihuodongName(String gongyihuodongName) {
        this.gongyihuodongName = gongyihuodongName;
    }
    /**
	 * 获取：活动类型
	 */
    public Integer getGongyihuodongTypes() {
        return gongyihuodongTypes;
    }


    /**
	 * 设置：活动类型
	 */
    public void setGongyihuodongTypes(Integer gongyihuodongTypes) {
        this.gongyihuodongTypes = gongyihuodongTypes;
    }
    /**
	 * 获取：活动照片
	 */
    public String getGongyihuodongPhoto() {
        return gongyihuodongPhoto;
    }


    /**
	 * 设置：活动照片
	 */
    public void setGongyihuodongPhoto(String gongyihuodongPhoto) {
        this.gongyihuodongPhoto = gongyihuodongPhoto;
    }
    /**
	 * 获取：活动详情
	 */
    public String getGongyihuodongContent() {
        return gongyihuodongContent;
    }


    /**
	 * 设置：活动详情
	 */
    public void setGongyihuodongContent(String gongyihuodongContent) {
        this.gongyihuodongContent = gongyihuodongContent;
    }
    /**
	 * 获取：参与时间
	 */
    public String getCanyuTime() {
        return canyuTime;
    }


    /**
	 * 设置：参与时间
	 */
    public void setCanyuTime(String canyuTime) {
        this.canyuTime = canyuTime;
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
