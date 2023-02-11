package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

public class FileDataSource implements DataSource {

	@Override
	public String getData() throws IOException {
		 BufferedReader reader = null;
		 StringBuilder data = new StringBuilder();
		 try {
		 reader = new BufferedReader(
	                new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
		  String aLine;
          while ((aLine = reader.readLine()) != null) {
              
              data.append(aLine);
          }
		 }
       finally {
         
          if (reader != null) {
              reader.close();
          }
	}
		 return data.toString();
	}
		 

	}
