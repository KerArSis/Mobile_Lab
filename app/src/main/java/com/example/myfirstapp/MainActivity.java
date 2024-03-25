package com.example.myfirstapp;

// Импортируемые классы из пакетов android
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
    // Объявление переменных для элементов пользовательского интерфейса
    TextView tvInfo; // Поле для отображения информации
    EditText etInput; // Поле для ввода текста
    Button bControl, btnEnd; // Кнопки для управления игрой и завершения приложения

    int guess; // Переменная для загаданного числа
    boolean gameFinished; // Флаг, определяющий, завершена ли игра

    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main); // Устанавливаем макет activity_main для данной активности

        // Привязываем элементы пользовательского интерфейса к объявленным переменным
        tvInfo = findViewById(R.id.textView);
        etInput = findViewById(R.id.editText3);
        bControl = findViewById(R.id.button);
        btnEnd = findViewById(R.id.button_end);

        guess = (int)(Math.random()*100); // Генерируем случайное число для игры
        gameFinished = false; // Игра еще не завершена

        // Устанавливаем слушатель для кнопки завершения приложения
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {finish();} // Закрытие приложения
        });
    }

    // Метод, вызываемый при нажатии на кнопку bControl
    public void onClick(View v) {
        if (!gameFinished) {
            String inputText = etInput.getText().toString().trim(); // Получаем введенный текст из EditText и удаляем начальные и конечные пробелы

            if (!inputText.isEmpty()) { // Проверяем, что введенный текст не пустой
                try {
                    int inp = Integer.parseInt(inputText); // Преобразуем введенный текст в целое число

                    if (inp > 0 && inp <= 100) { // Проверяем, что введенное число находится в диапазоне от 1 до 100
                        if (inp > guess) // Введенное число больше загаданного
                            tvInfo.setText(getResources().getString(R.string.ahead));
                        else if (inp < guess) // Введенное число меньше загаданного
                            tvInfo.setText(getResources().getString(R.string.behind));
                        else { // Угадано загаданное число
                            tvInfo.setText(getResources().getString(R.string.hit));
                            bControl.setText(getResources().getString(R.string.play_more));
                            gameFinished = true; // Установка флага, что игра завершена
                        }
                    } else {
                        tvInfo.setText(getResources().getString(R.string.try_to_guess)); // Введенное число не находится в диапазоне от 1 до 100
                        Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) { // Ошибка преобразования введенного текста в число
                    tvInfo.setText(getResources().getString(R.string.try_to_guess));
                    Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();
                }
            } else { // Введенный текст пустой
                Toast.makeText(this, getResources().getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        } else { // Игра уже завершена
            guess = (int) (Math.random() * 100); // Генерируем новое число для игры
            bControl.setText(getResources().getString(R.string.input_value));
            tvInfo.setText(getResources().getString(R.string.try_to_guess));
            gameFinished = false; // Установка флага, что игра не завершена
        }

        etInput.setText(""); // Очистка поля ввода
    }
}