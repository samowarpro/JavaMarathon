package day9.Task2;
//Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
// Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
//Вызовите эти два метода на массиве figures и выведите результат в консоль.

//* При сравнении строки с объектом из массива, на первом месте указывайте строку, пример “Red”.equals(figures[i].getColor())
//Записывая наоборот figures[i].getColor().equals(”Red”), есть вероятность получить NullPointerException в случае,
// когда у фигуры в поле color будет null.
//Проверить это утверждение можно создав какую-нибудь фигуру с цветом null.
// Пример new Triangle(10, 20, 30, null).

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }


    public static double calculateRedPerimeter(Figure[] figures){
        double sumPerimeter = 0;
        for(int i=0; i<figures.length;i++){
            if("Red".equals(figures[i].getColor()))
                sumPerimeter += figures[i].perimeter();

        }
        return sumPerimeter;
    }


    public static double calculateRedArea(Figure[] figures){
        double sumArea = 0;
        for(int i=0; i<figures.length;i++)
            if("Red".equals(figures[i].getColor())){
                sumArea += figures[i].area();

        }
        return sumArea;
    }

}

