package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.MinshengxinwenEntity;
import com.entity.view.MinshengxinwenView;
import com.service.DictionaryService;
import com.service.MinshengxinwenService;
import com.service.TokenService;
import com.service.YonghuService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 民生新闻
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/minshengxinwen")
public class MinshengxinwenController {
    private static final Logger logger = LoggerFactory.getLogger(MinshengxinwenController.class);

    @Autowired
    private MinshengxinwenService minshengxinwenService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("orderBy","id");
        PageUtils page = minshengxinwenService.queryPage(params);

        //字典表数据转换
        List<MinshengxinwenView> list =(List<MinshengxinwenView>)page.getList();
        for(MinshengxinwenView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MinshengxinwenEntity minshengxinwen = minshengxinwenService.selectById(id);
        if(minshengxinwen !=null){
            //entity转view
            MinshengxinwenView view = new MinshengxinwenView();
            BeanUtils.copyProperties( minshengxinwen , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody MinshengxinwenEntity minshengxinwen, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,minshengxinwen:{}",this.getClass().getName(),minshengxinwen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        Wrapper<MinshengxinwenEntity> queryWrapper = new EntityWrapper<MinshengxinwenEntity>()
            .eq("minshengxinwen_name", minshengxinwen.getMinshengxinwenName())
            .eq("minshengxinwen_types", minshengxinwen.getMinshengxinwenTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MinshengxinwenEntity minshengxinwenEntity = minshengxinwenService.selectOne(queryWrapper);
        if(minshengxinwenEntity==null){
            minshengxinwen.setInsertTime(new Date());
            minshengxinwen.setCreateTime(new Date());
            minshengxinwenService.insert(minshengxinwen);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody MinshengxinwenEntity minshengxinwen, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,minshengxinwen:{}",this.getClass().getName(),minshengxinwen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<MinshengxinwenEntity> queryWrapper = new EntityWrapper<MinshengxinwenEntity>()
            .notIn("id",minshengxinwen.getId())
            .andNew()
            .eq("minshengxinwen_name", minshengxinwen.getMinshengxinwenName())
            .eq("minshengxinwen_types", minshengxinwen.getMinshengxinwenTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MinshengxinwenEntity minshengxinwenEntity = minshengxinwenService.selectOne(queryWrapper);
        if("".equals(minshengxinwen.getMinshengxinwenPhoto()) || "null".equals(minshengxinwen.getMinshengxinwenPhoto())){
                minshengxinwen.setMinshengxinwenPhoto(null);
        }
        if(minshengxinwenEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      minshengxinwen.set
            //  }
            minshengxinwenService.updateById(minshengxinwen);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        minshengxinwenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = minshengxinwenService.queryPage(params);

        //字典表数据转换
        List<MinshengxinwenView> list =(List<MinshengxinwenView>)page.getList();
        for(MinshengxinwenView c:list)
            dictionaryService.dictionaryConvert(c); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MinshengxinwenEntity minshengxinwen = minshengxinwenService.selectById(id);
            if(minshengxinwen !=null){
                //entity转view
                MinshengxinwenView view = new MinshengxinwenView();
                BeanUtils.copyProperties( minshengxinwen , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody MinshengxinwenEntity minshengxinwen, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,minshengxinwen:{}",this.getClass().getName(),minshengxinwen.toString());
        Wrapper<MinshengxinwenEntity> queryWrapper = new EntityWrapper<MinshengxinwenEntity>()
            .eq("minshengxinwen_name", minshengxinwen.getMinshengxinwenName())
            .eq("minshengxinwen_types", minshengxinwen.getMinshengxinwenTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MinshengxinwenEntity minshengxinwenEntity = minshengxinwenService.selectOne(queryWrapper);
        if(minshengxinwenEntity==null){
            minshengxinwen.setInsertTime(new Date());
            minshengxinwen.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      minshengxinwen.set
        //  }
        minshengxinwenService.insert(minshengxinwen);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

