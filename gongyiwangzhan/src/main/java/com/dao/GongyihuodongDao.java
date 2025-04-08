package com.dao;

import com.entity.GongyihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyihuodongView;

/**
 * 公益活动 Dao 接口
 *
 * @author 
 */
public interface GongyihuodongDao extends BaseMapper<GongyihuodongEntity> {

   List<GongyihuodongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
