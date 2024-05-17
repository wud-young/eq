package com.cafuc.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
   /* @Select("select * from user where uid=#{U_id} AND uPassword =#{U_password}")
    @Results(id = "userMap",value = {
            @Result(id = true,column ="uId",property = "U_id]")
            }
    )*/
}
