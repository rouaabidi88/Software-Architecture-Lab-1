package com.directi.training.dip.exercise_refactored;

public class Database
{
    private static Map<Integer, String> data = new HashMap<>();
    private static int count = 0;

    public int write(String inputString)
    {
        data.put(++count, inputString);
        return count;
    }
}
