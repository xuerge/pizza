package ${package}.${artifactId}.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class Demo {
    private Long id;
    private String name;
    private Integer age;
    private String email;

}