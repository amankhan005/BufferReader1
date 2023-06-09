 import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class College{

   public static void main(String[] args)
                              throws IOException{

           BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
      
            Student s1 = new Student();

    
                  System.out.println("\n\t\t********** Plzz Enterd Student Details **********");

            System.out.print("Enter  ID No  :  \t");
            s1.sid = Integer.parseInt(br.readLine());

            System.out.print("Enter UR Name   :  \t");
            s1.sname = br.readLine();
            
            System.out.print("Enter UR Course :  \t");
            s1.course = br.readLine();

            System.out.print("Enter UR fee    :  \t");
            s1.fee = Double.parseDouble(br.readLine());

            System.out.print("Enter UR Mobile No :  \t");
            s1.mobile = Long.parseLong(br.readLine());

            System.out.print("Enter UR Email  :  \t");
            s1.email = br.readLine();

            System.out.print("Enter UR gender :  \t");
            s1.gender = br.readLine().charAt(0);

            System.out.print("Is UR Course Competed? :  \t");
            s1.courseComleted = Boolean.parseBoolean(br.readLine());



                  System.out.println("\n\t\t********** Student Details as u Entered **********");                             

            System.out.println("ID : "+s1.sid);
            System.out.println("Name   : "+s1.sname);
            System.out.println("Course : "+s1.course);
            System.out.println("Fee    : "+s1.fee);
            System.out.println("Mobile : "+s1.mobile);
            System.out.println("Email  : "+s1.email);
            System.out.println("Gender : "+s1.gender);
            System.out.println("Is UR Couse Completed? : "+s1.courseComleted);
  
      }

}