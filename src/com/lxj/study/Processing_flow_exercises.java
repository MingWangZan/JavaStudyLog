package com.lxj.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Processing_flow_exercises {
    public static void main(String[] args) {
        try {
            File file = new File("./files/test/printStream.txt");
            if (!file.exists()) {
                System.out.println(file.createNewFile() ? "创建文件成功":"创建文件失败");
            }
            byte[] bytes = "测试单例".getBytes(StandardCharsets.UTF_8);
            PrintStream printStream = new PrintStream(file);
            printStream.write(bytes);

            printStream.flush();
            printStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("没有找到文件");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
