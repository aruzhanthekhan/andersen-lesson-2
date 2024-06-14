import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TicketService {

    private static List<Ticket> tickets;

    public static void main(String[] args) {

        tickets = new ArrayList<>();

        for (int i=0; i < 10; i++) {
            tickets.add(new Ticket(String.format("%d%d%d%d", i, i, i, i),
                    "ConcertHall" + i, i+101, System.currentTimeMillis(),
                    false, 'A', 2.1));
        }

//        System.out.println(getTicketById("1111"));

        User user;
        for (int i=0; i<3; i++) {
            if (i%2 == 0) {
                user = new Client();
                user.printRole();
                user.getTicket();
            }
            else {
                user = new Admin();
                user.printRole();
                user.checkTicket();
            }
        }

        Ticket ticket = tickets.getFirst();
        System.out.println(ticket);
        ticket.changeTimeAndSector(1718369135, 'B');
        System.out.println(ticket);

        Shareable phoneShareableTicket = new PhoneShareable();
        ticket.share(phoneShareableTicket);
        Shareable phoneAndEmailShareableTicket = new PhoneAndEmailShareable();
        ticket.share(phoneAndEmailShareableTicket);
    }

    public static Ticket getTicketById (String ticketId) {
        for (Ticket ticket: tickets) {
            if (Objects.equals(ticket.ticketID, ticketId)) {
                return ticket;
            }
        }
        return null;
    }
}