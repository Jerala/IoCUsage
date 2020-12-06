package providers;

import grigorev.data.WidgetType;
import grigorev.services.WidgetSerializer;

public class GenericWidgetSerializer implements WidgetSerializer {

    public String serialize() {
        return "Serialize object with type GENERIC!";
    }

    public WidgetType getWidgetType() {
        return WidgetType.GENERIC;
    }

}
