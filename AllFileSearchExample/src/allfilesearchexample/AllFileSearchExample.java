
package allfilesearchexample;

import allfilesearchexample.search.Drive;
import static allfilesearchexample.search.getDrives;
import java.util.List;


public class AllFileSearchExample {


    public static void main(String[] args) {
        search s = new search();
        
        List<Drive> drives = getDrives();
        drives.forEach((drive) -> {
            System.out.println(drive.toString());
        });
    }
    
}
