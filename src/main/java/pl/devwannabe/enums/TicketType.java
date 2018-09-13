package pl.devwannabe.enums;

/**
 * Każda wartość w klasie enum ma przypisaną niejawnie liczbę porządkową (od zera) zgodnie z
 * kolejnością występowania w klasie.
 * Konstruktor w Enum jest zawsze prywatny - brak możliwości tworzenia
 * obiektów poza klasą.
 */
public enum TicketType implements Commented {

    BUG("high"),
    TASK("medium"){
        @Override
        public boolean isAssigned() {
            return true;
        }
        @Override
        public void comment() {
            System.out.println("Comment for a task");
        }
    },
    SUGGESTION("low");

    private String priority;

    /**
     * Konstruktor w Enum jest zawsze prywatny - brak możliwości tworzenia
     * obiektów poza klasą - nie ma sensu tworzyć setterów
     */

    TicketType(String priority) {
        this.priority = priority;

    }

    public boolean isAssigned() {
        return false;
    }

    public void comment() {
        System.out.println("Standard comment");
    }

    public String getPriority() {
        return priority;
    }

}
