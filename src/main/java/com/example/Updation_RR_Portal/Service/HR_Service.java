package com.example.Updation_RR_Portal.Service;

import com.example.Updation_RR_Portal.model.JoineeModel;
import com.example.Updation_RR_Portal.request.JoineeAddRequest;
import com.example.Updation_RR_Portal.response.JoineeAddResponse;

public interface HR_Service {

    JoineeAddResponse addJoinee(JoineeAddRequest joineeAddRequest);
}
