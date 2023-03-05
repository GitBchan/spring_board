package org.zerock.b02.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b02.dto.ReplyDTO;

@SpringBootTest
@Log4j2
public class ReplyServiceTests {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testRegister(){
        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("ReplyDTO text")
                .replyer("replyer")
                .bno(101L)
                .build();

        log.info(replyService.register(replyDTO));
    }

    @Test
    public void testModify(){
        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("댓글 수정 테스트")
                .rno(2L)
                .replyer("replyer")
                .bno(100L)
                .build();

        log.info("target: " + replyDTO);

        replyService.modify(replyDTO);
    }
}
