import java.time.LocalDate;
import java.util.List;

public interface Filtering {
    List<Offer> filteringPrice(List<Offer> offers, double priceMin, double priceMax);
    List<Offer> filteringTitle(List<Offer> offers, String title);
    List<Offer> filteringDate(List<Offer> offers, LocalDate date);
    List<Offer> filteringYear(List<Offer> offers, int year);
    List<Offer> filteringMileage(List<Offer> offers, double mileage);
}