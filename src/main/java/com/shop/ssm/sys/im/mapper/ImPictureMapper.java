package com.shop.ssm.sys.im.mapper;

import com.shop.ssm.sys.im.model.ImPicture;

public interface ImPictureMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(ImPicture record);

    int insertSelective(ImPicture record);

    ImPicture selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(ImPicture record);

    int updateByPrimaryKey(ImPicture record);
}