package com.example.helloworld;

import java.util.Random;
import java.util.Scanner;

public class gameChallengeAskNumber2 {
    public static void main(String[] args) {

        System.out.println("Welcome to guessing number game");
        System.out.println("Siapa nama anda?");

        Scanner scanner = new Scanner(System.in);

        String namaUser = scanner.next();
        System.out.println("Hallo " + namaUser);

        System.out.println("Ingin memulai game?");
        System.out.println("\tKlik 1 untuk memulai game");
        System.out.println("\tKlik 0 untuk keluar");

        int inputMulai = scanner.nextInt();

        if(inputMulai != 1){
            System.out.println("Keluar dari game... \nSampai jumpa");
        } else{
            Random random = new Random();

            System.out.println("Game dimulai!!!\n");
            System.out.println("Pilih angka dari 1 -20");
            int angkaRandom = random.nextInt(20) + 1;

            int counter = 1;

            while (counter <= 5){
                int angkaUser = scanner.nextInt();
                if (angkaRandom == angkaUser){
                    System.out.println("Selamat, tebakan anda benar!");
                    System.out.println("dengan percobaan sebanyak : " + counter);
                    break;
                } else if (angkaUser >= angkaRandom){
                    System.out.println("Tebak angka lebih rendah lagi!");
                    System.out.println("Percobaan ke : " + counter);
                    counter++;
                } else{
                    System.out.println("Tebak angka lebih tinggi lagi!");
                    System.out.println("Percobaan ke : " + counter);
                    counter++;
                }
            }
            while (counter > 5){
                System.out.println("\nGAME OVER!!!");
                System.out.println("Batas main hanya 5 kali");
                System.out.println("\nAngka yang benar: " + angkaRandom);
                break;
            }
        }
    }
}
