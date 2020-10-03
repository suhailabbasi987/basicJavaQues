public class basicQues()}

public static void main(String args[])
{
//digitcount();      
//digitofNumber();
//System.out.println()
//reverse();
//inverseofanumber();
//rotateNumber();
//lcm();
//primeFactorization();
//benBulb();
//Pattern1();
//Pattern3();
//Pattern2();
//Pattern4();
//pattern6(1);
//pattern7();
//pattern8();
//pattern9();
//pattern10();
//pattern11();
//pattern12();
//pattern13();
//pattern14();
//pattern15();
//pattern17();
//pattern18();
//pattern19();
//pattern20();
}


public static int fact(int x)

{
      int factx=1;
for(int i=1;i<=x;i++)
{
      factx*=i;
}
return factx;
}
public static void pattern20()
{
      int n=9;
      int k=n/2+1;
      for(int i=1;i<=n;i++)
      {
            for(int j=1;j<=n;j++)
            {
                  if(j==1 || j==n ||  j==i  && i>n/2 || j==n+1-i && i>n/2)
                  {
                   
      
                        System.out.print("*\t");
      
                  }
                  else
                  {
                        System.out.print("\t");
      
                  }
            }
            
            System.out.println();
      }
      
}
public static void pattern19()
{
      
int k=1;
int n=7;
int l=n/2+1;
int p=l+1;
for(int i=1;i<=n;i++)
{
      if(i>=n/2)
    {
            p++;
      }
      for(int j=1;j<=n;j++)
      {
            
                 
           if( i==1 && j==k || i==n && j==l || j==n/2+1 || i==n/2+1 || j==1 && i==p ||  i>=l && j==1 ||j==n && i<=n/2)
              
                  
                  {
                  if(j>=n/2+1 && i==n)
                  {
                        l++;
                  }
                  
                   
                  System.out.print("*\t");
                  if(j<=n/2 )
                  {
                        k++;
                  }
                  

            }
            else
            {

                  System.out.print("\t");
            }
      }
      System.out.println();
}

}
public static void pattern17()
{
      
int n=5;
int rv=n*2-1;
int k=1;
int con=n/2+1;
int l=n/2+1;

for(int i=1;i<=n;i++)
{
      k=1;
for(int j=1;j<=n;j++)
{

      if(i==n/2+1 || j>=n/2+1 && j<=l)
      {

            System.out.print("*\t");
            
      }
      else
      {
            System.out.print("\t");
      }   
}
if(i<=n/2)
l++;
else
l--;
System.out.println();
}



}
public static void pattern15()
{
      int n=5;
//int k=1;
int str=1;
int sp=n/2;
int v=1;
for(int i=1;i<=n;i++)
{
      for(int j=1;j<=sp;j++)
      {
            
       System.out.print(" ");
          
      }
      int cv=v;
      for(int k=1;k<=str;k++)
      {
            System.out.print(cv);
            if(k<=str/2)
            {
                  cv++;
            }
            else
            {
                  cv--;
            }
            
      }
      if(i<=n/2)
      {
            v++;
            sp--;
            str+=2;
      }
      else
      {
            v--;
            sp++;
            str-=2;
      }
System.out.println();
}


}
 
public static void pattern14()
{
      int n=5;
      for(int i=1;i<=10;i++)
      {
            System.out.println(n+" * "+i+" = "+i*n);
      }
}


public static void pattern13()
{
      Scanner scn = new Scanner(System.in);

      //write your code here

int n=scn.nextInt();
int temp=0;
for(int i=0;i<n;i++)
{
    int icj=1;
    for(int j=0;j<=i;j++)
    {
System.out.print(icj+"\t");

int icjp1=icj*(i-j)/(j+1);
icj=icjp1;

    }
System.out.println();
}
}

public static void pattern12()

{
      
int n=6;
int k=1;
int str=1;
int a=-1;
int b=1;
int temp=0;
for(int i=1;i<=n;i++)
{
      for(int j=1;j<=str;j++)
      {
            temp=a+b;
            
System.out.print(temp+"\t");
a=b;
b=temp;

      }
      str++;
System.out.println();
}

}

public static void pattern11()
{
      
int n=9;
int k=1;

for(int i=1;i<=n;i++)
{
      for(int j=1;j<=n;j++)
      {
            if(j<=i) 
            {
System.out.print(k+"\t");
k++;
            }
            else
            {

                  System.out.print("\t");
            }

      }
System.out.println();
}

}
public static void pattern10()
{
      

int n=9;
int k=n/2;

for(int i=1;i<=k;i++)
{
      for(int j=1;j<=n;j++)
      {
            if(j==n/2+2-i ||  j==n/2+i) 
            {
System.out.print("*\t");
            }
            else
            {

                  System.out.print("\t");
            }

      }
System.out.println();
}

for(int i=1;i<=n/2+1;i++)
{
      for(int j=1;j<=n;j++)
      {
            if(j==i || j==n+1-i) 
            {
System.out.print("*\t");
            }
            else
            {

                  System.out.print("\t");
            }

      }
System.out.println();
}


}
public static void pattern9()
{
      
int n=5;
for(int i=1;i<=n;i++)
{
      for(int j=1;j<=n;j++)
      {
            if(j==n+1-i  || j==i) 
            {
System.out.print("*\t");
            }
            else
            {

                  System.out.print("\t");
            }

      }
System.out.println();
}

}

public static void pattern8()
{

      int n=5;
      for(int i=1;i<=n;i++)
      {
            for(int j=1;j<=n;j++)
            {
                  if(j==n+1-i)
                  {
      System.out.print("*\t");
                  }
                  else
                  {
      
                        System.out.print("\t");
                  }
      
            }
      System.out.println();
      }      
}
public static void pattern7()
{

      Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
              // write ur code here
              
              for(int i=1;i<=n;i++)
              {
                  for(int j=1;j<=n;j++)
                  {
                      if(j==i)
                      {
                          System.out.print("*\t");
                      }
                      else
                      {
                              System.out.print("\t");
                      
                      }
                  }
                  System.out.println();
              }
      

}
public static void pattern6(int l)
{
            
if(l==0)
{
      return;
}

pattern6(l-1);
      int n=9;
      int k=n+2;
      int sp=1;
      int str=k/2;

for(int i=1;i<=n;i++)
{

for(int j=1;j<=str;j++)
{
      System.out.print("*");
}

for(int j=1;j<=sp;j++)
{
      System.out.print(" ");
}

for(int j=1;j<=str;j++)
{
      System.out.print("*");
}
if(i<=n/2)
{
      sp+=2;
      str--;
}

else
{
      sp-=2;
      str++;
}
System.out.println();

}

}

public static void Pattern4()
{
      
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      
      //int sp=0; 
      //int str=n;
      for(int i=1;i<=n;i++)
      {
            for(int j=1;j<=n;j++)
            {
            if(j>=i)
            {
            System.out.print("*\t");
            }
      
            else
            {
                  System.out.print("\t");
            }
      }

      System.out.println();
      }

}

public static void Pattern2()
{
      Scanner scn = new Scanner(System.in);
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
    for(int j=n+1-i;j>=1;j--)
    {
          {
                System.out.print("*\t");
         }
    }
    System.out.print("\n");

}

}
public static void Pattern3()
{

      
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();

for(int i=1;i<=n;i++)
{
      for(int j=1;j<=n;j++)
      {
            if(j>=n+1-i)
            {
                  System.out.print("*\t");
            

            }
          else
            {
System.out.print("\t");
            }
      }
      System.out.print("\n");
}

}
public static void Pattern1()
{
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      
      for(int i=1;i<=n;i++)
      {
            for(int j=1;j<=n;j++)
            {
                  if(j<=i)
                  {
                        System.out.print("*\t");
                  
      
                  }
                  else
                  {
      System.out.print(" ");
                  }
            }
            System.out.print("\n");
      }
      
}

public static void benBulb()
{

Scanner scn=new Scanner(System.in);
int n=scn.nextInt();

int div=1;
for(int i=1;i*i<=n;i++)
{
      int k=i*i;
System.out.println(k);
}
}


public static void primeFactorization()
{
int num=49;
int p=2;
while(num>1)
{
if(num%p==0)
{
num=num/p;
System.out.println(p);
}
else 
{
      p=p+1;
}

}
 
}
public static void GCDnLCM()
{

      int a=36;
      int b=24;
      int k=0;
      if(b<a)
      k=b;
      else
      k=a;
int i=k;
      for( ;i>=2;i--)
      {
            if(a%i==0  && b%i==0)
            {
                  break;
            }

      }
      if(i==1)
      {
            System.out.println("null");
      }
      else
System.out.println(i);

int lcm2=(a*b)/i;

System.out.println(lcm2);

}

public static void rotateNumber()
{

Scanner scn=new Scanner (System.in);
int n=scn.nextInt();
int k=scn.nextInt();

int temp=n;
int nod=0;
while(temp>0)
{
      temp=temp/10;
      nod++;
}
k=k%nod;
if(k<0)
{
      k=k+nod;
}
int div=1;
int mult=1;
for(int i=1;i<=nod;i++)
{
if(i<=k)
{
      div=div*10;
}
else
{
      mult=mult*10;
}

}

int q=n/div;
int r=n%div;

int rotate=r*mult+q;
System.out.println(rotate);

}

public static void inverseofanumber()

{
int n=21453;
int count=0;
int ans=0;
int sum=0;
while(n!=0)
{
      int q=n%10;
      count++;
      int div=(int)Math.pow(10,q-1);
      ans=(count*div);
     // System.out.println(ans);
      sum+=ans;
      n=n/10;

}
System.out.println(sum);
}

public static void digitcount()
{
      int n=100;
int con=0;
int num=0;
while(n!=0)
      {
     con= n%10;
     n=n/10;
num++;   
      }
      System.out.println(num);

}


public static void digitofNumber()
{
      

      Scanner scn =new Scanner (System.in);
      int n=scn.nextInt();
      int nod=0;
      int temp=n;
      while(temp!=0)
       {
             temp=temp/10;
             nod++;
       }
      
       int div=(int)Math.pow(10,nod-1);
      
      while(div!=0)
      {
            int q=n/div;
            System.out.println(q);
            n= n % div;
            div=div/10;
      System.out.println(n);      
System.out.println("d="+div);      
}
      
      }

      public static  void reverse()
      {
            int n=0330;
         // System.out.print(02056/10);

            while(n!=0)

{
      int ans=n%10;
      n=n/10;
     System.out.print(ans);
}


      }


}
