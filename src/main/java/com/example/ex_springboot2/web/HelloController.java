package com.example.ex_springboot2.web;

import com.example.ex_springboot2.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌
public class HelloController {
    @GetMapping("/hello") // HTTP method인 Get의 요청을 받을 수 있는 API 만들어줌
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, // RequestParam : 외부에서 API로 넘긴 파라미터 가져옴
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }

    private Map<String, UserProfile> userMap;

    @PostConstruct
    public void init(){
        userMap = new HashMap<String, UserProfile>();
        userMap.put("1", new UserProfile("email", "password", "cat", ""));
        userMap.put("2", new UserProfile("email", "", "kwonjeong", "201"));
    }

    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable String id){
        return userMap.get(id);
    }
}

