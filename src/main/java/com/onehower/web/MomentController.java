package com.onehower.web;

import com.onehower.entity.Moment;
import com.onehower.service.MomentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moment")
public class MomentController {

    @Autowired
    MomentService momentService;

    @ApiOperation(value = "获取动态列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Moment> list() {
        return momentService.getList();
    }

    @ApiOperation(value = "获取动态详情", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Moment getMoment(@ModelAttribute Long id) {
        return momentService.getMoment(id);
    }

    @ApiOperation(value="创建动态", notes="根据Moment对象创建动态")
    @ApiImplicitParam(name = "moment", value = "动态详细实体moment", required = true, dataType = "Moment")
    @RequestMapping(value="", method=RequestMethod.POST)
    public String addMoment(@RequestBody Moment moment) {
        momentService.addMoment(moment);
        return "success";
    }

    @ApiOperation(value = "删除动态", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delMoment(@PathVariable Long id) {
        momentService.deleteMoment(id);

        return "success";
    }

    @ApiOperation(value = "更新动态", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateMoment(@PathVariable Long id, @RequestBody Moment moment) {
        momentService.updateMoment(id, moment);

        return "success";
    }
}
