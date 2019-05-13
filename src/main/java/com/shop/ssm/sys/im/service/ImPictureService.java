package com.shop.ssm.sys.im.service;

import com.shop.ssm.sys.im.model.ImPicture;

public interface ImPictureService {
    void add(ImPicture imPicture);
    ImPicture load(ImPicture imPicture);
}