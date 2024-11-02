package app;

import sevice.Printer;

public class PrinterImpl implements Printer {

    @Override
    public void printMessage(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {

            Printer anonymousPrinter = new PrinterImpl() {
                @Override
                public void printMessage(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousPrinter.printMessage(message);

        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }


    public static class Message {

        private String text;

        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public Message() {
        }

        public Message(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }

    }

}