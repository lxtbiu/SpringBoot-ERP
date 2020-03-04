package com.lxt.erp.sys.mapper;

import com.lxt.erp.sys.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2020-02-27
 */
public interface RoleMapper extends BaseMapper<Role> {
    //根据角色id删除sys_role_permission
    void deleteRolePermissionByRid(Serializable id);
    //根据角色id删除sys_Role_user
    void deleteRoleUserByRid(Serializable id);

    //根据角色ID查询当前角色拥有的所有的权限或菜单ID
    List<Integer> queryRolePermissionIdsByRid(Integer roleId);


    void saveRolePermission(@Param("rid") Integer rid, @Param("pid") Integer pid);

    //根据用户ID删除用户角色中间表的数据
    void deleteRoleUserByUid(@Param("id") Serializable id);

    //查询当前用户拥有的角色ID集合
    List<Integer> queryUserRoleIdsByUid(Integer id);

    //保存用户和角色的关系
    void insertUserRole(@Param("uid") Integer uid, @Param("rid") Integer rid);
}
