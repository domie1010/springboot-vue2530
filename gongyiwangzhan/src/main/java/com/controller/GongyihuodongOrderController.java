package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.GongyihuodongEntity;
import com.entity.GongyihuodongOrderEntity;
import com.entity.YonghuEntity;
import com.entity.view.GongyihuodongOrderView;
import com.service.*;
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
 * 公益活动预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gongyihuodongOrder")
public class GongyihuodongOrderController {
    private static final Logger logger = LoggerFactory.getLogger(GongyihuodongOrderController.class);

    @Autowired
    private GongyihuodongOrderService gongyihuodongOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private GongyihuodongService gongyihuodongService;
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
        PageUtils page = gongyihuodongOrderService.queryPage(params);

        //字典表数据转换
        List<GongyihuodongOrderView> list =(List<GongyihuodongOrderView>)page.getList();
        for(GongyihuodongOrderView c:list){
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
        GongyihuodongOrderEntity gongyihuodongOrder = gongyihuodongOrderService.selectById(id);
        if(gongyihuodongOrder !=null){
            //entity转view
            GongyihuodongOrderView view = new GongyihuodongOrderView();
            BeanUtils.copyProperties( gongyihuodongOrder , view );//把实体数据重构到view中

            //级联表
            GongyihuodongEntity gongyihuodong = gongyihuodongService.selectById(gongyihuodongOrder.getGongyihuodongId());
            if(gongyihuodong != null){
                BeanUtils.copyProperties( gongyihuodong , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setGongyihuodongId(gongyihuodong.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(gongyihuodongOrder.getYonghuId());
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
    public R save(@RequestBody GongyihuodongOrderEntity gongyihuodongOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gongyihuodongOrder:{}",this.getClass().getName(),gongyihuodongOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            gongyihuodongOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        gongyihuodongOrder.setInsertTime(new Date());
        gongyihuodongOrder.setCreateTime(new Date());
        gongyihuodongOrderService.insert(gongyihuodongOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GongyihuodongOrderEntity gongyihuodongOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,gongyihuodongOrder:{}",this.getClass().getName(),gongyihuodongOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            gongyihuodongOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        gongyihuodongOrderService.updateById(gongyihuodongOrder);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        gongyihuodongOrderService.deleteBatchIds(Arrays.asList(ids));
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
        PageUtils page = gongyihuodongOrderService.queryPage(params);

        //字典表数据转换
        List<GongyihuodongOrderView> list =(List<GongyihuodongOrderView>)page.getList();
        for(GongyihuodongOrderView c:list)
            dictionaryService.dictionaryConvert(c); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GongyihuodongOrderEntity gongyihuodongOrder = gongyihuodongOrderService.selectById(id);
            if(gongyihuodongOrder !=null){
                //entity转view
                GongyihuodongOrderView view = new GongyihuodongOrderView();
                BeanUtils.copyProperties( gongyihuodongOrder , view );//把实体数据重构到view中

                //级联表
                    GongyihuodongEntity gongyihuodong = gongyihuodongService.selectById(gongyihuodongOrder.getGongyihuodongId());
                if(gongyihuodong != null){
                    BeanUtils.copyProperties( gongyihuodong , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setGongyihuodongId(gongyihuodong.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(gongyihuodongOrder.getYonghuId());
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
    public R add(@RequestBody GongyihuodongOrderEntity gongyihuodongOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,gongyihuodongOrder:{}",this.getClass().getName(),gongyihuodongOrder.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            Wrapper<GongyihuodongOrderEntity> wrapper = new EntityWrapper<>();
            wrapper.eq("gongyihuodong_id",gongyihuodongOrder.getGongyihuodongId());
            wrapper.eq("yonghu_id",gongyihuodongOrder.getYonghuId());
            GongyihuodongOrderEntity gongyihuodongOrderEntity = gongyihuodongOrderService.selectOne(wrapper);
            if(gongyihuodongOrderEntity != null){
                return R.error(511,"您已经申请参与过此次活动");
            }

            gongyihuodongOrder.setCreateTime(new Date());
            gongyihuodongOrder.setInsertTime(new Date());
            gongyihuodongOrder.setGongyihuodongOrderTypes(1);
            gongyihuodongOrderService.insert(gongyihuodongOrder);//根据id更新
//            yonghuEntity.setNewMoney(balance);
//            yonghuService.updateById(yonghuEntity);
            return R.ok();
        }else{
            return R.error(511,"您没有权限支付订单");
        }
    }





}

