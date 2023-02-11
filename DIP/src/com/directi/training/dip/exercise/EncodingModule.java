package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule
{
	Encoder encoder;
	DataSource datasource;
	DataDestination datadestination;
    public EncodingModule(Encoder encoder,DataSource datasource,DataDestination datadestination) {
        this.encoder = encoder;
    }
    public void encode() throws IOException
    {   
    	String data=datasource.getData();
    	encoder.encode(data);
    	datadestination.write(data);  
    }


}

