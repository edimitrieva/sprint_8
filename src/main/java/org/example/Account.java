package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int length = name.length();
        int flag = 0;
        for(int i=0; i<length; i++){
            if (name.charAt(i) == ' ' ){
                if(flag==0) flag = 1;
                else return false;
            }
        }
        if(3 < length && length <19 && !name.startsWith(" ") && !name.endsWith(" ") && flag==1){
            return true;
        }else
            return false;
    }

}
