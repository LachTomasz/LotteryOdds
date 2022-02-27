package LotteryOdds;

import java.util.*;
/**
 * Ten program demonstruje zastosowanie pętli <code>for</code>.
 * This program demonstrates the use of loops <code>for</code>.
 *
 * @author Tomek
 *
 */
public class LotteryOdds
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Ile liczb ma być wylosowanych? ");
        int k = in.nextInt();

        System.out.print("Jaka jest górna granica przedziału losowanych liczb? ");
        int n = in.nextInt();

        /*
         * Obliczanie współczynnika dwumianowego n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         * Calculation of the binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for(int i = 1; i<=k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzenia!");

    }

}
