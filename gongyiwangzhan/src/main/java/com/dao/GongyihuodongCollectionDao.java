package com.dao;

import com.entity.GongyihuodongCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyihuodongCollectionView;

/**
 * 公益活动收藏 Dao 接口
 *
 * @author 
 */
public interface GongyihuodongCollectionDao extends BaseMapper<GongyihuodongCollectionEntity> {

   List<GongyihuodongCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
