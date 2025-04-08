package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinshengxinwenEntity;
import java.util.Map;

/**
 * 民生新闻 服务类
 */
public interface MinshengxinwenService extends IService<MinshengxinwenEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}