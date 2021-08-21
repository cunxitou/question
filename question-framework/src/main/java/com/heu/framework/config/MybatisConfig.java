package com.heu.framework.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MybatisConfig {
    @Autowired
    private Environment env;
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        String mapperLocation = env.getProperty("mybatis.mapper-locations");
        String configLocation = env.getProperty("mybatis.config-location");
        bean.setVfs(SpringBootVFS.class);
        bean.setTypeAliasesPackage("com.heu.system.domain");
        bean.setDataSource(dataSource);
        bean.setMapperLocations(resolveMapperLocation(mapperLocation.split(",")));
        bean.setConfigLocation(new DefaultResourceLoader().getResource(configLocation));
        return bean.getObject();
    }

    public Resource[]resolveMapperLocation(String[] mapperLocations){
        ResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        List<Resource> resources = new ArrayList<>();
        if (mapperLocations != null){
            for (String mapperLocation : mapperLocations) {
                try {
                    Resource[] mappers = patternResolver.getResources(mapperLocation);
                    resources.addAll(Arrays.asList(mappers));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return resources.toArray(new Resource[resources.size()]);
    }
}
