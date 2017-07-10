package com.onehower.mapper;

import com.onehower.entity.Moment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MomentMapper {

    @Select("SELECT id, type, content, pictures, audio, vedio, tags, ctime, utime FROM \"moment\" order by ctime desc")
    List<Moment> getList();

    @Select("SELECT * FROM \"moment\" WHERE id=#{id}")
    Moment findById(@Param("id") Long id);

    @Insert("INSERT INTO moment (type, content, article, pictures, audio, vedio, tags, ctime, utime)" +
            "VALUES (#{moment.type}, #{moment.content}, #{moment.article}, #{moment.pictures}, #{moment.audio}, " +
            "#{moment.vedio}, #{moment.tags}, #{moment.ctime}, #{moment.utime})")
    Long insert(@Param("moment") Moment moment);

    @Delete("DELETE FROM \"moment\" WHERE id = #{id}")
    void delete(@Param("id") Long id);

    @Update("UPDATE \"moment\" SET " +
            "type=#{moment.type}, " +
            "content = #{moment.content}, " +
            "article = #{moment.article}, " +
            "pictures = #{moment.pictures}, " +
            "audio = #{moment.audio}, " +
            "vedio = #{moment.vedio}, " +
            "tags = #{moment.tags}, " +
            "utime = #{moment.utime} " +
            "WHERE id = #{id}")
    void update(@Param("id") Long id, @Param("moment") Moment moment);
}
