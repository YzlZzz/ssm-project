package com.yzl;

import com.yzl.dao.YzlUserDao;
import com.yzl.model.YzlUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class YzlUserDaoTest extends BaseJunit4Test{

    @Resource
    private YzlUserDao yzlUserDao;

    @Test
    public void findAll(){
        List<YzlUser> userList = yzlUserDao.findAll();
        System.out.println(userList.size());
    }
}
