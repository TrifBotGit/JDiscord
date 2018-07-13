package com.project.JDiscord.service.impl;

import com.project.JDiscord.dao.LOLdao;
import com.project.JDiscord.service.LOLservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LOLserviceImpl implements LOLservice {

    @Autowired
    private LOLdao lolDao;

    @Override
    public String getByName(String name) {
        return lolDao.findByName(name);
    }
}
