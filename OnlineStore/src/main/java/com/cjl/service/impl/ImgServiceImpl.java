package com.cjl.service.impl;

import com.cjl.dao.ImgDao;
import com.cjl.dao.impl.ImgDaoImpl;
import com.cjl.domain.Img;
import com.cjl.service.ImgService;

import java.util.List;

public class ImgServiceImpl implements ImgService {
    ImgDao dao = new ImgDaoImpl();
    @Override
    public List<Img> findImgByNid(Integer nid) {
        return dao.selectImgByNid(nid);
    }
}
