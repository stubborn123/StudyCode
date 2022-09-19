package com.example.test.visitor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/19
 */
public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pdfFile);
    void visit(WordFile pdfFile);
}
