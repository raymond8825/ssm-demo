package raymond;

import com.alibaba.fastjson.JSON;
import com.raymond.dao.UserMapper;
import com.raymond.domain.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

//下面两个注解可以用@SpringJunitConfig(AppConfiguration.class)替代
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@Slf4j
public class TestService {

    @Resource
    UserMapper userMapper;

    @Test
    public void test(){
      log.info("llll");
    }

    @Test
    public void getUsers(){
        UserDO userDO = userMapper.selectByPrimaryKey(1L);
        log.info(JSON.toJSONString(userDO));
    }
}
