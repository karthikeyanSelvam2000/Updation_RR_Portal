package com.example.Updation_RR_Portal.Service.ServiceImpl;


import com.example.Updation_RR_Portal.Mapper.EmployeeMpper;
import com.example.Updation_RR_Portal.Service.LoginService;
import com.example.Updation_RR_Portal.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService,UserDetailsService{
    @Autowired
    private EmployeeMpper employeeMpper;
    private Integer id;
    private String role;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserModel usermodel=employeeMpper.getname(userName);
       role= String.valueOf(usermodel.getRole());
        id=usermodel.getId();
        if(usermodel==null)
        {
            throw new UsernameNotFoundException(userName);
        }
        else {
            return new User(usermodel.getUser_name(), usermodel.getPassword(),usermodel.getAuthorities());
        }
    }
   public String getRole() {

        return role;
    }

    @Override
    public Void UpdateToken(String token) {
        employeeMpper.updateToken(token,id);
        return null;
    }





}
