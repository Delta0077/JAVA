package learnprogrammingacademy.learning;





    /*
    //Constructor
    class Dog{
        private String color;

        public Dog(String color){
           // color = color; // assignment to same variable
            this.color = color;
        }

        //public dog(){} //method must have return type
       // public void Dog() {}//this is method not a constructor

        public void printColor(){
            System.out.println("color = " +color);//This keyword is optional since we don't have parameter with same name
        }


    }
        class Cat {
            private String name;
            private int age;

            public Cat() {                          //1st constructor
              this("Tom" , 3);
            }
            public Cat(String name , int age) {  //2nd constructor
                this.name = name;
                this.age = age;
            }

            public void printInfo(){
                System.out.println("name = " + name + " age = " + age);
            }

        }*/

    class Player {

        private int health = 150;
        private boolean alive = true;

        //this will be generated by compiler in case we don't have any other constructors
        //public Player() {}

        public void reduceHealth(int amount) {
            setHealth(health - amount);

        }

        public void setHealth(int health) {
            if (health <= 0) {

                health = 0;
                alive = false;
            }
            this.health = health;

        }
        public int getHealth() {
           return health;
        }

        public boolean isAlive() {
            return alive;
        }

        public void respawn() {

            if(!alive) {
                health = 150;
                alive = true;

            }

        }

        public void printInfo() {
            System.out.println("Player health = " + health + " alive =" + alive);
        }
    }


    public class Demo {





       /* static String person;//null by default
        static int lives;
        static String pet;*/




    /* static String[] pets= {"sparrow","parrot","crow"};
     static int [] [] table = {

             {1,2,3},
             {4,5,6,11},
             {7,8,9}
     };*/


     public static void main(String[] args) {

        Player player = new Player();


        player.reduceHealth(100);
        player.printInfo();




         player.reduceHealth(100);
         player.printInfo();

         player.respawn();
         player.printInfo();


        /* int result = sum(5 , 4);
         System.out.println(" Sum (a + b) = " + result);

         result = sum(5 , 8 ,8);
         System.out.println(" Sum (a + b + c) = " +result);

         result = sum(3 , 2 , 5 , 10);
         System.out.println(" Sum (a + b + c + d) = " +result);*/




        /* int result = subtract(9, 2);

         System.out.println("Result = " + result);
         result = subtract(9,7,6);
         System.out.println(" Result1 = " +result);

         result = mul(9, 5);
         System.out.println("mul(int a, int b = " +result);

         float floatresult = mul(2.5f , 3.5f);
         System.out.println(" mul (2.5 , 3.5 ) = " +floatresult);*/

        /* System.out.println("isTrue = " + isTrue());

         int number = getInt();
         System.out.println("number = " +number);

         number = increment(number);
         System.out.println("number =" + number);

         number = sum(number,3);
         System.out.println("number = " + number);

         printSum(2,5);
         printSum(3,6);






        /* System.out.println("person " + person);

         person="John";
         person= person.toUpperCase();
         System.out.println("person " + person);

         String anotherPerson="";

         System.out.println("anotherPerson " + anotherPerson);
         System.out.println("anotherPerson null = " + (anotherPerson ==null));
         System.out.println("anotherPerson empty = " + anotherPerson.isEmpty());

         //debugging
         pet="Dog";
         System.out.println("Pet is null= " +(pet==null));
         String dog = pet.toUpperCase();
         System.out.println("dog= " + dog);



         //create array of strings that represents names of people
         //print all strings/ names that start with capital letter T in uppercase
         // find method in string class that checks if string starts with another string

        /* String people[] = {"Aditya", "Andindya", "Avishek", "Tanmay", "Tomal"};

         //for each
         for(String person: people){
             if(person.startsWith("T")){
                 System.out.println("person " + person.toUpperCase());
             }
         }
         //for loop
         for (int i = 0; i<people.length; i++) {
             String person = people[i];

             if (person.startsWith("T")) {
                 System.out.println("person " + person.toUpperCase());
             }
         }



         /*String dog = "Dog";
         String dog2 = new String(new char[]{'D','o','g'});

         System.out.println("dog == dog2 => "+ (dog == dog2));
         System.out.println("dog.equals(dog2) => " + dog.equals(dog2));

         String cat ="Cat";
         String cat2 = new String("Cat");
         String cat3 = cat2; // 2 references(cat2 , cat3) to same object in memory

         System.out.println("reference equality => " + (cat == cat2));//false
         System.out.println("reference equality => " + (cat == cat3));//false
         System.out.println("reference equality => " + (cat2 == cat3));//true

         String lizard = "Lizard";
         System.out.println("lizard first letter = " + lizard.charAt(0));
         System.out.println("lizard contains iz = " + lizard.contains("iz"));

         //immutability
         lizard.toUpperCase();//this does not change string it creates new string

         System.out.println("lizard = " +lizard);

         lizard = lizard.toUpperCase();// assign new values to variable
         System.out.println("lizard = " + lizard);



         //Break and continue statement use
         String [] animals = {"Dog","Cat","Lizard","Bird","Snake"};
         for(String animal: animals) {
             if (animal.equals("Lizard")) {
                break;
             }
             System.out.println(animal);
         }
            //break jumps here
         System.out.println("Continue");

         for(String animal: animals){
             if(animal.equals("Lizard")){
                 continue;
             }
             System.out.println(animal);
         }

         //my own code for challenge
         int sum=0;
         for(int i =1; i<=100; i++)
            sum+=i;
         {
             System.out.println("Sum = " +sum );

         }
         //while
         int number = 1;
         int sum1 = 0;
         while(number<=100){
             sum1+= number;
             number++;
         }
         System.out.println("Sum " + sum);
         //do-while
         number = 1;
         sum = 0;
         do {
             sum+=number;
             number++;
         } while(number<=100);
         System.out.println(" sum = " + sum);


         //for loop
         sum = 0;

         for(int i = 1;i<=100; i++)
            sum+=i;
         {
             System.out.println(" sum " + sum);
         }


            for(int i = 0; i<pets.length;i++)
            {
                //1st iteration i = 0
                //2nd iteration i = 1
                //3rd iteration i = 2
                //4th iteration i=3 , 3<3, loop false
                System.out.println("pet[" + i + "]= " + pets[i]);

            }

                for(String pet : pets){

                    System.out.println("pet= " + pet);


                }
                for(int row = 0; row< table.length; row++){
                    for(int column =0; column< table[row].length; column++)

                        System.out.println("number = " + table[row][column]);

                 }*/

       /* Dog dog = new Dog( "gray");
        dog.printColor();

        Dog dog2 = new Dog("black");
        dog2.printColor();

        Cat cat = new Cat();
        cat.printInfo();

        Cat cat2 = new Cat("Jerry" , 5);
        cat2.printInfo();*/

     }








    /* private static int getInt() {
            //return false doesn't compile
            return 10;
        }

        private static boolean isTrue() {
            return 5<10; // using expressions with return statement
        }
        private static int increment(int number)    {
            return number+1;
        }
        private static int sum(int a, int b)    {
         return a+b;
        }
        private static void printSum(int a, int b)  {
            System.out.println(a + " + " + b + " = " +(a+b));
           // return;//optional in void methods
        }*/
        //Method Overloading
      /*  private static int subtract(int a , int b){
            return a-b;
        }
        private static int subtract(int a ,int b , int c){
            return a - b - c;
        }
        private static int mul(int a , int b){
            return a * b;
        }
        private static float mul(float a, float b){
            return a * b;
        }*/

        //Over loading challenge
       /* private static int sum(int a, int b){
            return a + b;
        }
        private static int sum(int a , int b ,int c){
            return a + b + c;
        }
        private static int sum(int a , int b ,int c , int d) {
            return a + b + c + d;
        }*/






}