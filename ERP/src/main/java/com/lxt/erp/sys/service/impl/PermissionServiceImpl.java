package com.lxt.erp.sys.service.impl;

import com.lxt.erp.sys.domain.Permission;
import com.lxt.erp.sys.mapper.PermissionMapper;
import com.lxt.erp.sys.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2020-02-25
 */
@Service
@Transactional
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

    @Override
    public boolean removeById(Serializable id) {
        PermissionMapper permissionMapper = this.getBaseMapper();
        //根据权限或者菜单id删除权限表和角色的关系表的数据
        permissionMapper.deleteRolePermissionByPid(id);
        return super.removeById(id);
    }
}
