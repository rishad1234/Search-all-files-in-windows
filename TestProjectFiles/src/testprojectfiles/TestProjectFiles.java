
package testprojectfiles;

import java.io.File;


public class TestProjectFiles {
    public static void main(String[] args) {
        File[] files = new File("C:/Users/").listFiles();
        showFiles(files);
    }
    
    public static void showFiles(File[] files) throws NullPointerException{
        for(File file : files){
            if(file.isDirectory()){
                //System.out.println(file.toString());
                if(file.exists() && file.listFiles() != null)
                    showFiles(file.listFiles());
            }else{
                if(file.exists() && file.getName().endsWith(".mp3")){
                    System.out.println("File: " + file.getPath());
                }
            }
        }
    }
}