package com.company;

public class Main {

    public static void main(String[] args) {
//        String ss="abc中国";
//        System.out.println(ss.charAt(0)+ss.charAt(1));
        String arg1="E:\\1234.txt";
        String arg2="E:\\123.txt";
        ItemList s=new ItemList(arg1);
        Pos p=new Pos(arg2);
        ReadList rd=new ReadList(p,s);
        rd.Display();

    }
}
