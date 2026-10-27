/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16;

/**
 *
 * @author luizf
 */
public class Aula16ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m[][] = new int[4][4];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                if(i == j){
                    m[i][j] = 1;
                }else{
                    m[i][j] = 0;
                }
            }
        }
        for(int i = 0; i <m.length;i++){
            for(int j = 0; j<m[i].length;j++){
                 System.out.printf("%4d", m[i][j]);
            }
            System.out.println("");
        }
    }
    
}
