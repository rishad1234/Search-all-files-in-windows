
package testprojectfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestProjectFiles {
    public static final List<String> fileDir = new ArrayList<>();
    public static void main(String[] args) {
        File[] files = new File("E:/").listFiles();
        showFiles(files);
    }
    
    public static void showFiles(File[] files) throws NullPointerException{
        for(File file : files){
            if(file.isDirectory()){
                //System.out.println(file.toString());
                if(file.exists())
                    showFiles(file.listFiles());
            }else{
                if(file.exists() && file.getName().endsWith(".mp3")){
                    System.out.println("File: " + file.getPath());
                }
            }
        }
    }
}