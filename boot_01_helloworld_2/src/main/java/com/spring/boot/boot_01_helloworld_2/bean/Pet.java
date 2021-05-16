package com.spring.boot.boot_01_helloworld_2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 宠物
 */
@ToString
@Data
@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
public class Pet {
  private String name;
}