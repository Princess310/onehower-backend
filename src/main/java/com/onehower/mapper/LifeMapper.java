package com.onehower.mapper;

import com.onehower.entity.Life;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LifeMapper {

    @Select("SELECT * FROM \"life\"")
    List<Life> getList();

    @Select("SELECT * FROM \"life\" WHERE id=#{id}")
    Life findById(@Param("id") Long id);

    @Insert("INSERT INTO life (title, breif, content, pictures, audio, vedio, ctime, utime)" +
            "VALUES (#{life.title}, #{life.breif}, #{life.content}, #{life.pictures}, #{life.audio}, #{life.vedio}, " +
            "#{life.ctime}, #{life.utime})")
    Long insert(@Param("life") Life life);

    @Delete("DELETE FROM \"life\" WHERE id = #{id}")
    void delete(@Param("id") Long id);

    @Update("UPDATE \"life\" SET " +
            "title=#{life.title}, " +
            "breif = #{life.breif}, " +
            "content = #{life.content}, " +
            "pictures = #{life.pictures}, " +
            "audio = #{life.audio}, " +
            "vedio = #{life.vedio}, " +
            "utime = #{life.utime} " +
            "WHERE id = #{id}")
    void update(@Param("id") Long id, @Param("life") Life life);
}
