package cn.hassan.serviceprovider02.site.service.impl;

import cn.hassan.entities.Dept;
import cn.hassan.serviceprovider02.site.mapper.DeptMapper;
import cn.hassan.serviceprovider02.site.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept findDeptById(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }
}
