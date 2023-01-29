package co.com.sofka.bank.values;

import java.util.Objects;

public class AmountVO {
    private final Integer value;

    public AmountVO(Integer value){
        this.value = Objects.requireNonNull(value);

        if(this.value==0){
            throw new IllegalArgumentException("Error!,  Value can't be cero");
        }

    }

    public Integer value(){
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
