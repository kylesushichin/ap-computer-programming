public class Merge
{
    static int a,b,c,d,e;
    public static void main(String args[])
    {
        int[] List = {98, 23, 22, 14, 6, 67, 33, 42};
        
        Merge.thing(List);
        
        for(int i = 0; i < a; i++)
        {
            System.out.print(List[i] + " ");
        }
        
    }
    
    
    public static int[] thing(int[] List)
    {
        a = List.length;
        b = a/2;
        c = b/2;
        
        int[] Half1 = new int[b];
        int[] Half2 = new int[List.length - (List.length/2];
        
        for(int i = 0; i < Half1.length; i++)
        {
            for(int j = 0; j < (Half1.length)/2; j++)
            {
                if(List[j] > List[j+1])
                {
                    e = List[j];
                    List[j] = List[j+1];
                    List[j+1] = e;
                }
            }
            for(int x = (Half1.length)/2; x < Half1.length; x++)
            {
                if(List[x] > List[x+1])
                {
                    e = List[x];
                    List[x] = List[x+1];
                    List[x+1] = e;
                }
            }
        }
        for(int y = 0; y < Half2.length; y++)
        {
            for(int v = 0; v < (Half2.length)/2; v++)
            {
                if(List[v] > List[v+1])
                {
                    e = List[v];
                    List[v] = List[v+1];
                    List[v+1] = e;
                }
            }
            for(int z = (Half2.length)/2; z < Half2.length; z++)
            {
                if(List[z] > List[z+1])
                {
                    e = List[z];
                    List[z] = List[z+1];
                    List[z+1] = e;
                }
            }
        }
    return List;
    }
}