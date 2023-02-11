package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataDestination implements DataDestination {

	@Override
	public int write(String data) {
		BufferedWriter writer = null;
		try {
            writer = new BufferedWriter(new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		return 0;
		
	}

}
