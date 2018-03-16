import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;

/**
 * 需求：列出该文件下的所有目录
 * Created by 平凡的世界 on 2018/3/12.
 * 测试commmit
 */
public class SerachAllFile {
    public static void main(String[] args) {

        File dir = new File("F:\\工作资料");
        listAllFile(dir);

    }

    private static void listAllFile(File f) {
        System.out.println(f);
        System.out.println(f.getName());
        File[] fs = f.listFiles();
        for (File file:fs
             ) {
            if (file.isDirectory()) {
                listAllFile(file);
            }
            System.out.println(file);
        }

    }
}
