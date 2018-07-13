package com.project.JDiscord.dao.impl;

import com.project.JDiscord.dao.LOLdao;
import org.springframework.stereotype.Repository;

@Repository
public class LOLdaoImpl implements LOLdao {
    @Override
    public String findByName(String name) {
        return name;
    }
}
