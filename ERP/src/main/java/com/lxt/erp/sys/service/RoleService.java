package com.lxt.erp.sys.service;

import com.lxt.erp.sys.domain.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2020-02-27
 */
public interface RoleService extends IService<Role> {
    //根据角色ID查询当前角色拥有的所有的权限或菜单ID
    List<Integer> queryRolePermissionIdsByRid(Integer roleId);
    //保存角色和菜单权限之间的关系
    void saveRolePermission(Integer rid, Integer[] ids);

    //查询当前用户拥有的角色ID集合
    List<Integer> queryUserRoleIdsByUid(Integer id);
}
