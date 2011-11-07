#include"stdio.h"
#include"stdlib.h"
#include<iostream>

using namespace std;

void Multiple(char A[], char B[], char C[]) {
  int TMP, In=0, LenA=-1, LenB=-1;
  while(A[++LenA] != '\0');
  while(B[++LenB] != '\0');
  int Index, Start = LenA + LenB - 1;
  for(int i=LenB-1; i>=0; i--) {
    Index = Start--;
    if(*B != '0') {
      for(int In=0, j=LenA-1; j>=0; j--) {
        TMP = (C[Index]-'0') + (A[j]-'0') * (*B - '0') + In;
        C[Index--] = TMP % 10 + '0';
        In = TMP / 10;
      }
      C[Index] = In + '0';
    }
  }
}

int main(int argc, char* argv[]) {
  char A[] = "218";
  char B[] = "388";
  char C[sizeof(A) + sizeof(B) - 1];

  for(int k=0; k<sizeof(C); k++)
    C[k] = '0';
  C[sizeof(C)-1] = '\0';

  Multiple(A, B, C);
  cout<<C<<endl;
}
