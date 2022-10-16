//Mohamed Kaba
package edu.citytech.finance.utility;

public class ConsoleUtility {
    private static String [] options;

    static {
        options= new String[]
                {"-i", "interest", "-y", "-years",
                        "-l", "-loanAmount", "-d", "-detail"};

    }
    public static boolean isValidOption(String o){
        for(var lineItem: options){
            if(lineItem.equals(o))
                return true;
        }
        return false;
    }
}
