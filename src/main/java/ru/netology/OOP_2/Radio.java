package ru.netology.OOP_2;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public Radio() {
        currentStation = 0; // Начальная станция
        currentVolume = 50; // Начальная громкость
    }git

    // Геттеры для получения текущих значений
    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Метод для переключения на следующую станцию
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Метод для переключения на предыдущую станцию
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // Метод для установки конкретной станции
    public void setCurrentStation(int station) {
        if (station < 0 || station > 9) {
            return; // Не изменяем станцию, если номер недопустим
        }
        currentStation = station;
    }

    // Методы для управления громкостью
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        } else if (volume < 0) {
            currentVolume = 0; // Принудительно сбросить на минимум
        } else {
            currentVolume = 100; // Принудительно установить максимум
        }
    }
}
