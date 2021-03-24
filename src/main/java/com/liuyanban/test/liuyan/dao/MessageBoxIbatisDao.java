package com.liuyanban.test.liuyan.dao;


import com.liuyanban.test.liuyan.bean.Liuyan;
import org.apache.ibatis.annotations.Mapper;

/**
 * 类功能描述: 留言板dao
 *
 * @author cff
 * @date 2020/12/18
 */
@Mapper
public interface MessageBoxIbatisDao {
    /**
     * 方法功能描述：保存用户留言
     * @return
     */
    void saveLiuYan(Liuyan liuyan);

    /**
     * 方法功能描述：显示用户留言
     * @param liuyan
     * @return
     */
    Liuyan displayLiuyan(Liuyan liuyan);
}
