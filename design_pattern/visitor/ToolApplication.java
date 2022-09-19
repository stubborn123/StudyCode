package com.example.test.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/19
 */
public class ToolApplication {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        //List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new PdfFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for(ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        //resourceFiles.add(new PdfFile("a.pdf"));
        //resourceFiles.add(new PdfFile("b.word"));
        resourceFiles.add(new WordFile("C:\\Users\\zhangpeng\\Documents\\工作交接.docx"));
        //resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
