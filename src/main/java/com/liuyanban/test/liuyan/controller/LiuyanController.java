package com.liuyanban.test.liuyan.controller;

import com.liuyanban.test.liuyan.bean.Liuyan;
import com.liuyanban.test.liuyan.service.LiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiuyanController {

    @Autowired
    LiuyanService liuyanService;


    /**
     * 保存留言
     * @param liuyan
     */
    @RequestMapping("/liuyan/save")
    public void saveLiuyan(Liuyan liuyan){
        liuyanService.saveLiuYan(liuyan);
    }

    /**
     * 显示留言
     * @param liuyan
     * @return
     */
    @RequestMapping("/liuyan/display")
    public Liuyan displayLiuyan(Liuyan liuyan){
        return liuyanService.displayLiuyan(liuyan);
    }
}
