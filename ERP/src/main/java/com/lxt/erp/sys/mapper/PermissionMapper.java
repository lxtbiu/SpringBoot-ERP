package com.lxt.erp.sys.mapper;

import com.lxt.erp.sys.domain.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2020-02-25
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    //根据权限或者菜单id删除权限表和角色的关系表的数据
    void deleteRolePermissionByPid(@Param("id") Serializable id);
}
