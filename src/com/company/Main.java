package com.company;

public class Main {

    public static void main(String[] args) {

    String[] names = new String[4];
    names[0] = "Erjan";
    names[1] = "Aziret";
    names[2] = "Amantur";
    names[3] = "User";
        for (int i = 0; i < 4; i++) {

            switch (names[i]){
                case "Erjan":
                    System.out.println("Доброе утро " + names[0]);
                    break;
                case "Aziret":
                    System.out.println("Добрый день " + names[1]);
                    break;
                case "Amantur":
                    System.out.println("Добрый вечер " + names[2]);
                    break;
                case "User":
                    System.out.println("Привет " + names[3]);
                    break;
                default:
                    System.out.println("Ups....Welcome...");
                    break;

            }
        }




    }
}
