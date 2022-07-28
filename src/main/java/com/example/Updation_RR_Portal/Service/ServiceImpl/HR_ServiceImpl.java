package com.example.Updation_RR_Portal.Service.ServiceImpl;

import com.example.Updation_RR_Portal.Mapper.HR_Mapper;
import com.example.Updation_RR_Portal.Service.HR_Service;
import com.example.Updation_RR_Portal.model.JoineeModel;
import com.example.Updation_RR_Portal.request.JoineeAddRequest;
import com.example.Updation_RR_Portal.response.JoineeAddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.time.LocalDateTime;

@Service
public class HR_ServiceImpl implements HR_Service {

    @Autowired
    private HR_Mapper hr_mapper;
    @Override
    public JoineeAddResponse addJoinee(JoineeAddRequest joineeAddRequest) {
        JoineeModel joineeModel=new JoineeModel();
        joineeModel.setName(joineeAddRequest.getName());
        joineeModel.setGender(joineeAddRequest.getGender());
        joineeModel.setCollege(joineeAddRequest.getCollege());
        joineeModel.setDomain(joineeAddRequest.getDomain());
        joineeModel.setDoj(joineeAddRequest.getDoj());
        joineeModel.setRole(joineeAddRequest.getRole());
        joineeModel.setApplication_status("INCOMPLETE YOUR APPLICATION");
        joineeModel.setApproving_status("PENDING YOUR APPLICATION");
        joineeModel.setCreated_by(LocalDateTime.now());
        joineeModel.setUpdated_by(LocalDateTime.now());
        joineeModel.setDelete_flag(false);
        hr_mapper.saveJoinee(joineeModel);

        JoineeAddResponse joineeAddResponse=new JoineeAddResponse();
        joineeAddResponse.setUsername(joineeAddRequest.getName());
        String password=joineeAddRequest.getName()+"123";
        joineeAddResponse.setPassword(password);
        joineeAddResponse.setRole(joineeAddRequest.getRole());
        joineeAddResponse.setMessage("Welcome to Ionixxtechnologies"+joineeAddRequest.getName());
       hr_mapper.addjoineePassword(joineeAddRequest.getName(),password);

        return joineeAddResponse;
    }
}
