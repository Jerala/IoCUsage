import services.WidgetService;

public class Main {
    public static void main(String[] args) {
        WidgetService widgetService = new WidgetService();
        widgetService.generateWidgets();
        widgetService.displayWidgets();
        widgetService.setHandlers();

        widgetService.setGeneralWidgetSize(300, 300);

        widgetService.serializeWidgets();
    }
}
