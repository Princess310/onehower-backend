package com.onehower.mapper;

import com.onehower.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM \"user\"")
    List<User> getList();

    @Insert("INSERT INTO \"user\" (name, password, avatar, \"isAdmin\", ctime, utime) VALUES (#{name}, #{password}, #{avatar}, #{isAdmin}, #{ctime}, #{utime})")
    Long insert(@Param("name") String name,
                @Param("password") String password,
                @Param("avatar") String avatar,
                @Param("isAdmin") Boolean isAdmin,
                @Param("ctime") LocalDateTime ctime,
                @Param("utime") LocalDateTime utim);
}
