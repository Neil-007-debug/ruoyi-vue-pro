package cn.iocoder.dashboard.modules.tool.controller.codegen.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("代码生成表和字段的明细 Response VO")
@Data
public class ToolCodegenDetailRespVO {

    @ApiModelProperty("表定义")
    private ToolCodegenTableRespVO table;

    @ApiModelProperty("字段定义")
    private List<ToolCodegenColumnRespVO> columns;

}