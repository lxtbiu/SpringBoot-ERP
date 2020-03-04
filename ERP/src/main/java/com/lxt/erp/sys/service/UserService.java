package com.lxt.erp.sys.service;

import com.lxt.erp.sys.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老雷
 * @since 2019-09-20
 */
public interface UserService extends IService<User> {

//    保存用户和角色的关系
    void saveUserRole(Integer uid, Integer[] ids);
}
