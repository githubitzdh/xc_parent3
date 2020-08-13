package com.czxy.xuecheng.api.cms;

import com.czxy.xuecheng.common.model.response.QueryResponseResult;
import com.czxy.xuecheng.domain.cms.CmsPage;
import com.czxy.xuecheng.domain.cms.request.QueryPageRequest;
import com.czxy.xuecheng.domain.cms.response.CmsPageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author zhandehuang@itcast.cn
 * @version 1.0
 * @date 2020/6/29 0029
 **/
@Api(value = "cms页面管理接口", description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {
    //页面查询
    @ApiOperation("页面查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int")
    })
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);


    //新增页面
    @ApiOperation("新增页面")
    public CmsPageResult add(CmsPage cmsPage);
}
