package com.company.buildings.logic;

/**
 * Класс House - файл класса House, расширяющий класс Building.
 */
public class House extends Building {

    private String mOwner; // владелец дома
    private boolean mPool; // наличие бассейна

    /**
     * Конструктор класса House.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     */
    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }

    /**
     * Конструктор класса House с установкой владельца.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     * @param owner владелец дома
     */
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }

    /**
     * Конструктор класса House с установкой владельца и наличия бассейна.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     * @param owner владелец дома
     * @param pool наличие бассейна
     */
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    /**
     * Метод для получения значения поля mOwner.
     * @return владелец дома
     */
    public String getOwner() {
        return mOwner;
    }

    /**
     * Метод для проверки наличия бассейна.
     * @return true, если есть бассейн, иначе false
     */
    public boolean hasPool() {
        return mPool;
    }

    /**
     * Метод для установки значения поля mOwner.
     * @param owner владелец дома
     */
    public void setOwner(String owner) {
        this.mOwner = owner;
    }

    /**
     * Метод для установки значения поля mPool.
     * @param pool наличие бассейна
     */
    public void setPool(boolean pool) {
        this.mPool = pool;
    }

    @Override
    public String toString() {
        String result = "Owner: " + mOwner;
        if (calcBuildingArea() < calcLotArea()) {
            result += "; has a big open space";
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        House house = (House) obj;
        return calcBuildingArea() == house.calcBuildingArea() &&
                mPool == house.mPool;
    }
}
