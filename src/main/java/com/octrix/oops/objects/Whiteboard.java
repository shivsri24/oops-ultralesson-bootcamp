package com.octrix.oops.objects;

public class Whiteboard {
    private double size;
    private int whiteboardCleanLevel;
    private int whiteboardFilledLevel;

    public Whiteboard(double size, int whiteboardCleanLevel, int whiteboardFilledLevel){
        this.size = size;
        this.whiteboardCleanLevel = whiteboardCleanLevel;
        this.whiteboardCleanLevel = whiteboardFilledLevel;
    }

    public String fillBoard(){
        if(whiteboardFilledLevel > 0) {
            whiteboardFilledLevel--;
            return "Whiteboard is getting filled, please save some space for the other topics.";
        }
        else {
            return "Whiteboard is completely filled, please Erase if required!";
        }
    }

    public String cleanBoard(){
        if(whiteboardCleanLevel > 0) {
            whiteboardCleanLevel--;
            return "Whiteboard is getting erased, you could now write something";
        }
        else {
            return "Whiteboard is completely clean, you can now use it for new topics!";
        }
    }

}
