package com.onehower.service;

import com.onehower.entity.Moment;
import com.onehower.mapper.MomentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MomentService {
    @Autowired
    private MomentMapper momentMapper;

    public List<Moment> getList() {
        return momentMapper.getList();
    }

    public Moment getMoment(Long id) {
        return momentMapper.findById(id);
    }

    public Long addMoment(Moment moment) {
        moment.setCtime(LocalDateTime.now());
        moment.setUtime(LocalDateTime.now());
        return momentMapper.insert(moment);
    }

    public void deleteMoment(Long id) {
        momentMapper.delete(id);
    }

    public void updateMoment(Long id, Moment moment) {
        moment.setUtime(LocalDateTime.now());
        momentMapper.update(id, moment);
    }
}

