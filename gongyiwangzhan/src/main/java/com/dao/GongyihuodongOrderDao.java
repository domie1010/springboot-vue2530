package com.dao;

import com.entity.GongyihuodongOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyihuodongOrderView;

/**
 * 公益活动预约 Dao 接口
 *
 * @author 
 */
public interface GongyihuodongOrderDao extends BaseMapper<GongyihuodongOrderEntity> {

   List<GongyihuodongOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
