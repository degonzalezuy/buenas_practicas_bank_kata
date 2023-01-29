package co.com.sofka.bank.values;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DateVO {
    private final LocalDate date;
    private final String format;

    public DateVO(int day, int month, int year){
        try{
            date = LocalDate.of(year, month, day);
            if(date.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("Invalid Date of event");
            }
        }catch(DateTimeException e){
            throw new IllegalArgumentException("Invalid Date of event");
        }
        format = generateFormat();
    }

    private String generateFormat(){
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public String value(){
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateVO)) return false;
        DateVO that = (DateVO) o;
        return Objects.equals(date, that.date) && Objects.equals(format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, format);
    }

    @Override
    public String toString() {
        return format;
    }
}
