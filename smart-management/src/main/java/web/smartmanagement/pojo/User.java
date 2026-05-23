package web.smartmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//给所有私有属性创建get和set方法
@AllArgsConstructor//创建全参构造器
@NoArgsConstructor//创建无参构造器

public class User {
    private Integer id;
    private String username;
    private String password;
    private String phone;
}
