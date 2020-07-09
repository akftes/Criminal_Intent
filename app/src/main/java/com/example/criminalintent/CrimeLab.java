package com.example.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class CrimeLab {
    private  static  CrimeLab  sCrimeLab;
    private List<Crime> mCrimes;
    public static CrimeLab get(Context context){
        if(sCrimeLab==null){
            sCrimeLab = new CrimeLab(context);
        }
    return  sCrimeLab;
    }

    private  CrimeLab(Context context){
        mCrimes=new ArrayList<>();
        for(int i=1;i<=100;i++){
            Crime mcrime = new Crime();
            mcrime.setmTitle("Crime #" + i);
            mcrime.setmSolved(i%2==0);

        }

    }
}
