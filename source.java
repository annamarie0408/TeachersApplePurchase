import java.util.Scanner; //importing the scanner

public class Project1
{
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        //Defining Variables
        int numApples, totalNumStudents, leftOverApplesStudents, lefOverApplesTeacher;
        double applePrice = 0.00, amount = 0.00, discount,total, salesTax;
        final double applePie = 10.00, appleCobbler = 15.00, gallonAppleCider = 8.00;
        String teachersLastName, teachersSalutation, dayOfWeek, teacherChoice;

        //Asking input for the amount of apples picked
        //If the amount is more than 200, it will ask the user to input another number
        System.out.print("How many apples were collected? ");
        numApples = input.nextInt();
        if (numApples > 200){
            System.out.print("Error! You can only order 200 apples for the students, please re-enter a number less than 200 ");
            numApples = input.nextInt();
        }

        //Asking the day of the week
        //Will check the input to make sure it is correct. If the word is spelt wrong or just not a date
        //the program will ask for another input
        System.out.print("What is the day of the week? ");
        dayOfWeek = input.next();
        if ( dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday") ||
                dayOfWeek.equalsIgnoreCase("Wednesday") || dayOfWeek.equalsIgnoreCase("Thursday") ||
                dayOfWeek.equalsIgnoreCase("Friday") || dayOfWeek.equalsIgnoreCase("Saturday") ||
                dayOfWeek.equalsIgnoreCase("Sunday")) {

            dayOfWeek = Character.toString(dayOfWeek.charAt(0)).toUpperCase()+dayOfWeek.substring(1); //making the first letter capital, regardless what the user typed in

        }
        else {
            System.out.print("Error! Incorrect Wording!! Please enter a day of the week: ");
            dayOfWeek = input.next();
            dayOfWeek = Character.toString(dayOfWeek.charAt(0)).toUpperCase()+dayOfWeek.substring(1); //making the first letter capital, regardless what the user typed in
        }

        //Asking the amount of students
        System.out.print("How many students are there? ");
        totalNumStudents = input.nextInt();

        //Asking for the Teachers last name
        System.out.print("Hello, please enter the teachers last name: ");
        teachersLastName = input.next();
        teachersLastName = Character.toString(teachersLastName.charAt(0)).toUpperCase()+teachersLastName.substring(1); //making the first letter capital, regardless what the user typed in

        //Asking for the salutation of the teacher
        System.out.print("Please enter the teachers salutation: ");
        teachersSalutation = input.next();
        teachersSalutation = Character.toString(teachersSalutation.charAt(0)).toUpperCase()+teachersSalutation.substring(1); //making the first letter capital, regardless what the user typed in

        //Math to find the amount of apples the students have and the teacher
        leftOverApplesStudents = numApples / totalNumStudents;
        lefOverApplesTeacher = numApples - (leftOverApplesStudents * totalNumStudents);

        //Printing to the console the results at the moment
        System.out.println(teachersSalutation + " " + teachersLastName + ", you have " + leftOverApplesStudents +
                " apples per a student with " + lefOverApplesTeacher + " left over for you");
        System.out.println(" "); //creating an empty line just for clearer reading

        //menu and choices
        System.out.println("Would you like to order the following? ");
        System.out.println("Apple Pie: $" + applePie);
        System.out.println("Apple Cobbler: $" + appleCobbler);
        System.out.println("Gallon of Apple Cider: $" + gallonAppleCider);
        System.out.println(" ");
        System.out.print("Please enter either Apple Pie, Apple Cobbler, Apple Cider or None.");
        input.nextLine(); //extra line so that we can grab the users full input
        teacherChoice = input.nextLine();
        teacherChoice = Character.toString(teacherChoice.charAt(0)).toUpperCase()+teacherChoice.substring(1); //making the first letter capital, regardless what the user typed in



        //Switch statement that will take the number of apples collected and find the amount to pay for them.
        switch (numApples/50){
            case 0: applePrice = 10.00;
                break;
            case 1: applePrice = 15.00;
                break;
            case 2: applePrice = 20.00;
                break;
            case 3: applePrice = 30.00;
                break;
        }

        //if-else if statement to find the discount of the items, if there is one!
        if (dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday") || dayOfWeek.equalsIgnoreCase("Wednesday") && teacherChoice.equalsIgnoreCase("Apple Pie"))
        {
            amount = applePie;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is $%4.2f", amount);
        }

        else if (dayOfWeek.equalsIgnoreCase("Thursday") || dayOfWeek.equalsIgnoreCase("Friday") && teacherChoice.equalsIgnoreCase("Apple Pie"))
        {
            discount = 2.00;
            amount = applePie - discount;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is on sale today, " + dayOfWeek + " for $%4.2f", amount);
        }

        else if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") && teacherChoice.equalsIgnoreCase("Apple Pie"))
        {
            discount = 3.00;
            amount = applePie - discount;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is on sale today, " + dayOfWeek + "  for $%4.2f", amount);
        }

        else if (dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday") || dayOfWeek.equalsIgnoreCase("Wednesday") && teacherChoice.equalsIgnoreCase("Apple Cobbler"))
        {
            amount = appleCobbler;

            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is $%4.2f", amount);

        }
        else if (dayOfWeek.equalsIgnoreCase("Thursday") || dayOfWeek.equalsIgnoreCase("Friday") && teacherChoice.equalsIgnoreCase("Apple Cobbler"))
        {
            discount = 2.00;
            amount = appleCobbler - discount;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is on sale today, " + dayOfWeek + " for $%4.2f", amount);
        }

        else if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") && teacherChoice.equalsIgnoreCase("Apple Cobbler"))
        {
            discount = 3.00;
            amount = appleCobbler - discount;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is on sale, today " + dayOfWeek + " for $%4.2f", amount);
        }

        else if (dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday") || dayOfWeek.equalsIgnoreCase("Wednesday") && teacherChoice.equalsIgnoreCase("Apple Cider"))
        {
            amount = gallonAppleCider;

            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is $%4.2f", amount);

        }

        else if (dayOfWeek.equalsIgnoreCase("Thursday") || dayOfWeek.equalsIgnoreCase("Friday") && teacherChoice.equalsIgnoreCase("Apple Cider"))
        {
            discount = 2.00;
            amount = gallonAppleCider - discount;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is on sale today, " + dayOfWeek + " for $%4.2f", amount);
        }

        else if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") && teacherChoice.equalsIgnoreCase("Apple Cider"))
        {
            discount = 3.00;
            amount = gallonAppleCider - discount;
            System.out.printf("Great choice, " + teachersSalutation + " " + teachersLastName + " - " + teacherChoice +
                    " is an excellent choice and is on sale today, " + dayOfWeek + " for $%4.2f", amount);
        }
        else if (dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday") || dayOfWeek.equalsIgnoreCase("Wednesday") && teacherChoice.equalsIgnoreCase("None")) {
            amount = applePrice;
        }

        else if (dayOfWeek.equalsIgnoreCase("Thursday") || dayOfWeek.equalsIgnoreCase("Friday") && teacherChoice.equalsIgnoreCase("None"))
        {
            amount = applePrice;

        }

        else if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") && teacherChoice.equalsIgnoreCase("None"))
        {

            amount = applePrice;

        }


        //math to find the sales tax and total!
        salesTax = (applePrice + amount) * 0.07;
        total = salesTax + applePrice;

        //final system print out.
        System.out.println(" ");
        System.out.printf("Your total today (collection plus teacher item): $%4.2f", total);
        System.out.println(" ");














    }
}
