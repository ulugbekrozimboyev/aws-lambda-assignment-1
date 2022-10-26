package uz.ulugbek.aws.lambda.assignment;

import java.util.Date;
import java.util.UUID;

import uz.ulugbek.aws.lambda.assignment.pojo.Location;
import uz.ulugbek.aws.lambda.assignment.pojo.Payment;
import uz.ulugbek.aws.lambda.assignment.pojo.Ticket;
import uz.ulugbek.aws.lambda.assignment.pojo.TicketClass;

/**
 * Handler for requests to Lambda function.
 */
public class App {

    public void truncTracker(Location location) {
        System.out.printf("latitude: %s , longitude: %s", location.getLatitude(), location.getLongitude());
    }

    public Ticket getTicket(Payment payment){
        Ticket ticket = new Ticket();

        if(payment.getAmount() == 500){
            ticket.setPrice(payment.getAmount());
            ticket.setTicketClass(TicketClass.ECONOMY);
        } else if (payment.getAmount() == 700) {
            ticket.setPrice(payment.getAmount());
            ticket.setTicketClass(TicketClass.BUSINESS);
        } else {
            throw new RuntimeException("You did not pay correct amount of money");
        }

        ticket.setTicketDate(new Date());
        ticket.setId(UUID.randomUUID());

        return ticket;
    }

}
