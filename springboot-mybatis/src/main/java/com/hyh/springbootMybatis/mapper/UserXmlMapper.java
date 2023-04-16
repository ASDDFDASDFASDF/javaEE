package com.hyh.springbootMybatis.mapper;

import com.hyh.springbootMybatis.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {

    List<User> findAllUser();
}
