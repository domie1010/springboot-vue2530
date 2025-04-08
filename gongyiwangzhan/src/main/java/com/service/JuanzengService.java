package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuanzengEntity;
import java.util.Map;

/**
 * 物品捐赠 服务类
 */
public interface JuanzengService extends IService<JuanzengEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}