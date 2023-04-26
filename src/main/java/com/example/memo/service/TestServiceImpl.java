package com.example.memo.service;

import com.example.memo.dto.TestDTO;
import com.example.memo.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Override
    public List<TestDTO> getUserList() {
        return testMapper.getUserList();
    }
}
