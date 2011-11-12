#include"stdio.h"
#include"stdlib.h"
#include<iostream>
#include <math.h>

using namespace std;

long mult(long x,long y,int n);
int num(long x);

long mult(long x,long y,int n)
{
  long a,b,c,d,s;
  if (n==1) //起初这里落了个＝号
    return x*y;
  else
  {
    a=long(x/pow(10,(n/2))); //取x的左半部分
    b=long(x%long(pow(10,(n/2)))); //取x的右半部分
    c=long(y/pow(10,(n/2))); //取y的左半部分
    d=long(y%long(pow(10,(n/2)))); //取y的右半部分
    s=mult(a,c,n/2)*pow(10,n)+(mult(a,d,n/2)+mult(b,c,n/2))*pow(10,n/2)+mult(b,d,n/2); //书上的公式
    return s;
  }
}

int num(long x) //判断输入的数字的位数
{
  int i=0;
  if(x-9<=0)
    return 1;
  else
  {
    while (x!=0)
    {
      i++;
      x=x/10;
    }
    return i;
  }
}

int main() //主函数
{
  long x=1234,y=2564;
  cout<<mult(x,y,num(x))<<endl;
  /*
     3163976
     */
  return 0;
}
