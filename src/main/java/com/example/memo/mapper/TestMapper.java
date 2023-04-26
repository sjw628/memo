package com.example.memo.mapper;

import com.example.memo.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TestMapper {

    List<TestDTO> getUserList();
}

