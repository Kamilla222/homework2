package com.lesson.l9.pattern;

import lombok.Data;

@Data
public class MySingleton {
    private static Database database;

    public static class Database {
        private Database() {}
        public Connection connection() {
            return new Connection();
        }
    }

    static class Connection{}

    private MySingleton() {}

    public static Connection getConnection() {
        if(database==null) {
            database = new Database();
            System.out.println("БД Проиницилизорованна");
        }
        return database.connection();
    }
    public static Database getDataBase() {
        if(database==null) {
            database = new Database();
            System.out.println("БД Проиницилизорованна");
        }
        return database;
    }

    public static void main(String[] args) {
        System.out.println(MySingleton.getDataBase());
        System.out.println();
        System.out.println(MySingleton.getDataBase());


    }
}
