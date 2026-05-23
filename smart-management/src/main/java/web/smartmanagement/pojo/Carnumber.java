package web.smartmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carnumber {
    private Integer id;
    private Integer userId;
    private String carnumber;
    private String createTime;
}
