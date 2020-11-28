package com.cjl.service;

import com.cjl.domain.Img;

import java.util.List;

public interface ImgService {
    List<Img> findImgByNid(Integer nid);
}
