package org.example;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String str1 = "Тимоти Шаламе";
        String str2 = "ТимотиШаламе";
        String str3 = " Тимоти Шаламе";
        String str4 = "Тимоти Шаламе ";
        String str5 = "Т имоти Шаламе";
        String str6 = "Т м";
        String str7 = "Тимоти Шаламе Стодвадцать пятый";

        Account account1 = new Account(str1);
        System.out.println(account1.checkNameToEmboss());
        Account account2 = new Account(str2);
        System.out.println(account2.checkNameToEmboss());
        Account account3 = new Account(str3);
        System.out.println(account3.checkNameToEmboss());
        Account account4 = new Account(str4);
        System.out.println(account4.checkNameToEmboss());
        Account account5 = new Account(str5);
        System.out.println(account5.checkNameToEmboss());
        Account account6 = new Account(str6);
        System.out.println(account6.checkNameToEmboss());
        Account account7 = new Account(str7);
        System.out.println(account7.checkNameToEmboss());
    }

}