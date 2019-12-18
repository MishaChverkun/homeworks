package com.company;

import org.junit.Test;

public class TestTranslator {
    @Test
    public void testClass() throws Exception {
        Translator t = new Translator();
    }

    @Test
    public void testSingle() throws Exception{
        Translator t2 = Translator.getInstance();
        System.out.println(t2.GetCount());
        System.out.println(t2.GetName());
        Translator t3 = Translator.getInstance();
        System.out.println(t3.GetCount());
        System.out.println(t3.GetName());
        System.out.println(t3.getClass().getName());
        System.out.println(
                (t2.getInstance()==t3.getInstance())
                        ? "Один и тот же класс"
                        : "Два разных класса");
    }
}
