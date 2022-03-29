import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowAfishaManagerTest {
    AfishaManager manager = new AfishaManager(4);

    @Test
    void show() {
        AfishaFilm first = new AfishaFilm("Бладшот", "боевик");
        AfishaFilm second = new AfishaFilm("Вперед", "мультфильм");
        AfishaFilm third = new AfishaFilm("Отель", "комедия");
        AfishaFilm fourth = new AfishaFilm("Джентельмены", "боевик");

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
}