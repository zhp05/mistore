package cn.edu.sdu.dao;

import cn.edu.sdu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select user_id,userName,userPhoneNumber,email,gender from users where userName=#{userName} and password=#{password}")
    User login(String userName, String password);

    @Select("select count(1) from users where userName=#{username}")
    int findUserByName(String userName);

    @Select("select count(1) from users where user_id=#{user_id}")
    int findUserById(Integer user_id);

    @Insert("insert into users(userName,password,salt,login_count) values(#{userName},#{password},#{salt},1)")
    void registerUser(String userName,String password,String salt);

    @Update("update users set password=#{password},userPhoneNumber=#{userPhoneNumber},email=#{email},gender=#{gender}")
    void updateUser(User user);

    @Select("select salt from users where username=#{userName}")
    String getSalt(String userName);

    @Select("select * from users where username=#{userName}")
    User findByUserName(String userName);

    @Update("update users set login_count=login_count+#{count} where username=#{username}")
    void updateLoginCount(String username,int count);
}
