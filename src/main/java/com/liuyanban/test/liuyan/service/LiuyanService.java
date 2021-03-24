package com.liuyanban.test.liuyan.service;

import com.liuyanban.test.liuyan.bean.Liuyan;

public interface LiuyanService {
    /**
     * 保存留言内容
     * @param liuyan
     * @return
     */
    void saveLiuYan(Liuyan liuyan);

    /**
     * 显示用户留言
     * @param liuyan
     * @return
     */
    Liuyan displayLiuyan(Liuyan liuyan);
}
