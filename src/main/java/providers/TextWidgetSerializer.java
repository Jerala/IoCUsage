package providers;

import grigorev.data.WidgetType;
import grigorev.services.WidgetSerializer;

public class TextWidgetSerializer implements WidgetSerializer {

    public String serialize() {
        return "Serialize object with type TEXT!";
    }

    public WidgetType getWidgetType() {
        return WidgetType.TEXT;
    }

}
