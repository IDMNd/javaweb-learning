package top.soft.bookonline.dao;

import org.junit.jupiter.api.Test;
import top.soft.bookonline.dao.impl.UserDaoImpl;
import top.soft.bookonline.entity.User;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void insertUser() {
        UserDao userDao = new UserDaoImpl();
        User user = User.builder()
                .account("wxb")
                .nickname("wxb").password("123456").address("江苏南京").avatar("https://nc2.iupdown.com/s6/file/2024/05/18/%E6%99%A8%E5%85%89%E6%98%9F%E6%96%97-%E5%85%8D%E8%B4%B9%E7%A6%8F%E5%88%A9%E6%A0%BC%E5%BC%8F_05d98.jpg").build();
        userDao.insertUser(user);
    }
}