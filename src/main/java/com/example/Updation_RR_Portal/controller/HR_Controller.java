package com.example.Updation_RR_Portal.controller;

import com.example.Updation_RR_Portal.Service.HR_Service;
import com.example.Updation_RR_Portal.model.JoineeModel;
import com.example.Updation_RR_Portal.request.JoineeAddRequest;
import com.example.Updation_RR_Portal.response.JoineeAddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HR_Panel")
public class HR_Controller {

    @Autowired
    private HR_Service hr_service;

    @PostMapping("/addJoinee")
    public ResponseEntity<JoineeAddResponse> addJoinee(@RequestBody JoineeAddRequest joineeAddRequest){
        JoineeAddResponse joineeAddResponse=hr_service.addJoinee(joineeAddRequest);
        return new ResponseEntity<>(joineeAddResponse, HttpStatus.CREATED);
    }

}
