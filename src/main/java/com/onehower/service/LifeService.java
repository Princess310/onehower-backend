package com.onehower.service;

import com.onehower.entity.Life;
import com.onehower.mapper.LifeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LifeService {

    @Autowired
    LifeMapper lifeMapper;

    public List<Life> getList() {
        return lifeMapper.getList();
    }

    public Life getLife(Long id) {
        return lifeMapper.findById(id);
    }

    public Long addLife(Life life) {
        life.setCtime(LocalDateTime.now());
        life.setUtime(LocalDateTime.now());
        return lifeMapper.insert(life);
    }

    public void deleteLife(Long id) {
        lifeMapper.delete(id);
    }

    public void updateLife(Long id, Life life) {
        life.setUtime(LocalDateTime.now());
        lifeMapper.update(id, life);
    }
}
