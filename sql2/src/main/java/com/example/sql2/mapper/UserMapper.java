package com.example.sql2.mapper;
import com.example.sql2.entity.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    //根据ID查找用户
 /*   @Select("select * from user where id=#{id})
    public int findbyid(int id);*/
    //查询所有用户
    @Select("select * from user")
    public List<user> find();
    //增加用户
    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")
    public int insert(user user);
    //更新用户
    @Update("update user set username=#{username},password=#{password},#{birthday}) where id=#{id}")
    public int update(user user);

}
