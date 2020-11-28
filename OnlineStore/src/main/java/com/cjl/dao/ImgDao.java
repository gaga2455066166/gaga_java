package com.cjl.dao;

import com.cjl.domain.Img;

import java.util.List;

public interface ImgDao {
    List<Img> selectImgByNid(Integer nid);
}
