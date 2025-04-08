package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.GongyihuodongOrderDao;
import com.entity.GongyihuodongOrderEntity;
import com.service.GongyihuodongOrderService;
import com.entity.view.GongyihuodongOrderView;

/**
 * 公益活动预约 服务实现类
 */
@Service("gongyihuodongOrderService")
@Transactional
public class GongyihuodongOrderServiceImpl extends ServiceImpl<GongyihuodongOrderDao, GongyihuodongOrderEntity> implements GongyihuodongOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<GongyihuodongOrderView> page =new Query<GongyihuodongOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
