package com.directi.training.dip.exercise_refactored;

public class EncodingModule
{
    public void encodeWithFiles(FileReader filereader, FileWriter filewriter) throws IOException
    {
        String aLine = filereader.read();
        String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
        filewriter.write(encodedLine);
    }

    public void encodeWithNetworkAndDatabase(NetworkReader networkReader, Database database) throws IOException
    {
        String aLine = networkReader.read();
        String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
        database.write(encodedLine);
    }

}
