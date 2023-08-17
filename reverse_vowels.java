class Solution {
    public String reverseVowels(String s) {
        char ch; int i=s.length()-1;
        char[] arr = s.toCharArray();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'||arr[j]=='A'||arr[j]=='E'||arr[j]=='I'||arr[j]=='O'||arr[j]=='U')
            {
                for(;i>j;i--){
                    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                        ch=arr[j];
                        arr[j]=arr[i];
                        arr[i]=ch;
                        i--;
                        break;
                            }
                        }
                    }
        }
        
        return new String(arr);
    }
}