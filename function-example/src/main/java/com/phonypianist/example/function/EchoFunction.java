package com.phonypianist.example.function;

import com.phonypianist.example.function.dto.EchoRequest;
import com.phonypianist.example.function.dto.EchoResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("echo")
public class EchoFunction implements Function<EchoRequest, EchoResponse> {

    @Override
    public EchoResponse apply(EchoRequest requestParam) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new EchoResponse(requestParam.getMessage());
    }

}
