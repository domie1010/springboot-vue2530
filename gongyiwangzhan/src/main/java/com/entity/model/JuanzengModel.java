package com.entity.model;

import com.entity.JuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物品捐赠
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JuanzengModel implements Serializable {
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
     * 物品名字
     */
    private String wupinName;


    /**
     * 物品类型
     */
    private Integer wupinTypes;


    /**
     * 物品数量
     */
    private Integer wupinNumber;


    /**
     * 取件地址
     */
    private String qujianAddress;


    /**
     * 捐赠详情
     */
    private String juanzengContent;


    /**
     * 是否接收
     */
    private Integer juanzengTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：物品名字
	 */
    public String getWupinName() {
        return wupinName;
    }


    /**
	 * 设置：物品名字
	 */
    public void setWupinName(String wupinName) {
        this.wupinName = wupinName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getWupinTypes() {
        return wupinTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setWupinTypes(Integer wupinTypes) {
        this.wupinTypes = wupinTypes;
    }
    /**
	 * 获取：物品数量
	 */
    public Integer getWupinNumber() {
        return wupinNumber;
    }


    /**
	 * 设置：物品数量
	 */
    public void setWupinNumber(Integer wupinNumber) {
        this.wupinNumber = wupinNumber;
    }
    /**
	 * 获取：取件地址
	 */
    public String getQujianAddress() {
        return qujianAddress;
    }


    /**
	 * 设置：取件地址
	 */
    public void setQujianAddress(String qujianAddress) {
        this.qujianAddress = qujianAddress;
    }
    /**
	 * 获取：捐赠详情
	 */
    public String getJuanzengContent() {
        return juanzengContent;
    }


    /**
	 * 设置：捐赠详情
	 */
    public void setJuanzengContent(String juanzengContent) {
        this.juanzengContent = juanzengContent;
    }
    /**
	 * 获取：是否接收
	 */
    public Integer getJuanzengTypes() {
        return juanzengTypes;
    }


    /**
	 * 设置：是否接收
	 */
    public void setJuanzengTypes(Integer juanzengTypes) {
        this.juanzengTypes = juanzengTypes;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
