package providers;

import grigorev.data.WidgetType;
import grigorev.services.WidgetSerializer;

public class PictureWidgetSerializer implements WidgetSerializer {

    public String serialize() {
        return "Serialize object with type PICTURE!";
    }

    public WidgetType getWidgetType() {
        return WidgetType.PICTURE;
    }

}
