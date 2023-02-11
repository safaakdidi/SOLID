package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule fileencodingModule = new EncodingModule(new Base64Encoder(),new FileDataSource(),new FileDataDestination());
        EncodingModule dbencodingModule = new EncodingModule(new Base64Encoder(),new NetworkDataSource(),new MyDatabase());
        fileencodingModule.encode();
        dbencodingModule.encode();

    }
}
