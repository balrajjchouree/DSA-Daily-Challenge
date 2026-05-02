class Solution {
    public int maxDistance(int[] colors) 
    {
        int m=0;
        for(int i=0;i<colors.length;i++)
        {
            int mi=0;
            for(int j=colors.length-1;j>i;j--)
            {
                if(colors[i]!=colors[j])
                {  mi=(j-i);
                    m=Math.max(m,mi);
                    break;
                }
            }
        }
        return m;
    }
}