package com.yzl.controller;

import com.yzl.model.YzlUser;
import com.yzl.service.YzlUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class YzlUserController {

    @Resource
    private YzlUserService yzlUserService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<YzlUser> yzlUserList = yzlUserService.findAll();

        for (YzlUser yzlUser : yzlUserList) {
            System.out.println("id: " + yzlUser.getId());
            System.out.println("name: " + yzlUser.getName());
        }

        return "hello";
    }
}
