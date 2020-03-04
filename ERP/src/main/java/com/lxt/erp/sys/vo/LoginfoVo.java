package com.lxt.erp.sys.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.lxt.erp.sys.domain.Loginfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class LoginfoVo extends Loginfo{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer page=1;
	private Integer limit=10;
	
	private Integer[] ids;//接收多个ID
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime;
}
