package com.company.buildings.logic;

/**
 * Класс Building представляет здание и содержит информацию о его размерах и размерах участка.
 */
public class Building {

    private int mLength; // длина здания
    private int mWidth; // ширина здания
    private int mLotLength; // длина участка
    private int mLotWidth; // ширина участка

    /**
     * Конструктор класса Building.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     */
    public Building(int length, int width, int lotLength, int lotWidth) {
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    /**
     * Метод для получения значения поля mLength.
     * @return длина здания
     */
    public int getLength() {
        return mLength;
    }

    /**
     * Метод для получения значения поля mWidth.
     * @return ширина здания
     */
    public int getWidth() {
        return mWidth;
    }

    /**
     * Метод для получения значения поля mLotLength.
     * @return длина участка
     */
    public int getLotLength() {
        return mLotLength;
    }

    /**
     * Метод для получения значения поля mLotWidth.
     * @return ширина участка
     */
    public int getLotWidth() {
        return mLotWidth;
    }

    /**
     * Метод для установки значения поля mLength.
     * @param length длина здания
     */
    public void setLength(int length) {
        this.mLength = length;
    }

    /**
     * Метод для установки значения поля mWidth.
     * @param width ширина здания
     */
    public void setWidth(int width) {
        this.mWidth = width;
    }

    /**
     * Метод для установки значения поля mLotLength.
     * @param lotLength длина участка
     */
    public void setLotLength(int lotLength) {
        this.mLotLength = lotLength;
    }

    /**
     * Метод для установки значения поля mLotWidth.
     * @param lotWidth ширина участка
     */
    public void setLotWidth(int lotWidth) {
        this.mLotWidth = lotWidth;
    }

    /**
     * Метод для расчета площади здания.
     * @return площадь здания
     */
    public int calcBuildingArea() {
        return mLength * mWidth;
    }

    /**
     * Метод для расчета площади участка.
     * @return площадь участка
     */
    public int calcLotArea() {
        return mLotLength * mLotWidth;
    }

    @Override
    public String toString() {
        return "Building{" +
                "length=" + mLength +
                ", width=" + mWidth +
                ", lotLength=" + mLotLength +
                ", lotWidth=" + mLotWidth +
                '}';
    }
}
