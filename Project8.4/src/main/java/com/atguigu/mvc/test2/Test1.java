package com.atguigu.mvc.test2;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@Controller
public class Test1 {
    @RequestMapping("/fileDown")
    public ResponseEntity<byte[]> fileDown(HttpSession session) throws IOException {
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/static/girl.jpg");
        FileInputStream fis = new FileInputStream(realPath);
        byte[] file = new byte[fis.available()];
        fis.read(file);
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=girl.jpg");
        HttpStatus status = HttpStatus.OK;
        ResponseEntity<byte[]> response = new ResponseEntity<>(file, headers, status);
        fis.close();
        return response;
    }

    @RequestMapping("/fileUp")
    public String fileUp(MultipartFile picture, HttpSession session) throws IOException {
        String originalFilename = picture.getOriginalFilename();
        String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/static/pic");
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdir();
        }
        String randomName = UUID.randomUUID().toString().replaceAll("-", "");
        String finalPath = realPath + File.separator + randomName + suffixName;
        picture.transferTo(new File(finalPath));
        return "success";
    }
}
