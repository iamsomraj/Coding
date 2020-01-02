#include<stdio.h>
int main() {
    int a, b, c, d;
    printf("\nEnter the row and column of the first matrix: \n");
    scanf("%d%d",&a,&b);
    printf("\nEnter the row and column of the second matrix: \n");
    scanf("%d%d",&c,&d);
    if( b!=c ) {
        printf("\nRow and column are not matching! \n");
    } else {
        int m1[a][b], m2[c][d], m3[a][d];
        printf("\nEnter the matrix elements :\n");
        int i, j, k;
        for(i=0; i<a; i++ ){
            for(j=0; j<b; j++) {
                scanf("%d",&m1[i][j]);
            }
        }
        printf("\nEnter the matrix elements :\n");
        for(i=0; i<c; i++ ) {
            for(j=0; j<d; j++) {
                scanf("%d",&m2[i][j]);
            }
        }
        for(i=0; i<a; i++ ) {
            for(j=0; j<d; j++) {
                int sum = 0;
                for(k = 0; k<c; k++) {
                    sum = sum + m1[i][k] * m2[k][j];
                }
                m3[i][j] = sum;
            }
        }
        printf("\nThe resultant matrix is: \n");
        for(i=0; i<c; i++ ) {
            for(j=0; j<d; j++) {
                printf("\t%d",m3[i][j]);
            }
            printf("\n");
        }



    }
}
