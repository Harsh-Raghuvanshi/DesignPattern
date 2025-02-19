package org.example.UndoRedoPattern.Commands;

public interface Command {
    void execute();
    void undo();
}
