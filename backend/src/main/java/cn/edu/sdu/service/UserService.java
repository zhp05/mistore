package cn.edu.sdu.service;

import cn.edu.sdu.entity.User;
import org.springframework.stereotype.Component;
@Component
public interface UserService {

    User login(String userName,String formPass);
    int findUserByName(String userName);
    User registerUser(String userName,String formPass);
    void updateUser(User user);

}
