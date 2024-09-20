package sspu.zzx;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
public class Person<T,V> {
    private T name;
    private V value;
}
