import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2016, 5, 12);
        LocalDate date2 = LocalDate.of(2020, 1, 6);
        LocalDate date3 = LocalDate.of(2018, 8, 12);
        LocalDate date4 = LocalDate.of(2011, 8, 12);
        LocalDate date5 = LocalDate.of(2009, 8, 12);

        List<Offer> offers = new ArrayList<Offer>();
        Car toyota = new Car("Toyota Corrola", 2020, 220000, 7500);
        Offer offer3 = new Offer(toyota, "Po 13 latach powraca do sprzedaży", date1);
        Car nissan = new Car("Nissan Skyline GTR r34", 2002, 23000, 500000);
        Offer offer2 = new Offer(nissan, "Legenda dla fanów motoryzacji !!!", date2);
        Car opel = new Car("Opel Meriva a", 2004, 199600, 4000);
        Offer offer1 = new Offer(opel, "Mały rodzinny ale pojemny pojazd", date3);
        Car audi = new Car("Audi a3", 20011, 150000, 10000);
        Offer offer4 = new Offer(audi, "Komfort i delikatność podróży   ", date4);
        Car bmw = new Car("BMW seria 3", 2012, 90000, 15000);
        Offer offer5 = new Offer(bmw, "Prawdziwe określenie prędkości   ", date5);
        OfferService service = new OfferService();

        offers.add(offer1);
        offers.add(offer2);
        offers.add(offer3);
        offers.add(offer4);
        offers.add(offer5);

        OfferService.printOffers(offers);

        service.sortingTitle(offers, false);
        OfferService.printOffers(service.sortingTitle(offers, false));
        service.sortingPrice(offers, true);
        OfferService.printOffers(service.sortingPrice(offers, false));
        service.sortingYear(offers, true);
        OfferService.printOffers(service.sortingYear(offers, false));
        service.sortingDate(offers, true);
        OfferService.printOffers(service.sortingDate(offers, false));

        OfferService.printOffers(offers);

        OfferService.printOffers(service.filteringPrice(offers, 8000, 500000));
        OfferService.printOffers(service.filteringTitle(offers, "Po"));
        OfferService.printOffers(service.filteringDate(offers, date4));
        OfferService.printOffers(service.filteringMileage(offers, 199600));
        OfferService.printOffers(service.filteringYear(offers, 2012));

    }
}