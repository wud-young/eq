package com.cafuc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
/*开启事务管理
等同于<tx:annotation-driven transaction-manager="transactionManager"/>
 */
@Import({MyBatisConfig.class, JdbcConfig.class})
@ComponentScan("com.cafuc.service")
@EnableTransactionManagement
public class SpringConfig {
    @Bean("transactionManager")
    public DataSourceTransactionManager getDataSourceTxManager(
            @Autowired DataSource dataSource) {
        DataSourceTransactionManager dtm = new DataSourceTransactionManager();
        dtm.setDataSource(dataSource);
        return dtm;
    }

}
