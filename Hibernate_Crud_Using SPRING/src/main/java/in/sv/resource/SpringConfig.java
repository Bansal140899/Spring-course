package in.sv.resource;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.sv.dao.StudentDao;
import in.sv.dao.StudentDaoImp;

@Configuration
@EnableTransactionManagement
public class SpringConfig {

    // DataSource Bean
    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/ajay");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    // SessionFactory Bean
    @Bean
    public LocalSessionFactoryBean sessionFactory() {

        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
        factory.setDataSource(dataSource());
        factory.setPackagesToScan("in.sv.beans");

        Properties props = new Properties();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "update");
        props.put("hibernate.format_sql", "true");

        factory.setHibernateProperties(props);

        return factory;
    }

    // HibernateTemplate Bean
    @Bean
    public HibernateTemplate hibernateTemplate() {
        return new HibernateTemplate(sessionFactory().getObject());
    }

    // Transaction Manager
    @Bean
    public HibernateTransactionManager transactionManager() {

        HibernateTransactionManager tx =
                new HibernateTransactionManager();

        tx.setSessionFactory(sessionFactory().getObject());

        return tx;
    }

    // DAO Bean
    @Bean
    public StudentDao studentDao() {

        StudentDaoImp dao = new StudentDaoImp();
        dao.setHibernateTemplate(hibernateTemplate());

        return dao;
    }
}