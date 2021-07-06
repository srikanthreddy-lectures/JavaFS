package challengs1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadFileStoreInMap {
    public static void main(String[] args) {
        System.out.println(readFileToMap());
    }

    public static Map<String,String> readFileToMap(){
        BufferedReader br = null;
        Map<String,String> map = null;
        try{
             br =new BufferedReader(new FileReader(new File("D:\\Windows\\Download\\demo\\FSOnline\\src\\challengs1\\myfile.txt")));
            String line= br.readLine();
            map = Arrays.asList(line).stream()
                    .map(ss->ss.split(" "))
                    .collect(Collectors.toMap(ss->ss[0], ss->ss[1]));

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
