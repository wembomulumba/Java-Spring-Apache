package romaniancoder.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {

        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot",200.50, 3));
        bookings.add(new HotelBooking("Wembo", 123, 6));
        bookings.add(new HotelBooking("Mutomf",99.43, 2 ));
        bookings.add(new HotelBooking("Roland Cra",56.43, 5 ));
        bookings.add(new HotelBooking("Cristian",56.43, 5 ));
        bookings.add(new HotelBooking("Eric Cra",150.43, 5 ));
        bookings.add(new HotelBooking("Demonstration Team",39, 5 ));
        bookings.add(new HotelBooking("Kabila",79.43, 5 ));

        bookingRepository.save(bookings);
    }

}
