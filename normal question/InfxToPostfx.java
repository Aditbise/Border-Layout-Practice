import java.util.*;
class InfxToPostfx
{
    char stack[]=new char[10];
    int sp;
    InfxToPostfx()
    {
        sp=-1;
    }
    void convert(char st[])
    {
        int i,j=0;
        char exp[]=new char[20];
        char cH1,cH2;
        for(i=0;i<st.length;i++)
        {
            cH1=st[i];
            if(check1(cH1))
                exp[j++]=cH1;
            else
            {
                while(sp!=-1 && valChar(cH1)<=valChar(stack[sp]) &&(cH1!='('))
                {
                    cH2=pop();
                    if(cH2=='(')
                    break;
                    if(cH1!='(')
                    exp[j++]=cH2;
                }
                if(cH1!=')')
                push(cH1);
            }
        }
        while(sp!=-1)
        exp[j++]=pop();
        for(i=0;i<j;i++)
        {
            if((exp[i]!='(') &&(exp[i]!=')'))
             System.out.print(exp[i]);
            }
     }
    boolean check1(char p)
    {
            return((p>='0' && p<='9')||(p>='a' && p<='z') ||(p>='A' && p<='Z'));
    }
    int valChar(char t)
    {
        switch(t)
        {
            case ')':
            case '(': return 0;
            
            case '+':
            case '-': return 1;
            
            case '*':
            case '/': return 2;
            
            case '$': return 3;
             
            default :System.out.println("invalid");
                     System.exit(1);
                     return 0;
        }
    }
    void push(char x)
    {
        sp++;
        stack[sp]=x;
    }
    char pop()
    {
        return(stack[sp--]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        InfxToPostfx ob=new InfxToPostfx();
        System.out.println("\nenter the expression in infix form");
        String str=sc.next();
        char ch4[]=str.toCharArray();
        System.out.println("post fix form of:\t"+str+"\tis :");
        ob.convert(ch4);
        sc.close();
    }
}


