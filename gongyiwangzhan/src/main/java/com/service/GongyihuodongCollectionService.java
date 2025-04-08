package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyihuodongCollectionEntity;
import java.util.Map;

/**
 * 公益活动收藏 服务类
 */
public interface GongyihuodongCollectionService extends IService<GongyihuodongCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}