package com.example.poitest.entity;


/**
 * 导入参数设置
 *
 */

public class ImportParams {
    /**
     * 表格标题行数
     * 这里的标题指的是列标题，不是表头
     */
    private int titleRows = 1;
    /**
     * 表头行数
     */
    private int headRows = 0;
    /**
     * 上传表格需要读取的sheet 数量,默认为1
     */
    private int sheetNum = 1;

    public ImportParams() {
    }

    public ImportParams(int titleRows, int headRows) {
        this.titleRows = titleRows;
        this.headRows = headRows;
    }

    public ImportParams(int sheetNum) {
        this.sheetNum = sheetNum;
    }


    public int getTitleRows() {
        return titleRows;
    }

    public void setTitleRows(int titleRows) {
        this.titleRows = titleRows;
    }

    public int getHeadRows() {
        return headRows;
    }

    public void setHeadRows(int headRows) {
        this.headRows = headRows;
    }

    public int getSheetNum() {
        return sheetNum;
    }

    public void setSheetNum(int sheetNum) {
        this.sheetNum = sheetNum;
    }
}
