package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int random=(int)(Math.random()*100),hak=3;
        
       
       while(hak>0){
           if(hak==1){ System.out.println("son bir hakkiniz kaldi iyi dusunun .");    }
           
           System.out.println("aklinizda tuttugunuz sayiyi girin: ");
           int selected=input.nextInt();
             if(selected==random){
                 System.out.println("evet tuttugunuz sayi dogru tahmin kazandiniz!!!");
                 
             }else if(selected>random){
                 System.out.println("girdiginiz sayi gizemli sayidan büyük...");
             }
             else if(selected<random){
                 System.out.println("girdiginiz sayi gizemli sayidan kücük");
             }
             
           hak--;  
       }
        
    }
    
}
