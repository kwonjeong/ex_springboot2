package com.example.ex_springboot2.dto;

import com.example.ex_springboot2.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // assertThat : 검증하고 싶은 대상을 메소드 인자로 받음
        assertThat(dto.getAmount()).isEqualTo(amount); // isEqualTo : assertThat에 있는 값과 isEqualTo의 값을 비교 -> 같을 때만 성공
    }
}
