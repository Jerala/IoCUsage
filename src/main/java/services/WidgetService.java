package services;

import grigorev.WidgetContainer;
import grigorev.data.GenericWidget;
import grigorev.data.PictureWidget;
import grigorev.data.TextWidget;
import grigorev.data.Widget;
import handlers.MoveEventHandler;
import handlers.ResizeEventHandler;

import java.util.Arrays;

public class WidgetService {

    private WidgetContainer container = new WidgetContainer();

    public void generateWidgets() {
        Widget genericWidget = new GenericWidget();
        genericWidget.setSize(200, 100);
        genericWidget.setPosition(0, 0);
        genericWidget.setName("General widget");

        TextWidget labelWidget = new TextWidget();
        labelWidget.setName("Label");
        labelWidget.setSize(200, 20);
        labelWidget.setPosition(10, 10);
        labelWidget.setFont("Times New Roman");

        GenericWidget genericWidget1 = new GenericWidget();
        genericWidget1.setSize(200, 70);
        genericWidget1.setPosition(15, 10);
        genericWidget1.setName("Nested generic widget");

        TextWidget nestedLabelWidget = new TextWidget();
        nestedLabelWidget.setName("Label");
        nestedLabelWidget.setSize(200, 20);
        nestedLabelWidget.setPosition(15, 25);
        nestedLabelWidget.setFont("Times New Roman");

        PictureWidget pictureWidget = new PictureWidget();
        pictureWidget.setName("Picture");
        pictureWidget.setSize(40, 40);
        pictureWidget.setPosition(15, 40);
        pictureWidget.setUrl("./*.jpg");

        genericWidget1.setWidgets(Arrays.asList(nestedLabelWidget, pictureWidget));
        genericWidget.setWidgets(Arrays.asList(labelWidget, genericWidget1));

        container.addWidget(genericWidget);

    }

    public void displayWidgets() {
        container.displayWidgets();
    }

    public void setHandlers() {
        Widget widget = container.getWidgets().get(0);
        widget.addMoveEventHandler(new MoveEventHandler());
        widget.addResizeEventHandler(new ResizeEventHandler());
    }

    public void setGeneralWidgetSize(int width, int height) {
        Widget widget = container.getWidgets().get(0);
        widget.setSize(width, height);
    }

    public void serializeWidgets() {
        Widget widget = container.getWidgets().get(0);
        System.out.println(widget.serialize());
    }

}
