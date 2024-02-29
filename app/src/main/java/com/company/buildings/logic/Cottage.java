package com.company.buildings.logic;

/**
 * Класс Cottage - файл класса Cottage. Это подкласс класса House.
 */
public class Cottage extends House {

    private boolean mSecondFloor; // наличие второго этажа

    /**
     * Конструктор класса Cottage.
     * @param dimension размер здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     */
    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth); // вызов конструктора суперкласса House
        this.mSecondFloor = false; // установка значения поля mSecondFloor равным false
    }

    /**
     * Конструктор класса Cottage с указанием владельца и наличия второго этажа.
     * @param dimension размер здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     * @param owner владелец дома
     * @param secondFloor наличие второго этажа
     */
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner); // вызов конструктора суперкласса House
        this.mSecondFloor = secondFloor; // установка значения поля mSecondFloor в соответствии с переданным аргументом
    }

    /**
     * Метод для проверки наличия второго этажа.
     * @return true, если есть второй этаж, иначе false
     */
    public boolean hasSecondFloor() {
        return mSecondFloor; // возвращение значения поля mSecondFloor
    }

    @Override
    public String toString() {
        String result = super.toString(); // вызов метода toString() суперкласса House
        if (mSecondFloor) {
            result += ", has second floor"; // если есть второй этаж, добавление к строке ", has second floor"
        }
        return result; // возвращение строки
    }
}
