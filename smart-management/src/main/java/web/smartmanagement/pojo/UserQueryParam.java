package web.smartmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryParam {
    private Integer page=1;
    private Integer pageSize=10;
    private Integer id;
    private String username;
    private String password;
    private String phone;
}
