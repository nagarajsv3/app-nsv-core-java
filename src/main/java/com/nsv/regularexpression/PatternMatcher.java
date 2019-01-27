package com.nsv.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        String phNo="302-302-31251";
        Pattern phpattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher phmatcher = phpattern.matcher(phNo);
        if(phmatcher.find()){
            System.out.println("Ph No Match Found");
        }else{System.out.println("Ph No Match Not Found");}


        String ssn = "103-10-9512";
        Pattern ssnpattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher ssnmatcher= ssnpattern.matcher(ssn);
        if(ssnmatcher.find()){
            System.out.println("ssn match found");
        }else{
            System.out.println("ssn match not found");
        }

    }
}
