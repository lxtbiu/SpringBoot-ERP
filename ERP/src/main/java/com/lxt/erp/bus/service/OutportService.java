package com.lxt.erp.bus.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lxt.erp.bus.domain.Outport;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老雷
 * @since 2019-09-28
 */
public interface OutportService extends IService<Outport> {

	/**
	 * 退货
	 * @param id  进货单ID
	 * @param number  退货数量
	 * @param remark  备注
	 */
	void addOutPort(Integer id, Integer number, String remark);

}
