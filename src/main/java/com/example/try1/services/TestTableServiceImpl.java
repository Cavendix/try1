package com.example.try1.services;

import com.example.try1.models.TestTable;
import com.example.try1.repositories.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestTableServiceImpl implements TestTableService {

    private final TestTableRepository testTableRepository;

    @Autowired
    public TestTableServiceImpl(TestTableRepository testTableRepository) {
        this.testTableRepository = testTableRepository;
    }

    @Override
    public List<TestTable> getAllRecords() {
        return testTableRepository.findAll();
    }
}