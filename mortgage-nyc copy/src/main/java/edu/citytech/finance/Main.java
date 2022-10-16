package edu.citytech.finance;

import static edu.citytech.finance.model.mortgageOption.*;

import java.util.Date;

public class Main {
    public static void main(String [] args){

       for(int i=0;i<args.length;i++){
           if(!isValidOption(args[i])){
               System.out.println("invalid option entered");
           }

           var mode= args[i];
           var value="";
           if(mode.equals(I.text) || mode.equals(INTEREST.text)){
               value=args[++i];
            System.out.println("INTEREST was detected!! value: " +value);
           }
           if(mode.equals(Y.text) || mode.equals(YEARS.text)){
               value=args[++i];
               System.out.println("YEARS was detected!! value: " +value);
           }
           if(mode.equals(L.text) || mode.equals(LOAN_AMOUNT.text)){
               value=args[++i];
               System.out.println("LOAN_AMOUNT was detected!! value: " +value);
           }
           if(mode.equals(D.text) || mode.equals(DETAIL.text)){
               value=args[++i];
               System.out.println("DETAIL was detected!! value: " );
           }
       }
    }
}
