package com.example.ex_springboot2;

import com.example.ex_springboot2.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello_return() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto_return() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", (name)) // param : API 테스트할 때 사용될 요청 파라미터 설정, String만 허용
                        .param("amount", String.valueOf(amount))) // 문자열로 변경
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name))) // JSON 응답값을 필드별로 검증, $ 기준으로 필드명 명시
                .andExpect(jsonPath("$.amount", is(amount)));
    }

}
