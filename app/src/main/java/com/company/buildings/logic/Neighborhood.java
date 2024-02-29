package com.company.buildings.logic;

import com.company.buildings.ui.OutputInterface;

/**
 * Класс Neighborhood - утилитарный класс, предоставляющий статические вспомогательные методы для печати списка зданий и расчета их общей площади.
 * Примечание: утилитарные классы в Java должны быть финальными и иметь приватный конструктор,
 * см. https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    private Neighborhood() {
        // private constructor to prevent instantiation
    }

    /**
     * Статический метод для печати списка зданий.
     * @param buildings массив зданий
     * @param header заголовок
     * @param out интерфейс вывода
     */
    public static void print(Building[] buildings, String header, OutputInterface out) {
        out.print(header);
        for (Building building : buildings) {
            out.print(building.toString());
        }
        out.print("");
    }

    /**
     * Статический метод для расчета общей площади зданий.
     * @param buildings массив зданий
     * @return общая площадь всех зданий
     */
    public static int calcArea(Building[] buildings) {
        int totalArea = 0;
        for (Building building : buildings) {
            totalArea += building.calcBuildingArea();
        }
        return totalArea;
    }
}
