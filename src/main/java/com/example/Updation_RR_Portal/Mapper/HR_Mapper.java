package com.example.Updation_RR_Portal.Mapper;

import com.example.Updation_RR_Portal.model.JoineeModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;

@Mapper
public interface HR_Mapper {

    @Insert("Insert into joinee_tbl(name,gender,college,domain,role,application_status,approving_status,created_by,updated_by,delete_flag,doj)" +
            "values(#{name},#{gender},#{college},#{domain},#{role},#{application_status},#{approving_status},#{created_by},#{updated_by},#{delete_flag},#{doj})")
    void saveJoinee(JoineeModel joineeModel);
    @Update("update joinee_tbl set password=#{password} where name=#{name}")
    void addjoineePassword(String name, String password);
}
