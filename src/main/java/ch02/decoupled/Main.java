package ch02.decoupled;

public class Main {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
