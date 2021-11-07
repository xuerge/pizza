package ${package}.${artifactId}.cases;

import ${package}.dao.domain.Demo;
import ${package}.dao.mapper.DemoMapper;
import ${package}.test.base.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DemoMapperTest extends BaseTest {

    @Autowired
    private DemoMapper demoMapper;

    @Test
    public void test(){
        System.out.println(("----- selectAll method test ------"));
        List<Demo> userList = demoMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}