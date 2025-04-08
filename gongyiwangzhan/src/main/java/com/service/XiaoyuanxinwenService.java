package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanxinwenEntity;
import java.util.Map;

/**
 * 校园新闻 服务类
 */
public interface XiaoyuanxinwenService extends IService<XiaoyuanxinwenEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}