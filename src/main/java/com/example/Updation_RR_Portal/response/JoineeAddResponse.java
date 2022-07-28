package com.example.Updation_RR_Portal.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoineeAddResponse {
    private String username;
    private String password;
    private String role;
    private String message;
}
