package com.datatypes.idea.less16.baselvl;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Listik1 extends Listik
{
    @Override
    public String[] zapolnenie()    {
        String[] spy = zapolnenie();
        System.out.println(Arrays.toString(spy));
        return spy;
    }

    @Override
    public String[] zapolnenie1() {
        return new String[0];
    }


    public static Set<String> Sett1 (){
        Listik1 k = new Listik1();
        return Arrays.stream(k.zapolnenie1()).collect(Collectors.toSet());
    }

    public static void main(String[] args)
    {
        System.out.println(Sett1());
    }

}
