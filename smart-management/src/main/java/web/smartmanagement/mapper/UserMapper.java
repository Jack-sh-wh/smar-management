package web.smartmanagement.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PostMapping;
import web.smartmanagement.pojo.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    public User login(String username, String password);


    //@Insert("insert into user(username,password,name,phone,address,caraddress,carphone) values(#{username},#{password},#{name},#{phone},#{address},#{caraddress},#{carphone})")
    public void register(User user);

    public List<User> list(UserQueryParam queryParam);


    public void approve(House house);

    public void addvisitor(Visitor visitor);

    public void repair(Repair repair);

    public void addcarnumber(Carnumber carnumber);

    public void addadvice(Advice advice);

}
