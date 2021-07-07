package com.smxy.campus_recruit;

import com.smxy.campus_recruit.bean.CRJobList;
import com.smxy.campus_recruit.bean.example.CRJobListExample;
import com.smxy.campus_recruit.service.CRJobListService;
import com.smxy.campus_recruit.service.CRUserEqService;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CampusRecruitApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void testMBG() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 指定配置文件的位置，如果在项目的目录下，直接使用配置文件名
        // 其路径也是相对整个目录和targetProject属性相对的路径是相同的参考系
        File configFile = new File("./src/main/resources/static/mybatis/mybatis-mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Autowired
    private CRJobListService service;

    @Test
    public void testt(){
//        System.out.println(service.getByJobname("1").size());
        for (CRJobList job :service.getByJobname("1")){
            System.out.println(job.getJobName());
        }

    }

}
