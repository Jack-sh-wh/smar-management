package web.smartmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advice {
    private Integer id;
    private Integer userId;
    private String content;
    private String createTime;
}
