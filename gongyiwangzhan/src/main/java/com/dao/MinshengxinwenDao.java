package com.dao;

import com.entity.MinshengxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MinshengxinwenView;

/**
 * 民生新闻 Dao 接口
 *
 * @author 
 */
public interface MinshengxinwenDao extends BaseMapper<MinshengxinwenEntity> {

   List<MinshengxinwenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
