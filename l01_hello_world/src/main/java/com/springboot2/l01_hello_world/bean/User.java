package com.springboot2.l01_hello_world.bean;

import lombok.*;

/**
 * 用户
 */

@NoArgsConstructor
// @AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
      this.name = name;
      this.age = age;
    }

}