package com.example.Updation_RR_Portal.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoineeAddRequest {
    private String name;
    private String gender;
    private String college;
    private String domain;
    private String role;
    private String doj;

}
