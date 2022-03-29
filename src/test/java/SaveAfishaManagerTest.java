import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SaveAfishaManagerTest {

    AfishaManager manager = new AfishaManager();

    @Test
    void save() {
        AfishaFilm first = new AfishaFilm("Бладшот", "боевик");
        AfishaFilm second = new AfishaFilm("Вперед", "мультфильм");
        AfishaFilm third = new AfishaFilm("Отель", "комедия");
        AfishaFilm fourth = new AfishaFilm("Джентельмены", "боевик");

        AfishaFilm films = new AfishaFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        manager.save(fourth);

        AfishaFilm[] expected = {first, second, third, fourth};
        AfishaFilm[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }


}