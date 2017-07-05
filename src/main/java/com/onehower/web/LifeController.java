package com.onehower.web;

import com.onehower.entity.Life;
import com.onehower.service.LifeService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/life")
public class LifeController {

    @Autowired
    LifeService lifeService;

    @ApiOperation(value = "获取足迹列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Life> list() {
        return lifeService.getList();
    }

    @ApiOperation(value = "获取足迹详情", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Life getLife(@PathVariable Long id) {
        return lifeService.getLife(id);
    }

    @ApiOperation(value="创建足迹", notes="根据Message对象创建留言")
    @ApiImplicitParam(name = "life", value = "足迹详细实体Life", required = true, dataType = "Life")
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String addLife(@RequestBody Life life) {
        lifeService.addLife(life);
        return "success";
    }

    @ApiOperation(value = "删除足迹", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delLife(@PathVariable Long id) {
        lifeService.deleteLife(id);

        return "success";
    }

    @ApiOperation(value = "更新足迹", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateMessage(@PathVariable Long id, @RequestBody Life life) {
        lifeService.updateLife(id, life);

        return "success";
    }
}
