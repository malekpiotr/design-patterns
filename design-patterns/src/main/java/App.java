import pl.sda.creational.builder.Customer;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer.Builder("John", "Smith")
                .livesIn("Szczecin")
                .bornAt(LocalDate.now())
                .withPesel ("4534534543")
                .workingAs("Lumberjack")
                .build();
    }
}
