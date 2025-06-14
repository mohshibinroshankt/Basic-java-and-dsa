import java.io.StringBufferInputStream;

interface Logger{
    void log(String msg);

    default void logInfo(String msg){
        System.out.println("[INFO]"+msg);
    }
    static void logSystem(String msg){
        System.out.println("[SYSTEM]"+msg);
    }
}

class FileLogger implements Logger{
    public void log(String msg){
        System.out.println("File Logger INFO >>"+msg);
    }
}

class ConsoleLogger implements Logger{
    public void log(String msg){
        System.out.println("Console Logger INFO >>"+msg);
    }
}
public class interface_static_methods_demo {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        fileLogger.logInfo("File log Entry");
        fileLogger.log("Logger Info");

        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.logInfo("Console log Entry");
        consoleLogger.log("Console Logger Info");

    }
}
