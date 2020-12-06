package handlers;

import grigorev.data.Widget;
import grigorev.eventhandlers.WidgetResizeEventHandler;

public class ResizeEventHandler implements WidgetResizeEventHandler {

    public void handle(Widget widget, int oldWidth, int oldHeight) {
        System.out.println("Resize widget " + widget.getName() + " from [" + oldWidth + "," + oldHeight
                + "]" + " to [" + widget.getWidth() + "," + widget.getHeight() + "]");
    }

}
