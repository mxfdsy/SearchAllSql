
import java.io.*;

/**
 * 寻找指定文件下的所有的以.sql文件为结尾的文件
 * Created by 平凡的世界 on 2018/3/12.
 */
public class SearchAllSql {
    public static void main(String[] args) {
        File source = new File("F:/工作资料");
        File dest = new File("这是汇总的Sql文件");
        sAllSql(source, dest);
        System.out.println("1111");
    }

    private static void sAllSql(File source, File dest) {
        File[] files = source.listFiles();
        for (File f : files
                ) {
            if (f.isFile() && f.getName().endsWith(".sql")) {
                getDate(f, dest);
            }
            if (f.isDirectory()) {
                sAllSql(f, dest);
            }
        }
    }

    private static void getDate(File datef, File dest) {
        try (
               FileInputStream in = new FileInputStream(datef);
               FileOutputStream out = new FileOutputStream(dest,true);

        ) {
            byte[] buffer = new byte[1024];
            int len = in.read(buffer);
            while (len != -1) {
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            out.write("\r\n".getBytes());
                in.close();
                out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Created by 平凡的世界 on 2018/3/16.
     */
    public static class Person {
    }
}
