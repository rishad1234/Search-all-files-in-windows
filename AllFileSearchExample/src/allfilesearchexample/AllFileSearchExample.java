
package allfilesearchexample;

import allfilesearchexample.search.Drive;
import static allfilesearchexample.search.getDrives;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class AllFileSearchExample {


    public static void main(String[] args) {
        search s = new search();
        
        List<String> rootPaths = new ArrayList<>(); 
        
        List<Drive> drives = getDrives();
        drives.forEach((drive) -> {
            if(drive.toString().equals(new String("C:\\"))){
                rootPaths.add(drive.toString() + "\\Users\\\\");
                
            }else{
                rootPaths.add(drive.toString() + "\\");
            }
        });
        
        rootPaths.forEach((root) -> {
            File[] file = new File(root).listFiles();
            showFiles(file, ".txt");
            //System.out.println(root);
        });
    }
    
    public static void showFiles(File[] files, String extension) throws NullPointerException{
        for(File file : files){
            if(file.isDirectory()){
                //System.out.println(file.toString());
                if(file.exists() && file.listFiles() != null)
                    showFiles(file.listFiles(), extension);
            }else{
                if(file.exists() && file.getName().endsWith(extension)){
                    System.out.println("File: " + file.getPath());
                }
            }
        }
    }
    
}
