package com.matrix.springmvc.day04.test;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Controller
public class TestUploadAndDownController {

    @RequestMapping("down")
    public ResponseEntity<byte[]> down(HttpSession session) throws Exception{ //ResponseEntity 返回实体 session用于获取路径
        // 获取下载文件按的路径(从服务器上下载) D:\IdeaProjects\SpringMVC\web\img
        String realPath = session.getServletContext().getRealPath("img"); // 为空的时候获得的是项目的路径
        String finalPath = realPath + File.separator +  "1.jpg";  //  File.separator 相当于 /
//        System.out.println(realPath);

        InputStream is = new FileInputStream(finalPath);

        byte[] b = new byte[is.available()]; // is.available() 输入流所读取文件的最大字节数
        is.read(b); // 字节读取到数组中

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=zzz.jpg");
        HttpStatus status = HttpStatus.OK;

        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(b, headers, status);

        is.close();
        return entity;
    }
}

