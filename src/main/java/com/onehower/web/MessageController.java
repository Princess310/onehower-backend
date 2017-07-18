package com.onehower.web;

import com.onehower.entity.Message;
import com.onehower.service.MessageService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @ApiOperation(value = "获取留言列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Message> list() {
        return messageService.getList();
    }

    @ApiOperation(value = "获取留言详情", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Message getMessage(@PathVariable Long id) {
        return messageService.getMessage(id);
    }

    @ApiOperation(value="创建留言", notes="根据Message对象创建留言")
    @ApiImplicitParam(name = "message", value = "留言详细实体Life", required = true, dataType = "Message")
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public Message addMessage(@RequestBody Message message) {
        return messageService.addMessage(message);
    }

    @ApiOperation(value = "删除留言", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delMessage(@PathVariable Long id) {
        messageService.deleteMessage(id);

        return "success";
    }

    @ApiOperation(value = "更新留言", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateMessage(@PathVariable Long id, @RequestBody Message message) {
        messageService.updateMessage(id, message);

        return "success";
    }
}
