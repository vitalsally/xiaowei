package com.tucaocun.service;

import com.tucaocun.entity.Cun;

/**
 * Created by Administrator on 2016/5/24.
 */

public interface CunService {
    void addCun(Cun cun) throws Exception;
    public Cun selectCunBean(String id);
    Integer updateCun(Cun cun);
}
