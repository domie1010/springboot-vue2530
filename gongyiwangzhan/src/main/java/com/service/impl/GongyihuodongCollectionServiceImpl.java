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

import com.dao.GongyihuodongCollectionDao;
import com.entity.GongyihuodongCollectionEntity;
import com.service.GongyihuodongCollectionService;
import com.entity.view.GongyihuodongCollectionView;

/**
 * 公益活动收藏 服务实现类
 */
@Service("gongyihuodongCollectionService")
@Transactional
public class GongyihuodongCollectionServiceImpl extends ServiceImpl<GongyihuodongCollectionDao, GongyihuodongCollectionEntity> implements GongyihuodongCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<GongyihuodongCollectionView> page =new Query<GongyihuodongCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
