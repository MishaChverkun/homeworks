package com.company;

public class Main {

    public static void main(String[] args) {
	    Translator t = new Translator();
	    t.AddWord("apple", "яблоко");
	    t.AddWord("fell", "упало");
	    System.out.println(t.GetTranslate("sho"));
	    System.out.println(t.GetTranslate("apple"));
        System.out.println(t.TranslateSentence("apple fell"));
        //DONE create singleton mb
        Translator t2 = new Translator();
        t2.GetTranslate("wefwj");
    }
}
