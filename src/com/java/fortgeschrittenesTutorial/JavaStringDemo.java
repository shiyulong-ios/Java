package com.java.fortgeschrittenesTutorial;

public class JavaStringDemo {
    public static void main(String[] args) {
        m4();
        String str="this is Java";
        System.out.println(removeCharAt(str,3));
    }
    public static String removeCharAt(String s,int pos){
        return s.substring(0,pos)+s.substring(pos+1);
    }
    public static void m4(){
        String s="Hello world ,Hello Runoob";
        int l=s.lastIndexOf("Runoob");
        if (l==-1){
            System.out.println("没有找到字符串 Runoob");
        }else {
            System.out.println("Runoob 字符串最后出现的位置： "+l);
        }
    }
}
