package com.liuyanban.test.liuyan.service.serviceImpl;

import com.liuyanban.test.liuyan.bean.Liuyan;
import com.liuyanban.test.liuyan.dao.MessageBoxIbatisDao;
import com.liuyanban.test.liuyan.service.LiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiuyanServiceImpl implements LiuyanService {

    //将DAO注入SERVICE层
    @Autowired
    private MessageBoxIbatisDao messageBoxIbatisDao;

    @Override
    public void saveLiuYan(Liuyan liuyan) {
         messageBoxIbatisDao.saveLiuYan(liuyan);
    }

    @Override
    public Liuyan displayLiuyan(Liuyan liuyan) {
        return messageBoxIbatisDao.displayLiuyan(liuyan);
    }
}
