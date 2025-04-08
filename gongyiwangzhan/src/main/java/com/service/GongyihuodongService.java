package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyihuodongEntity;
import java.util.Map;

/**
 * 公益活动 服务类
 */
public interface GongyihuodongService extends IService<GongyihuodongEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}