package com.example.poitest.service;

import com.example.poitest.entity.ExportParams;
import com.example.poitest.entity.ImportParams;
import com.example.poitest.handler.ExcelExportHandler;
import com.example.poitest.handler.ExcelImportHandler;
import com.example.poitest.pojo.User;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class PoiServicesTest {

    @Autowired
    private PoiServices poiServices;

    /**
     * Excel导出测试
     */
    @Test
    public void testExportLog() throws Exception {
        List<User> userList = poiServices.getAll();
        Workbook workbook = new ExcelExportHandler().createSheet(new ExportParams("测试导出", "最新日志"), User.class, userList);
        OutputStream outputStream = new FileOutputStream(new File("D:/测试.xlsx"));
        workbook.write(outputStream);
    }

    /**
     * 导入测试
     * @throws Exception
     */
    @Test
    public void testImportLog() throws Exception {
        InputStream inputStream = new FileInputStream(new File("D:/测试.xlsx"));
        List<User> userList = new ExcelImportHandler().importExcel(inputStream, User.class, new ImportParams());
        for (User user : userList) {
            System.out.println(user);
        }
    }


}