package com.imooc.xunwu.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**  2018-02-22
 *    配置文件
 * */
@Configuration
@EnableJpaRepositories(basePackages = "com.imooc.xunwu.repository")
@EnableTransactionManagement
public class JPAConfig {
    /*
    进行配置文件
    */
    @Bean
    @ConfigurationProperties(prefix = "spring.dataSource")
    public DataSource dataSource() {
         return DataSourceBuilder.create().build();
    }
}
