class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> lst=new ArrayList<Integer>();

        if(rowIndex==0){
            lst.add(1);
            return lst;
        }
        if(rowIndex==1){
            lst.add(1);
            lst.add(1);
            return lst;
        }
        int[][] triangle = new int[rowIndex+1][rowIndex+1]; //creating 2d array to store elements
        triangle[0][0]=1;
        triangle[1][0]=1;
        triangle[1][1]=1;
        for(int i=2;i<=rowIndex;i++){
            triangle[i][0]=1;
            triangle[i][i]=1;
            for(int j=1;j<i;j++){
                triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
            }
        }

        //adding elements of given row to list
        for(int i=0;i<triangle[rowIndex].length;i++){
            if(triangle[rowIndex][i]!=0){
                lst.add(triangle[rowIndex][i]);
            }
        }
        return lst;
    }
}

        // for(int i=0;i<rowIndex;i++)
        // {
            
        //     ll.add(i,val);
        // }
//         return lst;
//     }
// }