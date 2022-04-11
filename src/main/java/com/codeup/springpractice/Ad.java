package com.codeup.springpractice;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;

//    This is the equivalent if the above code was written in MySQL
//    CREATE TABLE ads (
//            id BIGINT NOT NULL AUTO_INCREMENT,
//            title VARCHAR(100) NOT NULL,
//    description VARCHAR(255) NOT NULL,
//    PRIMARY KEY (id)
//);

}
