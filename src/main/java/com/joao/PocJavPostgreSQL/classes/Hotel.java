package com.joao.PocJavPostgreSQL.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data; 
import lombok.NoArgsConstructor;

@Data
@Table(name =  "\"Hotel\"")
@Entity
@AllArgsConstructor
@NoArgsConstructor


/* When the database has table names with uppercase letters or column names with uppercase letters
 * using JPA on Spring Boot connected to PostregreSQL, MySQL, etc
 * It's necessary to use 
 * spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
 * on application.properties
 * and use @Table(name =  "\"Hotel\"") this model for every table name with uppercase letters
 * and same with column @Column(name = "\"iD\"")
 * if you don't specify nothing it will use lowercase
 */


public class Hotel {

    @Id
    @Column(name = "\"iD\"")
    private Integer iD;
    @Column(name = "\"NAME\"")
    private String NAME;
}
