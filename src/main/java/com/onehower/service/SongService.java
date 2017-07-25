package com.onehower.service;

import com.onehower.entity.Song;
import com.onehower.mapper.SongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SongService {
    @Autowired
    private SongMapper songMapper;

    public List<Song> getList() {
        return songMapper.getList();
    }

    public Song getSong(Long id) {
        return songMapper.findById(id);
    }

    public Long addSong(Song song) {
        song.setCtime(LocalDateTime.now());
        song.setUtime(LocalDateTime.now());
        return songMapper.insert(song);
    }

    public void deleteSong(Long id) {
        songMapper.delete(id);
    }

    public void updateSong(Long id, Song song) {
        song.setUtime(LocalDateTime.now());
        songMapper.update(id, song);
    }
}
