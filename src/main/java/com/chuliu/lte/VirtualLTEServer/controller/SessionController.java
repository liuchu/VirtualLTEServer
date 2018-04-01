package com.chuliu.lte.VirtualLTEServer.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 *
 * @Description 使用RestController 相当于@Controller 和 @RequestBody
 * @author chuliu
 * @date 2018/3/31
 * @version V1.3.1
 */

@RestController
@SpringBootApplication
@RequestMapping("/nbi")
public class SessionController {

    /**
     *
     * @Description accept session control requests from LTE-B control center
     * @author chuliu
     * @param session_id id of a session
     * @return void
     */
    @PostMapping("/deliverysession")
    void deliverySession(@RequestParam int session_id, HttpServletRequest request, HttpServletResponse response) throws InterruptedException {

        Thread.sleep(1000);

        System.out.println(request.getLocalAddr()+" - - "+"["+LocalDateTime.now()+"] "+
            "\""+request.getRequestURI()+" "+request.getProtocol()+"\" "+response.getStatus());

    }


}
