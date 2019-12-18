package com.company;

import java.util.*;

public class Translator {
    // Singleton
    private static volatile Translator instance;
    private static int count = 0;
    private static String Name;

    public static Translator getInstance(){
        if(instance == null){		        //если объект еще не создан
            instance = new Translator();	//создать новый объект
            int c = instance.GetCount() + 1;
            instance.SetCount(c);
            instance.SetName(instance.getClass().getName());
        }
        return instance;		            // вернуть ранее созданный объект
    }

    public int GetCount(){
        return count;
    }

    public void SetCount(int c){
        count = c;
    }

    public String GetName(){
        return Name;
    }

    public void SetName(String n){
        Name = n+count;
    }

    private static SortedMap<String,String> dictionary;

    Translator(){
        dictionary = new TreeMap<String,String>();
    }

    public boolean IsInDictionary(String engword) {
        return dictionary.containsKey(engword); //note the removal of the if as it already returns a boolean
    }

    public void AddWord(String engword, String rusword){
        dictionary.put(engword,rusword);
    }

    public String GetTranslate(String engword){
        if(IsInDictionary(engword))
            return dictionary.get(engword);
        else
            return ("в словаре нет слова " + engword);
    }

    public String TranslateSentence(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] splittedStrings = sentence.trim().split("\\s+"); // the actual change

        for (String s : splittedStrings) {
            result.append((GetTranslate(s))+ " ");
        }
        return result.toString();
    }
}
