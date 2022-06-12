import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaFilm;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class ShowAfishaManagerTest {
    AfishaFilm first = new AfishaFilm("Бладшот", "боевик");
    AfishaFilm second = new AfishaFilm("Вперед", "мультфильм");
    AfishaFilm third = new AfishaFilm("Отель", "комедия");
    AfishaFilm fourth = new AfishaFilm("Джентельмены", "боевик");
    AfishaFilm fifth = new AfishaFilm("Бэтмэн", "детектив");
    AfishaFilm sixth = new AfishaFilm("Финник", "мультфильм");
    AfishaFilm seventh = new AfishaFilm("Орел и решка", "комедия");
    AfishaFilm eighth = new AfishaFilm("Наемник", "боевик");
    AfishaFilm ninth = new AfishaFilm("Морбиус", "ужасы");
    AfishaFilm tenth = new AfishaFilm("Падение луны", "фантастика");
    AfishaFilm eleventh = new AfishaFilm("Крик", "ужасы");

    @Test
    void showUnder5() {
        AfishaManager manager = new AfishaManager(5);

        AfishaFilm films = new AfishaFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.show();

        AfishaFilm[] expected = {fourth, third, second, first};
        AfishaFilm[] actual = manager.show();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showOver5() {
        AfishaManager manager = new AfishaManager(5);

        AfishaFilm films = new AfishaFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.show();

        AfishaFilm[] expected = {sixth, fifth, fourth, third, second};
        AfishaFilm[] actual = manager.show();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showUnder10() {
        AfishaManager manager = new AfishaManager();

        AfishaFilm films = new AfishaFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.show();

        AfishaFilm[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        AfishaFilm[] actual = manager.show();
        assertArrayEquals(expected, actual);
    }

    @Test
    void show10() {
        AfishaManager manager = new AfishaManager();

        AfishaFilm films = new AfishaFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.show();

        AfishaFilm[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        AfishaFilm[] actual = manager.show();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showOver10() {
        AfishaManager manager = new AfishaManager();

        AfishaFilm films = new AfishaFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        manager.show();

        AfishaFilm[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        AfishaFilm[] actual = manager.show();
        assertArrayEquals(expected, actual);
    }
}