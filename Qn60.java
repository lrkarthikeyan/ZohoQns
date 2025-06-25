package com.ZohoQns;

public class Qn60 {
    public static void main(String[] args) {
        String [][] arr = {
                {"W","E","L","C","O"},
                {"M","E","T","0","Z"},
                {"O","H","O","C","O"},
                {"R","P","O","R","A"},
                {"T","I","O","N"}
        };
        String find = "TOO";
        check(arr,find);
    }
    private static void check(String[][] arr,String find){
        StringBuilder br = new StringBuilder();
        for(int i = 0;i<arr.length-2;i++){
            for(int j = 0;j<arr[i].length-2;j++){
                br.append(arr[i][j]);
                br.append(arr[i][j+1]);
                br.append(arr[i][j+2]);
                if(br.toString().equals(find)){
                    System.out.println("Starting Index <"+i+", "+j+">");
                    System.out.println("Ending Index <"+i+", "+(j+2)+">");
                }else{
                    br.setLength(1);
                }
                br.append(arr[i+1][j]);
                br.append(arr[i+2][j]);
                if(br.toString().equals(find)){
                    System.out.println("Starting Index <" +i+", "+j+">");
                    System.out.println("Ending Index <"+(i+2)+", "+j+">");
                }else{
                    br.setLength(0);
                }
            }
        }
    }
}
