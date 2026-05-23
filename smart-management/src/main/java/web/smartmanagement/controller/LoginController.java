package web.smartmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web.smartmanagement.pojo.LoginInfo;
import web.smartmanagement.pojo.Result;
import web.smartmanagement.pojo.User;
import web.smartmanagement.service.UserService;

@RestController
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")//进行用户的登录
    public Result login(@RequestBody User user) {
        log.info("用户登录成功: {}",user);

        LoginInfo loginInfo =userService.login(user);

        if(loginInfo!=null){
            return Result.success(loginInfo);
        }
        return Result.error("用户名或密码错误");
    }

    @PostMapping("/register")//只需要填写手机号，username，password，进行新用户的注册
    public Result save(@RequestBody User user) {
        userService.save(user);
        return Result.success();
    }


}
