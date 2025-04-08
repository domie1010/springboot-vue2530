package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyihuodongOrderEntity;
import java.util.Map;

/**
 * 公益活动预约 服务类
 */
public interface GongyihuodongOrderService extends IService<GongyihuodongOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}