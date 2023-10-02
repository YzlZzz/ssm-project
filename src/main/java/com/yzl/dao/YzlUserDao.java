package com.yzl.dao;

import com.yzl.model.YzlUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YzlUserDao {
    List<YzlUser> findAll();
}
