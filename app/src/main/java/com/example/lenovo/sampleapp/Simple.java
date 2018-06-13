package com.example.lenovo.sampleapp;

import android.provider.Settings;

import java.util.ArrayList;

public class Simple {

    private int Id;
    private String mName, mEmail, mCompany;

    public Simple(int Id, String mName, String mEmail, String mCompany) {

        System.out.println("Constractor==>>>>");
        this.Id = Id;
        this.mName = mName;
        this.mEmail = mEmail;
        this.mCompany = mCompany;

    }

    public static void main(String args[]) {

        System.out.println(" MAinMethod==>>>>");
        ArrayList<Simple> arrayList = new ArrayList<>();

        Simple simple1 = new Simple(1, "Suresh1", "suresh.123@mail.com", "Infosys1");
        Simple simple2 = new Simple(2, "Suresh2", "suresh.1234@mail.com", "Infosys2");
        Simple simple3 = new Simple(3, "Suresh3", "suresh.1235@mail.com", "Infosys3");
        arrayList.add(simple1);
        arrayList.add(simple2);
        arrayList.add(simple3);

        for (Simple books : arrayList) {

            System.out.println("SIMPLE_CALSS" + books);
        }
    }

}
