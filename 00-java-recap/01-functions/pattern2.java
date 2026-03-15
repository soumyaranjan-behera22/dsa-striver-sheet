public class pattern2 {
    public static void squrePattern(int n){
        for(int i =1;i<=n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void numSqurePattern(int n){
        for (int i=0;i<n;i++){
            for(int j=1;j<=n;j++){

                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void numPattern(int n){
        for(int i = 0;i<n;i++){
            for(int j =0 ; j<i+1;j++){

                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }
    public static void charPattern(int n){
        for(int i =0 ;i<n;i++){
            char ch ='A';
            for(int j =0;j<n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
    public static void charPattern2(int n){
        char ch ='A';
        for(int i =0 ;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
    public static void numSqurePattern2(int n){
        int num =1;
        for (int i=0;i<n;i++){
            for(int j=1;j<=n;j++){

                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
    public static void trianglePattern(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print("*"+" ");
                
            }
            System.out.println("");
        }
    }
    public static void numTrianglePattern(int n){
       
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print((i+1)+" ");
    
            }
            System.out.println("");
        }
    }
    public static void charTrianglePattern(int n){
       char ch ='A';
        for (int i=0;i<n;i++){
            char ch2 = ch;
            ch++;
            for(int j=0;j<i+1;j++){

                System.out.print(ch2+" ");
                ch2--;
    
            }
            System.out.println("");
        }
    }
    public static void floydTriangle(int n){
        int num =1;
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
    public static void floydCharTriangle(int n){
        char ch ='A';
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
    public static void invertedTrianglePattern(int n){
       
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print("  ");
    
            }
            for(int j=0;j<n-i;j++){
                System.out.print(i+1+" " );
            }
            System.out.println("");
        }
    }
    public static void invertedPyramidPattern(int n){
       
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print(" ");  //only the one extr space removed from the inverted triangle pattern
    
            }
            for(int j=0;j<n-i;j++){
                System.out.print(i+1+" " );
            }
            System.out.println("");
        }
    }
    public static void invertedTriangleCharPattern(int n){
       char ch ='A';
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){

                System.out.print("  ");
    
            }
            for(int j=0;j<n-i;j++){
                System.out.print(ch+" " );
            }
            ch++;
            System.out.println("");
        }
    }
    public static void pyramidStarPattern(int n){
       
        for (int i=0;i<n;i++){
            // control spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            // control first pattern
            for(int j=1;j<i+1;j++){
                System.out.print("*"+" ");
            }
            // control the second pattern
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
    public static void pyramidPattern(int n){
       
        for (int i=0;i<n;i++){
            // control spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            // control first pattern
            for(int j=1;j<i+1-1;j++){
                System.out.print(j+" ");
            }
            // control the second pattern
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void pyramidPattern2(int n){

       
        for (int i=0;i<n;i++){
            // control spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            // control first pattern
            for(int j=i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            // // control the second pattern
            for(int j=2; j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void holowDiamondpattern(int n){
        //for top of holow pyramid part
        for(int i=0;i<n;i++){
            //for spaces
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
                  //for inner spaces
         
            }
            System.out.print("*"); //for the stars append at the end of spaces 
            if(i!=0){
                for(int j =0; j<2*i-1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            // CONFUSION
            // spaces -> * -> inner spaces -> * -> then println
            System.out.println("");
          
        }
        for(int i=0;i<n-1;i++){
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i != n-2){
            for(int j=0; j<2*(n-i)-5; j++){
                System.out.print(" ");
                }
                
                System.out.print("*");
            }   
            System.out.println("");
        }
    }
public static void main(String[] args) {
        // TESTING THE METHODS 
        // squrePattern(4);
        // numSqurePattern(3);
        // numSqurePattern2(3);
        // charPattern2(3);
        // trianglePattern(4);
        // numTrianglePattern(4);
        // charTrianglePattern(4);
        // floydTriangle(4);
        // floydCharTriangle(4);
        // invertedTrianglePattern(4);
        // invertedPyramidPattern(5);
        // invertedTriangleCharPattern(5);
        // pyramidPattern(4);
        // pyramidStarPattern(5);
        // pyramidPattern2(4);
        // numPattern(4);
        holowDiamondpattern(4);
    }
}
