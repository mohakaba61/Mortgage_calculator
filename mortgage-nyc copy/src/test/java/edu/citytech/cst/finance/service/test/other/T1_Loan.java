//Mohamed Kaba
package edu.citytech.cst.finance.service.test.other;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import edu.citytech.finance.model.MortgageService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class T1_Loan
{
    @ParameterizedTest
    @CsvSource({
            "300_000,30,.06 ,1799.00",
            "400_000,30,.06 ,2398.20",
            "500_000,30,.06 ,2997.75",
    })
    void testWithCsvSource(float loanAmount, int years , float interest, float monthlyPayment) {
        double actual = MortgageService.getSchedulePayments(loanAmount, years, interest);
        float expected = monthlyPayment;
        assertThat(actual, closeTo(expected, 1f));
    }
}

