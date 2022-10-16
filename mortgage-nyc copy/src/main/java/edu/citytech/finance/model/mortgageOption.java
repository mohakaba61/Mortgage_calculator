package edu.citytech.finance.model;

public enum mortgageOption {
    I("-i"),        INTEREST("-interest"),
    Y("-y"),        YEARS("-years"),
    L("-l"),    LOAN_AMOUNT("-loanAmount"),
    D("-d"),            DETAIL("-detail"),
    ;

    public final String text;

    mortgageOption(String text) {
        this.text=text;
    }
public static boolean isValidOption(final String options){
        mortgageOption[] mo= mortgageOption.values();

        for(var co:mo){
            if(co.text.equals(options)){
                return true;
            }
        }
        return false;
}
    @Override
    public String toString() {
        return "mortgageOption{" +
                "text='" + text + '\'' +
                '}';
    }
}
