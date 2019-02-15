package Thirteen;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;


import javax.sql.DataSource;
import java.util.Properties;

@EnableTransactionManagement
public class JavaTransactionConfig implements TransactionManagementConfigurer {
    @Bean(name = "dataSource")
    public DataSource getDataSource() {

        DataSource dataSource = null;
        Properties properties = new Properties();
        properties.setProperty("driverClassName","org.mariadb.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://127.0.0.1:3306/lccTest2");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");
        try {
              dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;

    }
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
    @Override
    @Bean(name = "transactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(getDataSource());
        return transactionManager;
    }
}
