package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.YonghuEntity;
import com.entity.ZhiyuanzheshenqingEntity;
import com.entity.view.ZhiyuanzheshenqingView;
import com.service.DictionaryService;
import com.service.TokenService;
import com.service.YonghuService;
import com.service.ZhiyuanzheshenqingService;
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
 * 志愿者申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhiyuanzheshenqing")
public class ZhiyuanzheshenqingController {
    private static final Logger logger = LoggerFactory.getLogger(ZhiyuanzheshenqingController.class);

    @Autowired
    private ZhiyuanzheshenqingService zhiyuanzheshenqingService;


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
        PageUtils page = zhiyuanzheshenqingService.queryPage(params);

        //字典表数据转换
        List<ZhiyuanzheshenqingView> list =(List<ZhiyuanzheshenqingView>)page.getList();
        for(ZhiyuanzheshenqingView c:list){
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
        ZhiyuanzheshenqingEntity zhiyuanzheshenqing = zhiyuanzheshenqingService.selectById(id);
        if(zhiyuanzheshenqing !=null){
            //entity转view
            ZhiyuanzheshenqingView view = new ZhiyuanzheshenqingView();
            BeanUtils.copyProperties( zhiyuanzheshenqing , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(zhiyuanzheshenqing.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
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
    public R save(@RequestBody ZhiyuanzheshenqingEntity zhiyuanzheshenqing, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhiyuanzheshenqing:{}",this.getClass().getName(),zhiyuanzheshenqing.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role)){
            YonghuEntity yonghuEntity = yonghuService.selectById(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
            if(yonghuEntity == null){
                return R.error(511,"查不到该用户");
            }
            if(yonghuEntity.getRoleTypes() == 2){
                return R.error(511,"您已经是志愿者");
            }

            zhiyuanzheshenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
            zhiyuanzheshenqing.setZhiyuanzheshenqingYesnoTypes(1);
        }

        zhiyuanzheshenqing.setInsertTime(new Date());
        zhiyuanzheshenqing.setCreateTime(new Date());
        zhiyuanzheshenqingService.insert(zhiyuanzheshenqing);
        return R.ok();

    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhiyuanzheshenqingEntity zhiyuanzheshenqing, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhiyuanzheshenqing:{}",this.getClass().getName(),zhiyuanzheshenqing.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            zhiyuanzheshenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        if("".equals(zhiyuanzheshenqing.getZhiyuanzheshenqingFile()) || "null".equals(zhiyuanzheshenqing.getZhiyuanzheshenqingFile())){
                zhiyuanzheshenqing.setZhiyuanzheshenqingFile(null);
        }
        if(zhiyuanzheshenqing.getZhiyuanzheshenqingYesnoTypes() == 2){
            YonghuEntity yonghuEntity = yonghuService.selectById(zhiyuanzheshenqing.getYonghuId());
            if(yonghuEntity == null)
                return R.error(511,"查不到用户");
            yonghuEntity.setRoleTypes(2);
            yonghuService.updateById(yonghuEntity);
        }
        zhiyuanzheshenqingService.updateById(zhiyuanzheshenqing);//根据id更新
        return R.ok();

    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zhiyuanzheshenqingService.deleteBatchIds(Arrays.asList(ids));
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
        PageUtils page = zhiyuanzheshenqingService.queryPage(params);

        //字典表数据转换
        List<ZhiyuanzheshenqingView> list =(List<ZhiyuanzheshenqingView>)page.getList();
        for(ZhiyuanzheshenqingView c:list)
            dictionaryService.dictionaryConvert(c); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhiyuanzheshenqingEntity zhiyuanzheshenqing = zhiyuanzheshenqingService.selectById(id);
            if(zhiyuanzheshenqing !=null){
                //entity转view
                ZhiyuanzheshenqingView view = new ZhiyuanzheshenqingView();
                BeanUtils.copyProperties( zhiyuanzheshenqing , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(zhiyuanzheshenqing.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
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
    public R add(@RequestBody ZhiyuanzheshenqingEntity zhiyuanzheshenqing, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhiyuanzheshenqing:{}",this.getClass().getName(),zhiyuanzheshenqing.toString());

        if(zhiyuanzheshenqing.getYonghuId() == null)
            return R.error(511,"用户不能为空");
        YonghuEntity yonghuEntity = yonghuService.selectById(zhiyuanzheshenqing.getYonghuId());
        if(yonghuEntity == null)
            return R.error(511,"查不到用户");
        if(yonghuEntity.getRoleTypes() ==2) {
            return R.error(511, "您已经是志愿者");
        }

        zhiyuanzheshenqing.setInsertTime(new Date());
        zhiyuanzheshenqing.setCreateTime(new Date());
        zhiyuanzheshenqing.setZhiyuanzheshenqingYesnoTypes(1);
        zhiyuanzheshenqingService.insert(zhiyuanzheshenqing);
        return R.ok();

    }





}

