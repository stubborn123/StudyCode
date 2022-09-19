package com.example.test.visitor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/19
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
