package mantis;
import java.util.Scanner;


public class test1 {
   public static void main(String[] args) {
      System.out.print("인원수>>");
      Scanner h_scanner = new Scanner(System.in); // 몇명의 인원의 이름과 전화번호를 남길지 입력
      int for_h = h_scanner.nextInt();
      Phone[]h_infor = new Phone[for_h];
      Phone[] h_name = new Phone[for_h];
      
      for(int i =0;for_h>i; i++) {
         System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
         Scanner infor = new Scanner(System.in);
         String human = infor.next();
         String number = infor.next();
         
         h_infor[i] = new Phone(human,number);
         h_name[i] = new Phone(human);
         
      }
      System.out.println("저장되었습니다. . .");
      while(true) {
         System.out.print("검색할 이름>>");
         Scanner search = new Scanner(System.in);
         String human = search.next();
         boolean found = false;
         
         for(int i=0; for_h>i;i++) {
            if(h_infor[i].human.equals(human)) {
                System.out.println(h_infor[i].human+h_infor[i].number);
                found = true;
                
            }
            
            
         }
         if(human.equals("exit")) {
            System.out.print("프로그램을 종료합니다. . .");
            break;
         }
         else if(!found){
             System.out.println(human+"이 없습니다.");
          }
         

            
         
         
      }
   }
   

}

