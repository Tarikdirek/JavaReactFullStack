package oopWithNLayerApp.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println(data + " mail olarak gönderildi.");
    }
}
