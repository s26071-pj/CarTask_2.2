import java.util.List;

public interface Sorting {
    List<Offer> sortingTitle(List<Offer> offers, boolean ascending);
    List<Offer> sortingPrice(List<Offer> offers, boolean ascending);
    List<Offer> sortingDate(List<Offer> offers, boolean ascending);
    List<Offer> sortingYear(List<Offer> offers, boolean ascending);
}