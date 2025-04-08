package com.dao;

import com.entity.XiaoyuanxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanxinwenView;

/**
 * 校园新闻 Dao 接口
 *
 * @author 
 */
public interface XiaoyuanxinwenDao extends BaseMapper<XiaoyuanxinwenEntity> {

   List<XiaoyuanxinwenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
