/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reader;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
/**
 *
 * @author Nikas Zalias
 */
public class Reader {
    private String path;
    
    public Reader(String file_path) {
        path = file_path;
    }
    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        int numberOfLines = readLines();
        String[] textData = new  String[numberOfLines];
        
        for (int i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        textReader.close();
        return textData;
    }
    
    int readLines() throws IOException {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        String aLine;
        int numberOfLines = 0;
        
        while((aLine = bf.readLine()) != null) {
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
    
}
