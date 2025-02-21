//package com.estudo.multiplesource.infra;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import jakarta.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@Configuration
//public class SecondaryDataSourceConfig {
//
//    @Bean(name = "secondaryDataSource")
//    public DataSource secondaryDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/db2");
//        dataSource.setUsername("user2");
//        dataSource.setPassword("pass2");
//        return dataSource;
//    }
//
//    @Bean(name = "secondaryEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory(
//            EntityManagerFactoryBuilder builder,
//            @Qualifier("secondaryDataSource") DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.exemplo.model.secondary")
//                .persistenceUnit("secondary")
//                .build();
//    }
//
//    @Bean(name = "secondaryTransactionManager")
//    public PlatformTransactionManager secondaryTransactionManager(
//            @Qualifier("secondaryEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
