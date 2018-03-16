

import java.io.File;
import java.io.FilenameFilter;

/**
 * 需求;查询指定文件下的Sql文件
 * Created by 平凡的世界 on 2018/3/12.
 */
public class SearchFile {
    public static void main(String[] args) {
        String dir = "F:/";
        File file = new File(dir);
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dr, String name) {
                return  new File(dr,name).isFile() & name.endsWith(".sql");
            }
        });
        for (String str :list
             ) {
            System.out.println(str);
        }
    }
}
