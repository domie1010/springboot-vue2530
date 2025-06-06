<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

var menus = [

	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"轮播图管理",
                        "menuJump":"列表",
                        "tableName":"config"
                    }
                ],
                "menu":"轮播图管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"用户管理",
                        "menuJump":"列表",
                        "tableName":"yonghu"
                    }
                ],
                "menu":"用户管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"志愿者申请管理",
                        "menuJump":"列表",
                        "tableName":"zhiyuanzheshenqing"
                    }
                ],
                "menu":"志愿者申请管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公益活动管理",
                        "menuJump":"列表",
                        "tableName":"gongyihuodong"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公益活动收藏管理",
                        "menuJump":"列表",
                        "tableName":"gongyihuodongCollection"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公益活动参与管理",
                        "menuJump":"列表",
                        "tableName":"gongyihuodongOrder"
                    }
                ],
                "menu":"公益活动管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"物品捐赠管理",
                        "menuJump":"列表",
                        "tableName":"juanzeng"
                    }
                ],
                "menu":"物品捐赠管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"民生新闻管理",
                        "menuJump":"列表",
                        "tableName":"minshengxinwen"
                    }
					,{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"校园新闻管理",
                        "menuJump":"列表",
                        "tableName":"xiaoyuanxinwen"
                    }
                ],
                "menu":"新闻管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公益活动类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryGongyihuodong"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"物品类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryWupin"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"民生新闻类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryMinshengxinwen"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"校园新闻类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryXiaoyuanxinwen"
                    }

                ],
                "menu":"基础数据管理"
            }
        ],
        "frontMenu":[

        ],
        "roleName":"管理员",
        "tableName":"users"
    }
	,
	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增"
                        ],
                        "menu":"志愿者申请管理",
                        "menuJump":"列表",
                        "tableName":"zhiyuanzheshenqing"
                    }
                ],
                "menu":"志愿者申请管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"公益活动管理",
                        "menuJump":"列表",
                        "tableName":"gongyihuodong"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"公益活动收藏管理",
                        "menuJump":"列表",
                        "tableName":"gongyihuodongCollection"
                    }
                    ,
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"公益活动参与管理",
                        "menuJump":"列表",
                        "tableName":"gongyihuodongOrder"
                    }
                ],
                "menu":"公益活动管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增"
                        ],
                        "menu":"物品捐赠管理",
                        "menuJump":"列表",
                        "tableName":"juanzeng"
                    }
                ],
                "menu":"物品捐赠管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"民生新闻管理",
                        "menuJump":"列表",
                        "tableName":"minshengxinwen"
                    }
					,{
                        "buttons":[
                            "查看"
                        ],
                        "menu":"校园新闻管理",
                        "menuJump":"列表",
                        "tableName":"xiaoyuanxinwen"
                    }
                ],
                "menu":"新闻管理"
            }
        ],
        "frontMenu":[

        ],
        "roleName":"用户",
        "tableName":"yonghu"
    }
];

var hasMessage = '';
