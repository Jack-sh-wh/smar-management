package web.smartmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web.smartmanagement.pojo.House;
import web.smartmanagement.pojo.Result;
import web.smartmanagement.service.UserService;

@RestController
@Slf4j
public class HouseController {

    @Autowired
    private UserService service;
    @PostMapping("/house")
    public Result approve(@RequestBody House house) {
        service.approve(house);
        log.info("房屋认证成功: {}",house);
        return Result.success();
    }
}

