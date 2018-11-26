package cn.hassan.serviceconsumer.site.controller;

import cn.hassan.entities.Dept;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptConsummerController {

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "consumer 获取部门信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id", value = "部门ID", required = true, dataType = "Long", paramType = "path")
    )
    @RequestMapping(value = "/consumer/findDept/{id}")
    public ResponseEntity<Dept> findDeptById(@PathVariable Long id) {
        return restTemplate.getForEntity("http://127.0.0.1:8080/dept/findDept/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject("http://127.0.0.1:8080" + "/dept/discovery", Object.class);
    }
}
