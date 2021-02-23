package com.example.poitest.entity;

import java.lang.reflect.Field;

/**
 * Excel注解对应的实体类
 *
 */
public class ExcelEntity {

    private double width = 10;

    private double height = 10;

    /**
     * 统计
     */
    private boolean isStatistics;

    /**
     * 对应name
     */
    protected String name;
    /**
     * 导出日期格式
     */
    private String format;

    /**
     * 数据的字段
     */
    private Field dataField;

    /**
     * 自适应列宽
     */
    private boolean autoSize;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isStatistics() {
        return isStatistics;
    }

    public void setStatistics(boolean statistics) {
        isStatistics = statistics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Field getDataField() {
        return dataField;
    }

    public void setDataField(Field dataField) {
        this.dataField = dataField;
    }

    public boolean isAutoSize() {
        return autoSize;
    }

    public void setAutoSize(boolean autoSize) {
        this.autoSize = autoSize;
    }
}
