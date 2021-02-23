package com.example.poitest.entity;


/**
 * Excel 导出参数
 * @author
 * @date
 * @version
 */
public class ExportParams {

    /**
     * 标题名称
     */
    private String title;
    /**
     * 标题高度
     */
    private short titleHeight = 16;
    /**
     * 子标题
     */
    private String secondTitle;
    /**
     * 子标题高度
     */
    private short secondTitleHeight = 10;
    /**
     * 标签页名称
     */
    private String sheetName;
    /**
     * Sheet页索引
     */
    private int sheetIndex = 1;
    /**
     * 是否创建表头
     */
    private boolean isCreateHeadRows = true;

    public ExportParams() {
    }

    public ExportParams(String title, String secondTitle, String sheetName) {
        this.title = title;
        this.secondTitle = secondTitle;
        this.sheetName = sheetName;
    }

    public ExportParams(String title, String sheetName) {
        this.title = title;
        this.sheetName = sheetName;
    }

    public ExportParams(String title, String secondTitle, String sheetName, boolean isCreateHeadRows) {
        this.title = title;
        this.secondTitle = secondTitle;
        this.sheetName = sheetName;
        this.isCreateHeadRows = isCreateHeadRows;
    }

    public ExportParams(String title, String sheetName, boolean isCreateHeadRows) {
        this.title = title;
        this.sheetName = sheetName;
        this.isCreateHeadRows = isCreateHeadRows;
    }

    public ExportParams(String sheetName) {
        this.sheetName = sheetName;
        this.isCreateHeadRows = false;
    }

    public short getTitleHeight() {
        return (short) (titleHeight * 50);
    }

    public short getSecondTitleHeight() {
        return (short) (secondTitleHeight * 50);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitleHeight(short titleHeight) {
        this.titleHeight = titleHeight;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public void setSecondTitleHeight(short secondTitleHeight) {
        this.secondTitleHeight = secondTitleHeight;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public int getSheetIndex() {
        return sheetIndex;
    }

    public void setSheetIndex(int sheetIndex) {
        this.sheetIndex = sheetIndex;
    }

    public boolean isCreateHeadRows() {
        return isCreateHeadRows;
    }

    public void setCreateHeadRows(boolean createHeadRows) {
        isCreateHeadRows = createHeadRows;
    }
}
