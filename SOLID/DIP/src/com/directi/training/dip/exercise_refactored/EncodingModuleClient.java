package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        FileReader filereader = new FileReader("DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt");
        FileWriter filewriter = new FileWriter("DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt");
        encodingModule.encodeWithFiles(filereader, filewriter);

        NetworkReader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        Database database = new Database();
        encodingModule.encodeWithNetworkAndDatabase(networkReader, database);
    }
}
