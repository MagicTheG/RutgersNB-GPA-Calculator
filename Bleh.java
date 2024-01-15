import java.util.*;
public class Bleh {

    public static void main (String[]args){
        Scanner Read = new Scanner(System.in);

        HashMap<String, Double> Grades = new HashMap<>();
        Grades.put("A", 4.0);
        Grades.put("B+", 3.5);
        Grades.put("B", 3.0);
        Grades.put("C+", 2.5);
        Grades.put("C", 2.0);
        Grades.put("D", 1.0);
        Grades.put("F", 0.0);

        System.out.println("How Many Classes Are You Taking?");
        int Classes = Read.nextInt();

        System.out.println("How Many Totals Credits?");
        double Credits = Read.nextDouble();

        Double GradeValue = 0.0;
        int i = 1;
        System.out.println("Enter Expected Grade and Weight of Class (Credits)");
        
        
        while (i <= Classes){
            String userGrade = Read.next();
            String Classweight = Read.next();
            double Weight = Double.parseDouble(Classweight);
            
            double GradeP = Grades.get(userGrade); 
            GradeValue += GradeP*Weight;
              i++;
            }
        System.out.println((GradeValue/Credits));
        }
    }



