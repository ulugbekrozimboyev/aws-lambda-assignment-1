package uz.ulugbek.aws.lambda.assignment.pojo;

import java.util.Date;
import java.util.UUID;

public class Ticket {

    private UUID id;
    private Date ticketDate;
    private Double price;
    private TicketClass ticketClass;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }
}
