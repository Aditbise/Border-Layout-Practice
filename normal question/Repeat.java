class Repeat
{
    int cap;
    int St[]=new int[0];
    int f,r;
   
    Repeat(int m)
    {
        cap=m;
        f=0;
        r=0;
    }
    
    void pushValue(int v)
    {
        if(r==cap-1)
            System.out.println("OVERFLOW");  
        else 
            St[r++]=v;
    }
    
    int popValue()
    {
        if(f==0)
            return(-9999);
        else
            return(St[f++]);
    }
    
    void disp()
    {
        int i=f;
        while(i<r)
            System.out.println(St[i++]);
    }
}
