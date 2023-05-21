package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
// 생성자 주입 방식
@RequiredArgsConstructor
public class SampleService {

    // 주입 받아야 하는 객체의 변수는 final로 작성
    @Qualifier("event")
    private final SampleDAO sampleDAO;
}
