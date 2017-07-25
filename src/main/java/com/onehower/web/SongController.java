package com.onehower.web;

import com.onehower.entity.Song;
import com.onehower.service.SongService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {

    @Autowired
    SongService songService;

    @ApiOperation(value = "获取歌单列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Song> list() {
        return songService.getList();
    }

    @ApiOperation(value = "获取歌单详情", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Song getSong(@PathVariable Long id) {
        return songService.getSong(id);
    }

    @ApiOperation(value="创建歌单", notes="根据Song对象创建动态")
    @ApiImplicitParam(name = "song", value = "歌单详细实体song", required = true, dataType = "Song")
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String addSong(@RequestBody Song song) {
        songService.addSong(song);
        return "success";
    }

    @ApiOperation(value = "删除歌单", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delSong(@PathVariable Long id) {
        songService.deleteSong(id);

        return "success";
    }

    @ApiOperation(value = "更新歌单", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateMoment(@PathVariable Long id, @RequestBody Song song) {
        songService.updateSong(id, song);

        return "success";
    }
}
