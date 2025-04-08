package com.entity.vo;

import com.entity.GongyihuodongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公益活动
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongyihuodong")
public class GongyihuodongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 活动名称
     */

    @TableField(value = "gongyihuodong_name")
    private String gongyihuodongName;


    /**
     * 活动类型
     */

    @TableField(value = "gongyihuodong_types")
    private Integer gongyihuodongTypes;


    /**
     * 活动照片
     */

    @TableField(value = "gongyihuodong_photo")
    private String gongyihuodongPhoto;


    /**
     * 活动详情
     */

    @TableField(value = "gongyihuodong_content")
    private String gongyihuodongContent;


    /**
     * 参与时间
     */

    @TableField(value = "canyu_time")
    private String canyuTime;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：活动名称
	 */
    public String getGongyihuodongName() {
        return gongyihuodongName;
    }


    /**
	 * 获取：活动名称
	 */

    public void setGongyihuodongName(String gongyihuodongName) {
        this.gongyihuodongName = gongyihuodongName;
    }
    /**
	 * 设置：活动类型
	 */
    public Integer getGongyihuodongTypes() {
        return gongyihuodongTypes;
    }


    /**
	 * 获取：活动类型
	 */

    public void setGongyihuodongTypes(Integer gongyihuodongTypes) {
        this.gongyihuodongTypes = gongyihuodongTypes;
    }
    /**
	 * 设置：活动照片
	 */
    public String getGongyihuodongPhoto() {
        return gongyihuodongPhoto;
    }


    /**
	 * 获取：活动照片
	 */

    public void setGongyihuodongPhoto(String gongyihuodongPhoto) {
        this.gongyihuodongPhoto = gongyihuodongPhoto;
    }
    /**
	 * 设置：活动详情
	 */
    public String getGongyihuodongContent() {
        return gongyihuodongContent;
    }


    /**
	 * 获取：活动详情
	 */

    public void setGongyihuodongContent(String gongyihuodongContent) {
        this.gongyihuodongContent = gongyihuodongContent;
    }
    /**
	 * 设置：参与时间
	 */
    public String getCanyuTime() {
        return canyuTime;
    }


    /**
	 * 获取：参与时间
	 */

    public void setCanyuTime(String canyuTime) {
        this.canyuTime = canyuTime;
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
