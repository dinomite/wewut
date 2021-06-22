package wewut.refactored;

import wewut.Customer;
import wewut.Rental;

public class a {
    public static CustomerBuilder customer =
            new CustomerBuilder();
    public static RentalBuilder rental =
            new RentalBuilder();
    public static MovieBuilder movie =
            new MovieBuilder();

    public static class CustomerBuilder {
        Rental[] rentals;
        String name;

        CustomerBuilder() {
            this("Jim", new Rental[0]);
        }

        CustomerBuilder(
                String name, Rental[] rentals) {
            this.name = name;
            this.rentals = rentals;
        }

        public CustomerBuilder w(
                RentalBuilder... builders) {
            Rental[] rentals =
                    new Rental[builders.length];
            for (int i = 0; i < builders.length; i++) {
                rentals[i] = builders[i].build();
            }
            return
                    new CustomerBuilder(name, rentals);
        }

        public CustomerBuilder w(String name) {
            return
                    new CustomerBuilder(name, rentals);
        }

        public Customer build() {
            Customer result = new Customer(name);
            for (Rental rental : rentals) {
                result.addRental(rental);
            }
            return result;
        }
    }
}
