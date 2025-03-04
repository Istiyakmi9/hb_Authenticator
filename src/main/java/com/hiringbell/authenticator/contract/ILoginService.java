package com.hiringbell.authenticator.contract;

import com.hiringbell.authenticator.entity.Login;
import com.hiringbell.authenticator.entity.User;
import com.hiringbell.authenticator.model.LoginResponse;
import org.springframework.stereotype.Component;

@Component
public interface ILoginService {
    LoginResponse userAuthentication(User user) throws Exception;
    LoginResponse authenticateUserService(Login login) throws Exception;
    public LoginResponse signupService(Login login) throws Exception;
    public LoginResponse shortSignupService(Login login) throws Exception;
    LoginResponse autoAuthentication(Login login) throws Exception;
    LoginResponse userAuthenticationMobile(User user) throws Exception;
}
