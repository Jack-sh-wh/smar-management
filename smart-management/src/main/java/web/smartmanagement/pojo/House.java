package web.smartmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//进行房屋认证功能的实体类
public class House {
    private Integer id;
   private Integer danyuan;
    private Integer haolou;
    private Integer fanghao;
    private String username;
    private String phone;

}
