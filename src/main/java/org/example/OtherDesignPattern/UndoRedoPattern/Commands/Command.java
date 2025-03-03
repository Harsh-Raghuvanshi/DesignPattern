package org.example.OtherDesignPattern.UndoRedoPattern.Commands;

public interface Command {
    void execute();
    void undo();
}
