public class TicketService {
    public static void main(String[] args) {
        Ticket fullTicket = new Ticket("123A", "ConcertHall1", 123,
                1672522561L, true, 'B', 5.5);

        Ticket limitedTicket = new Ticket("ConcertHall2", 124, 1672525561L);

        Ticket emptyTicket = new Ticket();

        System.out.println(fullTicket);
        System.out.println(limitedTicket);
        System.out.println(emptyTicket);
    }
}