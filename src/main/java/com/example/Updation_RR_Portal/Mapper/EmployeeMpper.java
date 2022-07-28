package com.example.Updation_RR_Portal.Mapper;


import com.example.Updation_RR_Portal.model.UserModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMpper {

    @Select("select id,user_name,password,role from users where user_name=#{username}")
    UserModel getname(String userName);

    @Update("UPDATE users SET jwt=#{token} WHERE id=#{id}")
    void updateToken(String token, Integer id);

//    @Insert("Insert into employee(name,age) values(#{name},#{age})")
//    void add(EmployeeRequest employeeRequest);
//
//    @Select("select * from employee")
//    List<EmployeeResponse> getAll();
//
//    @Delete("delete from employee where id=#{id}")
//    void delete(Integer id);
//
//    @Update("update employee set name=#{employeeRequest.name},age=#{employeeRequest.age} where id=#{id}")
//    void update(Integer id, EmployeeRequest employeeRequest);
}
