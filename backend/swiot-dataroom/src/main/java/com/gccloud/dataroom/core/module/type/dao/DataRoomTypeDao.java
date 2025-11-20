package com.gccloud.dataroom.core.module.type.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gccloud.dataroom.core.module.type.entity.TypeEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataRoomTypeDao extends BaseMapper<TypeEntity> {

}