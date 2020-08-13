package com.czxy.xuecheng.manage_cms.controller;

import com.czxy.xuecheng.api.cms.CmsPageControllerApi;
import com.czxy.xuecheng.common.model.response.QueryResponseResult;
import com.czxy.xuecheng.domain.cms.CmsPage;
import com.czxy.xuecheng.domain.cms.request.QueryPageRequest;
import com.czxy.xuecheng.domain.cms.response.CmsPageResult;
import com.czxy.xuecheng.manage_cms.service.PageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhandehuang@itcast.cn
 * @version 1.0
 * @date 2020/6/29 0029
 **/
@RestController
@RequestMapping("/cms/page")
public class CmsPageController  implements CmsPageControllerApi {
    @Resource
    private PageService pageService;

    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {

/*        //模拟数据 QueryResponseResult 查询响应对象：响应状态 + 响应数据
        //1 数据
        QueryResult<CmsPage> queryResult =new QueryResult<>();
        List<CmsPage> list = new ArrayList<>();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        queryResult.setTotal(1);

        //2 设置状态
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;*/

        return pageService.findList(page,size,queryPageRequest);

    }

    @Override
    public CmsPageResult add(CmsPage cmsPage) {
        return null;
    }
}
