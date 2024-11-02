package app;

public class Lesson14 {
    public static void main(String[] args) {
        PrinterImpl newPrinter = new PrinterImpl();
        PrinterImpl.Message onlyText = new PrinterImpl.Message("Print");
        PrinterImpl.Message fullMessage = new PrinterImpl.Message("Hello World", "Java");
        PrinterImpl.Message empty = new PrinterImpl.Message();
        newPrinter.printMessage(onlyText);
        newPrinter.printMessage(fullMessage);
        newPrinter.printMessage(empty);
    }
}
