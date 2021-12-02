package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AcessElementsFromArrayList {
    public static void main(String[] args){
        List<String> topCom = new ArrayList<>();
        System.out.println("is top companies list empty ? :" +topCom.isEmpty() );
        topCom.add("Google");
        topCom.add("Apple");
        topCom.add("Amazon");
        topCom.add("Facebook");
        System.out.println("Here are top " +topCom.size()+"companies in the world");
        System.out.println(topCom);

        String bestCom = topCom.get(0);
        String secondBestCom = topCom.get(1);
        String lastCom = topCom.get(topCom.size() - 1);
        System.out.println("Best Com :" +bestCom);
        System.out.println("Second best Com :" +secondBestCom);
        System.out.println("Last Com :" +lastCom);

        topCom.set(3,"Microsoft");
        System.out.println("Modified top Com :"+topCom);

    }
}
