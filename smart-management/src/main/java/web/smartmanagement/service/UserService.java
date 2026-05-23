package web.smartmanagement.service;

import web.smartmanagement.pojo.*;

public interface UserService {
    LoginInfo login(User user);

    PageResult<User> page(UserQueryParam queryParams);

    void save(User user);

    void addvisitor(Visitor visitor);

    void repair(Repair repair);

    void addnumber(Carnumber carnumber);

    void addadvice(Advice advice);

    void approve(House  house);
}
