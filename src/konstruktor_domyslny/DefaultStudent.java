package konstruktor_domyslny;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DefaultStudent {
    int indeks() default 0;
    String imie() default "imie";
    String nazwisko() default "nazwisko";
    double ocena() default 0;
}
