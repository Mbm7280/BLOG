package echo.blog.service;

import com.echo.blog.AppRun;
import com.echo.blog.modules.ums.model.UmsUser;
import com.echo.blog.modules.ums.service.UmsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @className UmsUserServiceTest
 * @author Echo
 * @description
 * @updateTime 2021/12/14 12:33
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppRun.class)
@Configuration
public class UmsUserServiceTest {

    @Autowired
    UmsUserService umsUserService;


    @Test
    public void listAllUsers () {
        List<UmsUser> umsUsers = umsUserService.qAllUsers();
        System.out.println(umsUsers);
    }



}
