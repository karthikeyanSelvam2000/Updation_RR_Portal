package com.example.Updation_RR_Portal.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    @ApiModelProperty(notes="Success Message After Login to the Application",name="Success Message",required=true,position =0)
    private String Message;
    @ApiModelProperty(notes="Jwt Token to do further actions in application",name="JwtToken",required=true,position =1)
    private String jwtToken;
    @ApiModelProperty(notes="Role of the User",name="role",required=true,position =2)
    private String role;

}
