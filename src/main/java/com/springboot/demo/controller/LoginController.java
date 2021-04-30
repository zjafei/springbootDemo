package com.springboot.demo.controller;

import org.springframework.util.StringUtils;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  // @RequestMapping(value = "/user/login", method = RequestMethod.POST)
  @PostMapping(value = "/user/login")
  public String login(@RequestParam("username") String username, @RequestParam("password") String password,
      Map<String, Object> map, HttpSession session) {
    if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
      session.setAttribute("loginUser", username);
      return "redirect:/main";
    } else {
      map.put("msg", "用户名密码错误");
      return "login";
    }
  }
}