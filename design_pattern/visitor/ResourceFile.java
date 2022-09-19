package com.example.test.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/19
 */

public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Visitor vistor);
}


//...PPTFile、WordFile跟PdfFile类似，这里就省略了...

