package wangzhongqiu.spring.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wangzhongqiu.spring.mybatis.cache.LearnCacheService;
import wangzhongqiu.spring.mybatis.entity.LearnResouce;
import wangzhongqiu.spring.mybatis.service.LearnService;

/**
 * @author wangzhongqiu
 * @date 2017/11/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-mybatis.xml"})
public class ServiceTest {
    @Autowired
    LearnService learnService;
    @Autowired
    LearnCacheService learnCacheService;

    @Test
    public void test() throws Exception {
        try {
            Long id = 999L;
            LearnResouce learnResouce = learnCacheService.queryLearnResouceById(id);
            System.out.println(learnResouce);
            LearnResouce learnResouce1 = learnService.queryLearnResouceById(id);
            System.out.println(learnResouce1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
