import java.time.LocalDate;

public class Offer {

    private Car car;
    private String title;
    private LocalDate date;

    public Offer(Car car, String title, LocalDate date) {
        this.car = car;
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}