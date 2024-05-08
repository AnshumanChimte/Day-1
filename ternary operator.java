import java.util.*;

class Newclasss{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter unit:");
        int unit =kb.nextInt();
        int bill =(unit >=0 && unit <=100) ? unit*2 : 
                   (unit >=101 && unit <=150) ? (100*2)+(unit-100)*3 :
                    (unit >=151 && unit <=200) ? (100*2)+(50*3)+(unit-150)*4 :
                    (unit >=201 && unit <=250) ? (100*2)+(50*3)+(50*4)+(unit-200)*5:
                     (unit >=251 && unit <=300) ? (100*2)+(50*3)+(50*4)+(50*5)+(unit-250)*6:
                      (unit >=301 && unit <=500) ? (100*2)+(50*3)+(50*4)+(50*5)+(50*6)+(unit-300)*7:
                       (100*2)+(50*3)+(50*4)+(50*5)+(50*6)+(200*7)+(unit-500)*8;
        System.out.println("Total bill is "+ bill);
        
    }
}
