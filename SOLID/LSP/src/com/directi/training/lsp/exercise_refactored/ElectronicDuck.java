package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements DuckInterface
{
    @Override
    public void quack() throws DuckOffException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckOffException
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }
    
    public static class DuckOffException extends DuckException
    {
        public DuckOffException(String message)
        {
            super(message);
        }
    }
}
