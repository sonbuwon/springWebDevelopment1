package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello() {
        log.info("hello.................");
    }

    // 단순 파라미터의 자동 수집
    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info("ex1...........");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "sonbuwon") String name,
                    @RequestParam(name = "age", defaultValue = "29") int age) {
        log.info("ex2................");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    // Formatter를 이용한 파라미터의 커스텀 처리
    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate) {
        log.info("ex3...................");
        log.info("dueDate: " + dueDate);
    }
}
