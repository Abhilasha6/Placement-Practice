/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

/*the logic behind this question is that, we have to keep on guessing the number upto a range 'n' by taking feedback
 from guess function whether our number is > or = or < the desired number, until we get the desired number

*/

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1, high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(guess(mid)==0)
            return mid;
            else if(guess(mid)==-1)
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
}