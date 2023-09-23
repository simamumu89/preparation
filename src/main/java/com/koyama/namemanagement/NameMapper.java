package com.koyama.namemanagement;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper  // MyBatisのMapperである目印として@Mapperアノテーションを付与する
public interface NameMapper { //Classではなくinterfaceで定義する

    @Select("SELECT name FROM names")
    List<Name> findAll();
}
