package com.directi.training.lsp.exercise_refactored;

public interface DuckInterface
{
    void quack();

    void swim();

    class DuckException extends Exception
    {
        public DuckException(String message)
        {
            super(message);
        }
    }
}
