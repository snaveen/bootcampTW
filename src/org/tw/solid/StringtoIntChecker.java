package org.tw.solid;


public class StringtoIntChecker {
    public static void main(String... args){
        StringtoIntChecker checker=new StringtoIntChecker();
        System.out.println("Expected:true Actual:"+checker.isIntegerRegexBased("123"));
        System.out.println("Expected:false Actual:"+checker.isIntegerRegexBased("A123"));
        System.out.println("Expected:true Actual:"+checker.isIntegerRegexBased("0123"));
    }

    public boolean isInteger(String s){
        try {
            Integer.parseInt(s);
        }catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public boolean isIntegerRegexBased(String s) {
        String regex = "[0-9]+";
        return s.matches(regex);
    }

}
