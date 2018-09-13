package pl.devwannabe.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

//        TicketType tType = new TicketType();

        for (TicketType ticketType : TicketType.values()) {
            System.out.println(ticketType.ordinal());
        }

        System.out.println("-------------------------------------");

        for (TicketType ticketType : TicketType.values()) {
            System.out.println(ticketType.getPriority());
        }

        System.out.println("-------------------------------------");

        for (TicketType ticketType : TicketType.values()) {
            System.out.println(ticketType.isAssigned());
        }

        System.out.println("-------------------------------------");

        for (TicketType ticketType : TicketType.values()) {
            ticketType.comment();
        }

        System.out.println("-------------------------------------");


        TicketType bug = TicketType.BUG;
        TicketType suggestion = TicketType.SUGGESTION;

        /**
         * Porównanie Enum odbywa się zawsze operatorem ==
         */
        System.out.println(bug == suggestion);


        TicketType ticketType = TicketType.BUG;
        OtherType otherType = OtherType.FIRST;

//        System.out.println(ticketType == otherType);

        System.out.println("-------------------------------------");

        Set<TicketType> ticketTypeEnumSet = EnumSet.of(TicketType.SUGGESTION, TicketType.BUG);

        for (TicketType type : ticketTypeEnumSet) {
            System.out.println(type.ordinal());
        }

        System.out.println("-------------------------------------");

        Set<TicketType> ticketTypeEnumSet2 = EnumSet.allOf(TicketType.class);

        ticketTypeEnumSet2.forEach(System.out::println);

        System.out.println("-------------------------------------");
        /**
         * W przypadku Enum mapy klucze zawsze będą typu enum a wartości
         * dowolnego typu. W konstruktorze EnumMap musi się zawsze znajdować
         * typ enuma z rozszerzeniem class
         */
        EnumMap<TicketType, String> enumMap = new EnumMap<TicketType, String>(TicketType.class);

        enumMap.put(TicketType.TASK, "BATMAN");
        enumMap.put(TicketType.BUG, "SUPERMEN");

        System.out.println(enumMap.get(TicketType.BUG));

    }

}
