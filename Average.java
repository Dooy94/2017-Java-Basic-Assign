package q1;
import java.util.Scanner;

public class Average { 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();    
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");    
    
        double ary[] = new double[size];
        double sum=0.0;
        
        if(input.nextDouble()==0) break;
        	
    
        else if(input.nextDouble()>0) continue;
        		
        		for(int i=0;i<size;i++){
            	ary[i]=input.nextDouble();
            	sum+=ary[i];
        		}
         System.out.println("합: " + sum + ", 평균: " + sum/size);
    }
}
