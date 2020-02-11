package com.itdr.service.impl;

import com.itdr.dao.IndexDao;
import com.itdr.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
@Service
@Transactional
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDao indexDao;
    @Autowired
    private TransactionTemplate tt;

    @Override
    public String tm(String aname, String bname, int money) {
        //参数非空判断，金额不能为负数
        //判断B账户是否存在
        //给A账户扣钱
        int i = indexDao.updateByName(aname, money);
        int m = 1/0;
        //给B加钱
        int i2 = indexDao.updateByName2(bname, money);
        if(i<0 || i2<0){
            return "转账失败";
        }
        return "转账成功";
    }
    @Override
    public void tm2(String aname, String bname, int money) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        TransactionTemplate tt = ac.getBean(TransactionTemplate.class);
        tt.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //给B加钱
                int i = indexDao.updateByName(aname, money);

                int m = 1/0;
                //给A账户扣钱
                int i2 = indexDao.updateByName2(bname, money);
            }
        });
    }
    @Override
    public String jg(String uname,String yue,String xingzuo){
        String ming = indexDao.ming(uname);
        String yue1 = indexDao.yue(yue);
        String dong = indexDao.dong(xingzuo);
//        System.out.println("ming"+"yue1"+"dong");
        return ming+yue1+dong;
    }
}
