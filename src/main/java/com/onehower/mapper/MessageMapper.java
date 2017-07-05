package com.onehower.mapper;

import com.onehower.entity.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM \"message\"")
    List<Message> getList();

    @Select("SELECT * FROM \"message\" WHERE id=#{id}")
    Message findById(@Param("id") Long id);

    @Insert("INSERT INTO message (username, email, avatar, content, ip, ctime, utime)" +
            "VALUES (#{message.username}, #{message.email}, #{message.avatar}, #{message.content}, #{message.ip}::INET, " +
            "#{message.ctime}, #{message.utime})")
    Long insert(@Param("message") Message message);

    @Delete("DELETE FROM \"message\" WHERE id = #{id}")
    void delete(@Param("id") Long id);

    @Update("UPDATE \"message\" SET " +
            "username=#{message.username}, " +
            "email = #{message.email}, " +
            "avatar = #{message.avatar}, " +
            "content = #{message.content}, " +
            "ip = #{message.ip}::INET, " +
            "utime = #{message.utime} " +
            "WHERE id = #{id}")
    void update(@Param("id") Long id, @Param("message") Message message);
}
