package com.yzl.service.Impl;

import com.yzl.dao.YzlUserDao;
import com.yzl.model.YzlUser;
import com.yzl.service.YzlUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class YzlUserServiceImpl implements YzlUserService {

    @Resource
    private YzlUserDao yzlUserDao;


    public List<YzlUser> findAll(){
        return yzlUserDao.findAll();
    }
}
