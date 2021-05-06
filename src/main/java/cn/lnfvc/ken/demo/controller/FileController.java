package cn.lnfvc.ken.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/4/27 上午7:50
 */

@Controller
public class FileController {

    @Value("${filepath}")
    private String path;

    @Value("${url}")
    private String url;

    @CrossOrigin
    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return path;
    }

    @CrossOrigin
    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file){
        if (!file.isEmpty()){

            try {
                String filename = file.getOriginalFilename();
                File dest = new File(path+filename);
                file.transferTo(dest);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "fail";
            } catch (IOException e) {
                e.printStackTrace();
                return "fail";
            }

            return url+file.getOriginalFilename();
        }else {
            return "fail";
        }
    }

}
