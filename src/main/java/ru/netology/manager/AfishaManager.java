package ru.netology.manager;

import ru.netology.domain.AfishaFilm;

public class AfishaManager {
    private int resultLength = 10;
    private AfishaFilm[] films = new AfishaFilm[0];

    public AfishaManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public AfishaManager() {
    }

    public void save(AfishaFilm film) {
        int length = films.length + 1;
        AfishaFilm[] tmp = new AfishaFilm[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public AfishaFilm[] findAll() {
        return films;
    }

    public AfishaFilm[] show() {
        int numberOfFilms;
        AfishaFilm[] films = findAll();
        if (films.length < resultLength) {
            numberOfFilms = films.length;
        } else {
            numberOfFilms = resultLength;
        }
        AfishaFilm[] result = new AfishaFilm[numberOfFilms];
        for (int i = 0; i < numberOfFilms; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

