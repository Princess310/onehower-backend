package com.onehower.service;

import com.onehower.entity.Message;
import com.onehower.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageMapper messageMapper;

    public List<Message> getList() {
        return messageMapper.getList();
    }

    public Message getMessage(Long id) {
        return messageMapper.findById(id);
    }

    public Message addMessage(Message message) {
        message.setCtime(LocalDateTime.now());
        message.setUtime(LocalDateTime.now());
        messageMapper.insert(message);

        return message;
    }

    public void deleteMessage(Long id) {
        messageMapper.delete(id);
    }

    public void updateMessage(Long id, Message message) {
        message.setUtime(LocalDateTime.now());
        messageMapper.update(id, message);
    }
}
