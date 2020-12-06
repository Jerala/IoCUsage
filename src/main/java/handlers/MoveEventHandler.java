package handlers;

import grigorev.data.Widget;
import grigorev.eventhandlers.WidgetMoveEventHandler;

public class MoveEventHandler implements WidgetMoveEventHandler {

    public void handle(Widget widget, int oldX, int oldY) {
        System.out.println("Move widget " + widget.getName() + " from [" + oldX + "," + oldY
            + " to [" + widget.getX() + "," + widget.getY() + "]");
    }

}
