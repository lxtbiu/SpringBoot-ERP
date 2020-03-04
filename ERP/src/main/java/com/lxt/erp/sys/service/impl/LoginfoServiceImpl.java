package com.lxt.erp.sys.service.impl;

import com.lxt.erp.sys.domain.Loginfo;
import com.lxt.erp.sys.mapper.LoginfoMapper;
import com.lxt.erp.sys.service.LoginfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老雷
 * @since 2019-09-21
 */
@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements LoginfoService {

}
