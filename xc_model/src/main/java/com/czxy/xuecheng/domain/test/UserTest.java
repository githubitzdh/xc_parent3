package com.czxy.xuecheng.domain.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import java.util.Date;

/**
 *
 */
@Data
@ToString
@AllArgsConstructor
@Document(collection = "user_test")
public class UserTest {


    @Id
    private String id;
    private String name;

    @Column(name="create_time")
    private Date createTime;


    public void UserSay(){
        System.out.println("用户在说话");
    }
    private String age;
    private String code;
}
