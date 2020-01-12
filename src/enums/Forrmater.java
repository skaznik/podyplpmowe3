package enums;

public enum Forrmater {
    CALM{
        public String format(String message) {
            return "Wiadomość przekazana w sposób łagodny" + message;
        }
    },
    NERVOUS {
        public String format(String message) {
            return "Wiadomość przekazana w sposób bardziej agresywny" + message;
    }

    public abstract String format(String message);
}


