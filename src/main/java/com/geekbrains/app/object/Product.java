package com.geekbrains.app.object;

public class Product {
    /*1. Установить сервер приложений TomCat или Wildfly (либо любой другой по выбору);
2. Создать и запустить новый проект по инструкции из данной методички;
3. Создайте класс Product с полями (id, title, cost);
4. Реализуйте сервлет выводящий на страницу список из 10 продуктов (создаете продукты в момент обработки запроса).
     */

    private String id;
    private String title;
    private String cost;

    public Product(String id, String title, String cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
