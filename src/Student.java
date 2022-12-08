import java.util.Random;

public class Student {


        String name;

        int age;

        public Student(String studentName,int studentAge){
                this.name = studentName;
                this.age = studentAge;
        }

        public void guessingAge(){
                int randomNumber = new Random().nextInt(35);
                System.out.println("The number for "+ name + " is this random number "+ randomNumber);

                if( randomNumber > age ){
                        System.out.println("The random number is biggest than your age!");
                } else if( randomNumber < age) {
                        System.out.println("Your age is biggest than my random number!");
                }else{
                        System.out.println("Wow It's the same number!!");
                }
        }

}