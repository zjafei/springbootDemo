package com.springboot2.l01_hello_world.bean;


import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "car")
public class Car {

    private String brand;
    private Integer price;


}