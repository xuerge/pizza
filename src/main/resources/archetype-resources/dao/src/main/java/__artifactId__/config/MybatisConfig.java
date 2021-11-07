package ${package}.${artifactId}.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("${package}.dao")
public class MybatisConfig {
}
