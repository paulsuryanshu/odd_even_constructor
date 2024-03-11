import java.io.*;
class oddeven{
    int a[],m;
    oddeven(int mm)
    {
        m = mm;
        a = new int[m];
    }
    void fillarray()throws Exception
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        for(int i=0;i<m;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }
    }
    oddeven arrange(oddeven p,oddeven q)
    {
        int k = 0;
        oddeven ob = new oddeven(p.m + q.m);
        for(int i=0;i<p.m;i++)
        {
            if(p.a[i]%2 == 1)
            {
                ob.a[k++] = p.a[i];
            }
        }
        for(int i=0;i<q.m;i++)
        {
            if(q.a[i]%2 == 1)
            {
                ob.a[k++] = q.a[i];
            }
        }
        for(int i=0;i<p.m;i++)
        {
            if(p.a[i]%2 == 0)
            {
                ob.a[k++] = p.a[i];
            }
        }
        for(int i=0;i<q.m;i++)
        {
            if(q.a[i]%2 == 0)
            {
                ob.a[k++] = q.a[i];
            }
        }
        return ob;
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

class main{
    public static void main(String args[])throws Exception
    {
        int f,s;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter the size of the 1st array :: ");
        f = Integer.parseInt(br.readLine());
        System.out.print("Enter the size of the 2nd array :: ");
        s = Integer.parseInt(br.readLine());
        oddeven obj1 = new oddeven(f);
        oddeven obj2 = new oddeven(s);
        oddeven obj3 = new oddeven(f+s);
        System.out.print("Enter the 1st array :: ");
        obj1.fillarray();
        System.out.print("Enter the 2nd array :: ");
        obj2.fillarray();
        obj3 = obj3.arrange(obj1,obj2);
        System.out.print("Display the first array values :: ");
        obj1.display();
        System.out.print("Display the second array values :: ");
        obj2.display();
        System.out.print("Display the arranged array values :: ");
        obj3.display();
    }
}
