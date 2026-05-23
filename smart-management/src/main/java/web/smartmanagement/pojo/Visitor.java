package web.smartmanagement.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visitor {
    private Integer id;
    private Integer userId;
    private String  visitorName;
    private String  visitorPhone;
    private String createTime;
}
