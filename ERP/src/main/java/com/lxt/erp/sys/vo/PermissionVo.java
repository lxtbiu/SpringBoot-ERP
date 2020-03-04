package com.lxt.erp.sys.vo;


import com.lxt.erp.sys.domain.Permission;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionVo extends Permission {

    private static final long serialVersionUID=1L;


    private Integer page=1;
    private Integer limit=10;
}
