package web.smartmanagement.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.smartmanagement.mapper.UserMapper;
import web.smartmanagement.pojo.*;
import web.smartmanagement.utils.JwtUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.register(user);
        log.info("用户添加成功: {}",user);
    }


    @Override
    public PageResult<User> page(UserQueryParam queryParam) {
        //1.设置分页参数
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());

        List<User> users = userMapper.list(queryParam);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return new PageResult<>(pageInfo.getTotal(), pageInfo.getList());

    }

    @Override//接收前端传来的房屋认证信息
    public void approve(House house) {
        userMapper.approve(house);
        log.info("房屋认证成功: {}",house);
    }

    @Override
    public void addvisitor(Visitor visitor) {
        userMapper.addvisitor(visitor);
        log.info("访客添加成功: {}",visitor);
    }

    @Override
    public void repair(Repair repair) {
        userMapper.repair(repair);
        log.info("报修成功: {}",repair);
    }

    @Override
    public void addnumber(Carnumber carnumber) {
        userMapper.addcarnumber(carnumber);
        log.info("车辆添加成功: {}",carnumber);
    }


    @Override
    public void addadvice(Advice advice) {
        userMapper.addadvice(advice);
        log.info("建议添加成功: {}",advice);
    }




    @Override
    public LoginInfo login(User user) {

        User ur = userMapper.login(user.getUsername(), user.getPassword());
        if (ur != null) {
            log.info("用户登录成功");
            Map<String, Object> datemap = new HashMap<>();
            datemap.put("id", ur.getId());
            datemap.put("username", ur.getUsername());
            String token = JwtUtils.generateToken(datemap);

            LoginInfo loginInfo = new LoginInfo(ur.getId(), ur.getUsername(), token);
            return loginInfo;
        }
        return null;
    }
}