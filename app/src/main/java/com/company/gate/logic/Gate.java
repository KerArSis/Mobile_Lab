package com.company.gate.logic;

public class Gate {
    public static final int IN = 1; // Константа для направления ворот внутрь
    public static final int OUT = -1; // Константа для направления ворот наружу
    public static final int CLOSED = 0; // Константа для закрытых ворот

    private int mSwing; // Переменная для хранения текущего направления поворота ворот

    /**
     * Метод устанавливает направление поворота ворот.
     * @param direction Направление поворота (IN, OUT или CLOSED)
     * @return true, если направление установлено успешно, false в противном случае
     */
    public boolean setSwing(int direction) {
        if (direction == IN || direction == OUT || direction == CLOSED) {
            mSwing = direction;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод открывает ворота в указанном направлении.
     * @param direction Направление поворота (IN или OUT)
     * @return true, если ворота успешно открыты, false в противном случае
     */
    public boolean open(int direction) {
        if (direction == IN || direction == OUT) {
            return setSwing(direction);
        } else {
            return false;
        }
    }

    /**
     * Метод закрывает ворота.
     */
    public void close() {
        setSwing(CLOSED);
    }

    /**
     * Метод возвращает текущее направление поворота ворот.
     * @return Направление поворота (IN, OUT или CLOSED)
     */
    public int getSwingDirection() {
        return mSwing;
    }

    /**
     * Метод определяет, сколько улиток может пройти через ворота.
     * @param count Количество улиток
     * @return Количество улиток, может быть отрицательным или нулем
     */
    public int thru(int count) {
        if (mSwing == IN) { // Если ворота открыты внутрь, улитки проходят в загон
            return count;
        } else if (mSwing == OUT) { // Если ворота открыты наружу, улитки выходят из загона
            return -count;
        } else { // Если ворота закрыты, улитки не могут пройти
            return 0;
        }
    }

    /**
     * Переопределение метода toString() для получения строкового представления ворот.
     * @return Строковое представление ворот
     */
    @Override
    public String toString() {
        String swingDirection;
        if (mSwing == CLOSED) {
            swingDirection = "This gate is closed";
        } else if (mSwing == IN) {
            swingDirection = "This gate is open and swings to enter the pen only";
        } else if (mSwing == OUT) {
            swingDirection = "This gate is open and swings to exit the pen only";
        } else {
            swingDirection = "This gate has an invalid swing direction";
        }
        return swingDirection;
    }
}



