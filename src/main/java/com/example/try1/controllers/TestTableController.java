package com.example.try1.controllers;

import com.example.try1.models.TestTable;
import com.example.try1.services.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestTableController {

    private final TestTableService testTableService;

    @Autowired
    public TestTableController(TestTableService testTableService) {
        this.testTableService = testTableService;
    }

    @GetMapping("/testTable")
    public List<TestTable> getAllRecords() {
        List<TestTable> records = testTableService.getAllRecords();
        records.forEach(record -> System.out.println(record));
        return records;
    }
}