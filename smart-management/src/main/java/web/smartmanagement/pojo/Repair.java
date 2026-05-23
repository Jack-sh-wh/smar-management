package web.smartmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repair {
    private Integer id;
    private Integer userId;
    private String  goods;
    private String  reason;
    private String submitTime;
    private Integer status;
}
