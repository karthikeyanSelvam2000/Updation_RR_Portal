package com.example.Updation_RR_Portal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoineeModel {
    private String name;
    private String gender;
    private String college;
    private String domain;
    private String role;
    private String application_status;
    private String approving_status;
    private LocalDateTime created_by;
    private LocalDateTime updated_by;
    private Boolean delete_flag;
    private String doj;
}
