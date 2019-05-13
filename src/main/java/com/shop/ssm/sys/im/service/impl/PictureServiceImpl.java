package com.shop.ssm.sys.im.service.impl;

import com.shop.ssm.sys.im.mapper.ImPictureMapper;
import com.shop.ssm.sys.im.model.ImPicture;
import com.shop.ssm.sys.im.service.ImPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl implements ImPictureService {
    @Autowired
    private ImPictureMapper imPictureMapper;

    @Override
    public void add(ImPicture imPicture) {
        imPictureMapper.insert(imPicture);
    }

    @Override
    public ImPicture load(ImPicture imPicture) {
        ImPicture ip = imPictureMapper.selectByPrimaryKey(imPicture.getFileId());
        return ip;
    }
}
