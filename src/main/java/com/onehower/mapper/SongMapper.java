package com.onehower.mapper;

import com.onehower.entity.Song;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SongMapper {

    @Select("SELECT * FROM \"song\" order by ctime desc")
    List<Song> getList();

    @Select("SELECT * FROM \"song\" WHERE id=#{id}")
    Song findById(@Param("id") Long id);

    @Insert("INSERT INTO song (name, audio, lyric, thumbnail, ctime, utime)" +
            "VALUES (#{song.name}, #{song.audio}, #{song.lyric}, #{song.thumbnail}, " +
            "#{song.ctime}, #{song.utime})")
    @Options(useGeneratedKeys = true, keyProperty = "song.id")
    Long insert(@Param("song") Song song);

    @Delete("DELETE FROM \"song\" WHERE id = #{id}")
    void delete(@Param("id") Long id);

    @Update("UPDATE \"song\" SET " +
            "name=#{song.name}, " +
            "audio = #{song.audio}, " +
            "lyric = #{song.lyric}, " +
            "thumbnail = #{song.thumbnail}, " +
            "utime = #{song.utime} " +
            "WHERE id = #{id}")
    void update(@Param("id") Long id, @Param("song") Song song);
}
