import java.util.Objects;

// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в
// java.
// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// поля:
// 1. Фирма - firm
// 2. Модель - model
// 3. Цвет - color
// 4. Цена - price

// методы:
// 1. геттеры - получаем значения для полей (Фирма, Модель, Цвет, Цена)
// 2. сеттеры - устанавливаем значения для всех полей
// 3. filter - фильтруем по заданому критерию запроса (filterFirm, filterModel, filterColor, filterPrice)


public class Notebook {
private String firm;
private String model;
private String color;
private int price;

public Notebook(String firm, String model, String color, int price){
    this.firm = firm;
    this.model = model;
    this.color = color;
    this.price = price;
}

public void getFirm(String firm){
    this.firm = firm;
}

public void getModel(String model){
    this.model = model;
}

public void getColor(String color){
    this.color = color;
}

public void getPrice(int price){
    this.price = price;
}


@Override
public int hashCode() {
    return Objects.hash(firm, model, color, price);
}

@Override
public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    Notebook note = (Notebook) obj;
    return firm.equals(note.firm) && model.equals(note.model)  && color.equals(note.color) && price == note.price;
}

@Override
public String toString() {
    
    return "Фирма, " + firm + ", " + "Модель, " + model + ", " + "Цвет, " + color + ", " + "Цена, " + price;
}
    
}