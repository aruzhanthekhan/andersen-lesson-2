import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TicketService {

    static List<Ticket> tickets;

    public static void main(String[] args) {

        tickets = new ArrayList<>();

        for (int i=0; i < 10; i++) {
            tickets.add(new Ticket(String.format("%d%d%d%d", i, i, i, i),
                    "ConcertHall" + i, i+101, System.currentTimeMillis(),
                    false, 'A', 2.1));
        }
    }
}