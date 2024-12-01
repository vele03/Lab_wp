package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.EventBooking;
import mk.finki.ukim.mk.lab.model.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Event> events = null;
    public static List<EventBooking> eventBookings = null;
    public static List<Location> locations = null;

    // On application startup, initialize the categories list
    // On each startup, the list will be initialized with the same values and the previous values will be lost
    @PostConstruct
    public void init() {
        locations = new ArrayList<>();
        locations.add(new Location("Rakometno", "Adresa 1", "500", "Deskripcija za rakometno"));
        locations.add(new Location("Dihovo", "Adresa 2", "1235", "Deskripcija za dihovo"));
        locations.add(new Location("Silbo", "Adresa 3", "150", "Deskripcija za silbo"));
        locations.add(new Location("Imperator", "Adresa 4", "300", "Deskripcija za imperator"));
        locations.add(new Location("Netavile", "Adresa 5", "80", "Deskripcija za netavile"));
        events = new ArrayList<>();
        events.add(new Event("Gamers Cup", "A finale where gamers compete for the title of BEST", 10.00, locations.get(0)));
        events.add(new Event("Cooking Show", "The best chefs show you how its done", 7.30, locations.get(1)));
        events.add(new Event("Basketball Finale", "The 2 best teams will settle their score in a 3v3 showoff", 10.00, locations.get(2)));
        events.add(new Event("CS Meetup", "Biggest meetup for the students of FINKI", 9.25, locations.get(3)));
        events.add(new Event("Bullet Chess Finale", "Fastest chess players will challange the title of GM", 6.75, locations.get(4)));
        events.add(new Event("National Volleyball Championship", "The brackets will face off in the start of the national championship", 7.45, locations.get(1)));
        events.add(new Event("Test", "This is a test example with description", 2.15, locations.get(0)));
        events.add(new Event("Test Number 2", "This is the second test", 1.45, locations.get(2)));
        events.add(new Event("Test Finale", "This is the final test of the test section", 1.00, locations.get(4)));
        events.add(new Event("Code Wars", "A hackaton for the fastest programmers", 10.00, locations.get(3)));


        eventBookings= new ArrayList<>();



    }}
