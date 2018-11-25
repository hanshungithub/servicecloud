package cn.hassan.serviceprovider.site.controller;

import cn.hassan.entities.Dept;
import cn.hassan.serviceprovider.site.service.DeptService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @ApiOperation(value="获取部门详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "部门ID", required = true, dataType = "Long", paramType = "path")
    })
    @RequestMapping(value="/dept/findDept/{id}")
    public Dept findDeptById(@PathVariable Long id) {
        return deptService.findDeptById(id);
    }
}
