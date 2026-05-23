package web.smartmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web.smartmanagement.pojo.*;
import web.smartmanagement.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/user")//分页查询用户，目前不知道有什么用
    public Result findAll(UserQueryParam queryParam) {
        return Result.success(userService.page(queryParam));
    }

    @PostMapping("/visitor")//接收前端传来的访客信息，添加到数据库中
    public Result addVisitor(@RequestBody Visitor visitor) {
        userService.addvisitor(visitor);
        return Result.success();

    }

    @PostMapping("/repair")//接收前端传来的报修信息，添加到数据库中
    public Result repair(@RequestBody Repair repair) {
        userService.repair(repair);
        return Result.success();
    }

    @PostMapping("/carnumber")//接收前端传来的车牌号信息，添加到数据库中
    public Result addCarnumber(@RequestBody Carnumber carnumber) {
        userService.addnumber(carnumber);
        return Result.success();
    }

    @PostMapping("/advice")//接收前端传来的建议信息，添加到数据库中
    public Result addAdvice(@RequestBody Advice advice) {
        userService.addadvice(advice);
        return Result.success();
    }
}
