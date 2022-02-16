package com.lxj.study;

import java.io.*;
import java.util.Objects;

public class StreamFileIOStudy {
    public static void main(String[] args) throws IOException {

//        new BRRead();
//        new BRReadLines();
//        new WriteDemo();
//        new FileStreamTest("./files/index.text");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入字符，按下 'q' 退出。");
//        char a;
//        do {
//            a = scanner.next().charAt(0);
//            System.out.println(a);
//        } while (a != 'q');

//        new CreateDir("./files/test/666");

        String[] str = {"yyop.bmp", "666.txt", "test.png"};
        File fileTxt = new File("./files/file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(fileTxt);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.append("文件目录遍历练习\r\n");
        new DirList(new File("C:\\"), 1, outputStreamWriter, str);
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}

class BRRead {
    public BRRead() {
        char c;
//         使用 System.in 创建 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下 'q' 键退出。");
        // 读取字符
        try {
            do {
                c = (char) bufferedReader.read();
                System.out.println(c);
            } while (c != 'q');
        } catch (IOException ioException) {
            System.out.println("IO异常");
        }
    }
}

class BRReadLines {
    public BRReadLines() {
        // 使用 Systemctl.in 创建 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter Lines of text.");
        System.out.println("Enter 'end' to quit.");

        try {
            do {
                str = bufferedReader.readLine();
                System.out.println(str);
            } while (!str.equals("end"));
        } catch (IOException i) {
            System.out.println("IO异常退出");
        }
    }
}

class WriteDemo {
    public WriteDemo() {
        int b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }
}

class FileStreamTest {
    public FileStreamTest(String path) {
        try {
            InputStream fileInputStream = new FileInputStream(path);
            byte[] res1 = fileInputStream.readAllBytes();
            fileInputStream.close();

            OutputStream outputStream = new FileOutputStream(path);
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            outputStream.write(res1);
            writer.append("再次测试666666\r\n");
            writer.close();
            outputStream.close();

            File file = new File(path);
            InputStream inputStream = new FileInputStream(file);
            byte[] res2 = inputStream.readAllBytes();
            inputStream.close();

            OutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter writer1 = new OutputStreamWriter(fileOutputStream);
            fileOutputStream.write(res2);
            writer1.append("写入缓冲区");
            writer1.append("\r\n");
            writer1.append("成功！\r\n");
            writer1.close();
            fileOutputStream.close();
        } catch (IOException i) {
            System.out.println("IO异常退出：" + i.getLocalizedMessage());
        }
    }
}

class testDemo {
    public testDemo(byte[] data) {
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (int i = 0; i < data.length; i++) {
            String hex = Integer.toHexString(data[i]);
        }
        for (byte datum : data) {

        }
    }
}

class CreateDir {
    public CreateDir(String path) {
        File file = new File(path);
        if (!file.isDirectory()) {  // 判断文件是否存在
            boolean mkdirs = file.mkdirs();
            System.out.println(mkdirs ? "创建文件成功" : "创建文件失败");
        } else {
            System.out.println("文件已存在");
        }
    }
}

// 遍历指定文件夹下的所有文件。
class DirList {
    public DirList(File path, int num, OutputStreamWriter outputStreamWriter, String... deletePaths) throws IOException {
//        boolean judgePathEnd = path.getAbsolutePath().endsWith("/");
//        // 使用 StringBuilder 更高效的操作字符串
//        StringBuilder newPath = new StringBuilder(path.getName());
//        if (!judgePathEnd) {
//            newPath.append("/");
//        }
//        File file = new File(String.valueOf(path));

        StringBuffer outString = new StringBuffer("目录" + path.getPath());
        for (int i = num; i > 1; i--) {
            outString.insert(0, "\t");
        }
        System.out.println(outString);
        if (path.isDirectory()) {
            File[] s = path.listFiles();
            assert s != null;
            for (File file1 : s) {

                // 判断当前 访问的是 文件 还是 目录
                if (file1.isDirectory()) {
                    StringBuffer stringBuffer = new StringBuffer(file1.getName() + "\r\n");
                    for (int i = num; i > 1; i--) {
                        stringBuffer.insert(0, "\t");
                    }
                    System.out.println(stringBuffer);
                    outputStreamWriter.append(stringBuffer);
                    // 判断程序对此文件是否有访问权限。
                    boolean haveReadJurisdiction = file1.listFiles() == null;
                    // 如果没有访问权限，则跳过本次循环。
                    if (haveReadJurisdiction) continue;

                    deleteFiles(file1, deletePaths);
                    int numNext = num + 1;
                    new DirList(file1, numNext, outputStreamWriter, deletePaths);
                } else {
                    StringBuffer stringBuffer = new StringBuffer(file1.getName() + "\r\n");
                    for (int i = num; i > 1; i--) {
                        stringBuffer.insert(0, "\t");
                    }
                    deleteFiles(file1, deletePaths);
                    outputStreamWriter.append(stringBuffer);
                }
            }
            outputStreamWriter.flush();
        } else {
            System.out.println("文件" + path.getPath());
            StringBuffer stringBuffer = new StringBuffer(path.getName() + "\r\n");
            for (int i = num; i > 1; i--) {
                stringBuffer.insert(0, "\t");
            }
            System.out.println(stringBuffer);
            outputStreamWriter.append(stringBuffer);
            deleteFiles(path, deletePaths);
        }
    }

    public void deleteFiles(File file, String... fileNames) {
        for (String fileName : fileNames) {
            if (fileName.equals(file.getName())) {
                boolean deleteResult = file.delete();
                System.out.println(deleteResult ? "删除成功" : "删除失败");
            }
        }
    }
}

class inputStre {
    public void yesrs() throws FileNotFoundException {
        File file = new File("./files/test/file.txt");
        PrintStream printStream = new PrintStream(file);
    }
}