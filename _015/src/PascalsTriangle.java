public class PascalsTriangle {
    private int [][] triangle;
    public PascalsTriangle(int instantiation){
        this.triangle = new int[instantiation][instantiation];
    }
    public void print (int lines){
        for (int i=0; i<lines; i++){
            for (int y=0; y<i+1; y++){
                if (y == 0) {
                    //beggining
                    triangle[i][y] = 1;
                } else if (y == (lines-1)) {
                    //ending
                    triangle[i][y] = 1;
                } else {
                    //middle
                    triangle[i][y] = triangle[i-1][y-1] + triangle[i-1][y];
                }
            }
        }
        for(int[] arr : triangle){
            for (int number : arr){
                System.out.println(number);
            }
            System.out.println("\n");
        }

    }
}
//        1
//       1 1
//      1 2 1         2[2][1] = 1[1][0] + 1[1][1]
//     1 3 3 1
//    1 4 6 4 1