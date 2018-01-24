package tool;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xmfy on 2018/1/24.
 */
public class ImageSaver{

    public static Integer saveMultiPhotos(CommonsMultipartFile[] files, String targetPath){
        File dir = new File(targetPath);
        if (!dir.exists())
            dir.mkdir();
        for (CommonsMultipartFile file :files){
            try {
                if (new File(targetPath + "/" +file.getOriginalFilename()).exists())
                    continue;
                FileOutputStream fos = new FileOutputStream(targetPath + "/" +file.getOriginalFilename());
                InputStream is = file.getInputStream();
                int b;
                while ((b = is.read()) != -1){
                    fos.write(b);
                }
                fos.flush();
                is.close();
                fos.close();
            }catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return files.length;
    }
}
