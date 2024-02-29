package com.company.buildings.logic;

/**
 * Класс Office - файл класса Office. Он является подклассом класса Building.
 */
public class Office extends Building {

    private static int sTotalOffices = 0; // общее количество офисов
    private String mBusinessName; // название бизнеса
    private int mParkingSpaces; // количество парковочных мест

    /**
     * Конструктор класса Office.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     */
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth); // вызов конструктора суперкласса Building
        this.mBusinessName = null; // установка значения поля mBusinessName равным null
        this.mParkingSpaces = 0; // установка значения поля mParkingSpaces равным 0
        sTotalOffices++; // увеличение значения поля sTotalOffices на 1
    }

    /**
     * Конструктор класса Office с указанием названия бизнеса.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     * @param businessName название бизнеса
     */
    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        super(length, width, lotLength, lotWidth); // вызов конструктора суперкласса Building
        this.mBusinessName = businessName; // установка значения поля mBusinessName равным переданному значению businessName
        this.mParkingSpaces = 0; // установка значения поля mParkingSpaces равным 0
        sTotalOffices++; // увеличение значения поля sTotalOffices на 1
    }

    /**
     * Конструктор класса Office с указанием названия бизнеса и количества парковочных мест.
     * @param length длина здания
     * @param width ширина здания
     * @param lotLength длина участка
     * @param lotWidth ширина участка
     * @param businessName название бизнеса
     * @param parkingSpaces количество парковочных мест
     */
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        super(length, width, lotLength, lotWidth); // вызов конструктора суперкласса Building
        this.mBusinessName = businessName; // установка значения поля mBusinessName равным переданному значению businessName
        this.mParkingSpaces = parkingSpaces; // установка значения поля mParkingSpaces равным переданному значению parkingSpaces
        sTotalOffices++; // увеличение значения поля sTotalOffices на 1
    }

    /**
     * Метод для получения значения поля mBusinessName.
     * @return название бизнеса
     */
    public String getBusinessName() {
        return mBusinessName; // возвращение значения поля mBusinessName
    }

    /**
     * Метод для получения значения поля mParkingSpaces.
     * @return количество парковочных мест
     */
    public int getParkingSpaces() {
        return mParkingSpaces; // возвращение значения поля mParkingSpaces
    }

    /**
     * Метод для установки значения поля mBusinessName.
     * @param businessName название бизнеса
     */
    public void setBusinessName(String businessName) {
        this.mBusinessName = businessName; // установка значения поля mBusinessName равным переданному значению businessName
    }

    /**
     * Метод для установки значения поля mParkingSpaces.
     * @param parkingSpaces количество парковочных мест
     */
    public void setParkingSpaces(int parkingSpaces) {

        this.mParkingSpaces = parkingSpaces; // установка значения поля mParkingSpaces равным переданному значению parkingSpaces
    }

    @Override
    public String toString() {
        if (mBusinessName == null) {
            return "Business: unoccupied (total offices: " + sTotalOffices + ")"; // возвращение строки "Business: unoccupied (total offices: [количество офисов])", если значение поля mBusinessName равно null
        } else {
            return "Business: " + mBusinessName + " (total offices: " + sTotalOffices + ")"; // возвращение строки "Business: [название бизнеса] (total offices: [количество офисов])", если значение поля mBusinessName не равно null
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // возвращение true, если объекты ссылаются на одну и ту же область памяти
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // возвращение false, если переданный объект равен null или классы объектов отличаются
        }
        Office office = (Office) obj; // приведение объекта к типу Office
        return calcBuildingArea() == office.calcBuildingArea() && mParkingSpaces == office.mParkingSpaces; // сравнение значений полей calcBuildingAreas() и состояния парковки (mParkingSpaces) сравниваемых объектов
    }
}
