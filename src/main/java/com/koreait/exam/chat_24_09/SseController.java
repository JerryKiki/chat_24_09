package com.koreait.exam.chat_24_09;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/sse")
@Slf4j
@RequiredArgsConstructor
public class SseController {

    private final SseEmitters sseEmitters;


}
