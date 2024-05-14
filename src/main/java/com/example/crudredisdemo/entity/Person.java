package com.example.crudredisdemo.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("person")
@Setter
@Getter
@AllArgsConstructor
public class Person {

    @Id
    private String id;
    private String name;
    private int age;

}
