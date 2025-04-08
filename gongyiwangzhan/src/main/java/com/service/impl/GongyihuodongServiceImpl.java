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

import com.dao.GongyihuodongDao;
import com.entity.GongyihuodongEntity;
import com.service.GongyihuodongService;
import com.entity.view.GongyihuodongView;

/**
 * 公益活动 服务实现类
 */
@Service("gongyihuodongService")
@Transactional
public class GongyihuodongServiceImpl extends ServiceImpl<GongyihuodongDao, GongyihuodongEntity> implements GongyihuodongService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<GongyihuodongView> page =new Query<GongyihuodongView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
