package com.hj.util.excel;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.hj.entity.excel.model.ExcelWriteUser;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataUtil {


    public static List<List<Object>> createTestListObject() {
        List<List<Object>> object = new ArrayList<List<Object>>();
        for (int i = 0; i < 1000; i++) {
            List<Object> da = new ArrayList<Object>();
            da.add("字符串"+i);
            da.add(Long.valueOf(187837834L+i));
            da.add(Integer.valueOf(2233+i));
            da.add(Double.valueOf(2233.00+i));
            da.add(Float.valueOf(2233.0f+i));
            da.add(new Date());
            da.add(new BigDecimal("3434343433554545"+i));
            da.add(Short.valueOf((short)i));
            object.add(da);
        }
        return object;
    }

    public static List<List<String>> createTestListStringHead(){
        //写sheet3  模型上没有注解，表头数据动态传入
        List<List<String>> head = new ArrayList<List<String>>();
        List<String> headCoulumn1 = new ArrayList<String>();
        List<String> headCoulumn2 = new ArrayList<String>();
        List<String> headCoulumn3 = new ArrayList<String>();
        List<String> headCoulumn4 = new ArrayList<String>();
        List<String> headCoulumn5 = new ArrayList<String>();

        //一样名称会自动合并
        headCoulumn1.add("第一列");
        headCoulumn2.add("第二列");

        headCoulumn3.add("第三列");
        headCoulumn4.add("第四列");
        headCoulumn5.add("第五列");

        head.add(headCoulumn1);
        head.add(headCoulumn2);
        head.add(headCoulumn3);
        head.add(headCoulumn4);
        head.add(headCoulumn5);
        return head;
    }

//    public static List<ExcelWriteUser> createTestListJavaMode(){
//        List<ExcelWriteUser> model1s = new ArrayList<ExcelWriteUser>();
//        for (int i = 0; i <10000 ; i++) {
//            ExcelWriteUser model1 = new ExcelWriteUser();
//            model1.setId(i);
//            model1.setAge(i);
//            model1.setDelete((byte) 0);
//            model1.setName("aaa"+i);
//            model1.setSex((byte) 1);
//            model1.setCreateTime(new Date());
//            model1s.add(model1);
//        }
//        return model1s;
//    }

    public static TableStyle createTableStyle() {
        TableStyle tableStyle = new TableStyle();
        Font headFont = new Font();
        headFont.setBold(true);
        headFont.setFontHeightInPoints((short)22);
        headFont.setFontName("楷体");
        tableStyle.setTableHeadFont(headFont);
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLUE);

        Font contentFont = new Font();
        contentFont.setBold(true);
        contentFont.setFontHeightInPoints((short)22);
        contentFont.setFontName("黑体");
        tableStyle.setTableContentFont(contentFont);
        tableStyle.setTableContentBackGroundColor(IndexedColors.GREEN);
        return tableStyle;
    }
}
