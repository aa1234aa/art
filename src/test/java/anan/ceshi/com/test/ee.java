package anan.ceshi.com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ee {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(Arrays.asList("a","b","c","d"));
        for (int i=0;i<4;i++){
            list.remove(i);
        }
        System.out.println(list.size());
    }
}
