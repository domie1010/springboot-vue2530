package com.entity.vo;

import com.entity.ZhiyuanzheshenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 志愿者申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhiyuanzheshenqing")
public class ZhiyuanzheshenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 申请内容
     */

    @TableField(value = "zhiyuanzheshenqing_content")
    private String zhiyuanzheshenqingContent;


    /**
     * 申请材料
     */

    @TableField(value = "zhiyuanzheshenqing_file")
    private String zhiyuanzheshenqingFile;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 是否同意
     */

    @TableField(value = "zhiyuanzheshenqing_yesno_types")
    private Integer zhiyuanzheshenqingYesnoTypes;


    /**
     * 创建时间
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请内容
	 */
    public String getZhiyuanzheshenqingContent() {
        return zhiyuanzheshenqingContent;
    }


    /**
	 * 获取：申请内容
	 */

    public void setZhiyuanzheshenqingContent(String zhiyuanzheshenqingContent) {
        this.zhiyuanzheshenqingContent = zhiyuanzheshenqingContent;
    }
    /**
	 * 设置：申请材料
	 */
    public String getZhiyuanzheshenqingFile() {
        return zhiyuanzheshenqingFile;
    }


    /**
	 * 获取：申请材料
	 */

    public void setZhiyuanzheshenqingFile(String zhiyuanzheshenqingFile) {
        this.zhiyuanzheshenqingFile = zhiyuanzheshenqingFile;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getZhiyuanzheshenqingYesnoTypes() {
        return zhiyuanzheshenqingYesnoTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setZhiyuanzheshenqingYesnoTypes(Integer zhiyuanzheshenqingYesnoTypes) {
        this.zhiyuanzheshenqingYesnoTypes = zhiyuanzheshenqingYesnoTypes;
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

}
