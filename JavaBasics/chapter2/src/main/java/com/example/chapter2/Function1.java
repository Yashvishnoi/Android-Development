package com.example.chapter2;

public class Function1 {
    public static double average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        double average=(a+b+c)/3.0;
        System.out.println(average);
        classEx CE =new classEx();
        CE.method();
        ClassEx2 CE2 = new ClassEx2();
        CE2.method();

        CE2.method2();

    }
}
