import java.util.Stack;

class Solution {
    public String predictPartyVictory(String senate) {
        int cr = 0, cd = 0, i;
        char[] arr = senate.toCharArray();
        for (i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R')
                cr++;
            else
                cd++;
        }
        // if(cr==cd)
        // {
        // return senate.charAt(0)=='R'?"Radiant":"Dire";
        // }
        // else if(cr>cd)
        // return "Radiant";

        // return "Dire";

        Stack<Character> st = new Stack<>();
        i = 0;
        while (true) {
            if (arr[i] == '#') {
                i++;
                i %= arr.length;
                continue;
            }
            if (st.isEmpty())
                st.push(arr[i]);
            else if (arr[i] == st.peek())
                st.push(arr[i]);
            else {
                if (arr[i] == 'D')
                    cd--;
                else
                    cr--;
                arr[i] = '#';
                st.pop();
            }
            if (cd == 0 || cr == 0)
                break;
            i++;
            i %= arr.length;
        }
        return cd == 0 ? "Radiant" : "Dire";
        // st.push();
        // for(char ch: senate.toCharArray())
        // {
        // if(st.peek()==ch)
        // st.push(ch);
        // }

        // Queue<Integer> r=new LinkedList<>();
        // Queue<Integer> d=new LinkedList<>();

        // for(int i=0;i<senate.length();i++)
        // {
        // if(senate.charAt(i)=='R')
        // r.offer(i);
        // else
        // d.offer(i);
        // }

        // while(!r.isEmpty() && !d.isEmpty())
        // {
        // int rad=r.poll();
        // int dire=d.poll();
        // if(rad<dire)
        // r.offer(rad+senate.length());
        // else
        // d.offer(dire+senate.length());
        // }
        // return r.isEmpty()?"Dire":"Radiant";
    }
}