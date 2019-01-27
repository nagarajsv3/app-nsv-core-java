package com.nsv.regularexpression;

public class StringMatches {

    public static void main(String[] args) {
        System.out.println(validatePhoneNo("302-302-1243"));
        System.out.println(validateSSN("302-02-1243"));
        System.out.println(validatezip("08859"));
        System.out.println(checkStringFirstChar("1abc"));
        System.out.println(checkStringFirstChar("abc"));
        System.out.println(checkTrueOccurence("construe"));
        System.out.println(checkTrueOccurence("construction"));
        System.out.println(checkthreechars("abc"));
        System.out.println(checkthreechars("abcd"));
    }

    private static boolean validatePhoneNo(String phoneno) {
        return phoneno.matches("\\d{3}-\\d{3}-\\d{4}");
    }

    private static boolean validateSSN(String ssn) {
        return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    }

    private static boolean validatezip(String zip) {
        return zip.matches("\\d{5}");
    }

    private static boolean checkStringFirstChar(String str) {
        return str.matches("[\\D].*");
    }

    private static boolean checkTrueOccurence(String str) {
        return str.matches(".*true.*");
    }

    private static boolean checkthreechars(String str) {
        return str.matches("[a-zA-Z]{3}");
    }
}
