package com.spt.helloworld.controller;

import com.github.pagehelper.PageInfo;
import com.spt.helloworld.domain.GoodsInfo;
import com.spt.helloworld.domain.Users;
import com.spt.helloworld.service.GoodsService;
import com.spt.helloworld.service.PricService;
import com.spt.helloworld.service.UserService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;
    @Autowired
    private PricService pricService;

    @RequestMapping("/query.do")
    public PageInfo<GoodsInfo> selectAll(@RequestParam Integer page,
                                         @RequestParam String uname){
        Users users = userService.selectByUname(uname);
        Integer zid = users.getzId();
        return goodsService.select(page,zid);
    }

    @RequestMapping("/upload.do")
    public String uploadPic(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        byte[] fbytes = file.getBytes();
        // 避免文件重名
        String newFileName = UUID.randomUUID().toString().replace("-", "");

        Client client = Client.create();
        // 把文件关联到远程服务器
        WebResource resource = client.resource("http://127.0.0.1:8080/cuthand/upload/");
        // 上传
        resource.put(String.class, fbytes);
        // 绝对路径(http://127.0.0.1:8003/SSM-Image/upload/是图片服务器路径,要提前建好upload文件夹,并放入1个文件填充)
        String fullPath = "http://127.0.0.1:8080/cuthand/upload/";
        // 相对路径
        String relativePath = "/upload/" + newFileName;
        String result = "{\"fullPath\":\"" + fullPath
                + "\",\"relativePath\":\"" + relativePath + "\"}";
        return result;
    }
}
