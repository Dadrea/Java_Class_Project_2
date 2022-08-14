import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();    
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    private static String reservedAnimals;
    private static String countryFinder;
    static Scanner scnr = new Scanner(System.in);
    static char userSelection;
    static char userPrint;
    

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        do {	
        	displayMenu();
        	userSelection = scnr.next().charAt(0);
        	switch (userSelection) {
        		case '0':
        		case '1':
        			intakeNewDog(scnr);
        			break;
        		case '2':
        			intakeNewMonkey(scnr);
        			break;
        		case '3':
        			reserveAnimal(scnr);
        			break;
        		case '4':
        		case '5':
        		case '6':
        			printAnimals(userPrint);
        			break;
        		case 'q':
        			System.out.println("Thank you. Goodbye");
            	    break;
        		default:
        			System.out.println("Incorrect option please enter another selection.");
            		switch (userSelection){
            			}
        		
        	}
        }while (userSelection != 'q');

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", true, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Guenter", "Capuchin", "Male", "5", "7.5", "10-03-1999", "India","Phase I", false, "United States", "10", "20", "15");
    	Monkey monkey2 = new Monkey("Amy", "Marmoset", "Female", "3", "5", "06-19-2013", "Canada","intake", true, "Canada", "8", "15", "11");
    	Monkey monkey3 = new Monkey("Dr. Banjo", "Tamarin",  "Male", "10", "15", "08-12-2010", "United States", "in service", false,"United States", "8", "16", "10");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        scnr.next();
        try {
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        
        // Add the code to instantiate a new dog and add it to the appropriate list
            else {
            	System.out.println("What is the dog's breed?");
            	String breed = scnr.nextLine();
            	scnr.next();
            	System.out.println("What is the dog's gender?");
            	String gender = scnr.nextLine();
            	scnr.next();
            	System.out.println("What is the dog's age?");
            	String age = scnr.nextLine();
            	scnr.next();
            	System.out.println("What is the dog's weight?");
            	String weight = scnr.nextLine();
            	scnr.next();
            	System.out.println("When was this dog acquired?");
            	String acquisitionDate = scnr.nextLine();
            	scnr.next();
            	System.out.println("Which country was this dog acquired?");
            	String acquisitionCountry = scnr.nextLine();
            	scnr.next();
            	System.out.println("What is the dog's training status?");
            	String trainingStatus = scnr.nextLine();
            	scnr.next();
            	System.out.println("Is this dog reserved? (true/false)");
            	boolean reserved = scnr.nextBoolean();
            	scnr.nextLine();
            	System.out.println("Which country is the dog in service?");
            	String inServiceCountry = scnr.nextLine();
        
            	Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            	dogList.add(dog4);
            	System.out.println("New dog has been added.");
            	return;
        }   
      }
    }
        		catch(Exception e) {
        			System.out.println("Invalid reserved input please try again.");
        		}
        			
        		}
    


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scnr.nextLine();
            scnr.next();
            try {
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
                else {
                	System.out.println("What is the monkey's species?");
                	String species = scnr.nextLine();
                	scnr.next();
                	System.out.println("What is the monkey's gender?");
                	String gender = scnr.nextLine();
                	scnr.next();
                	System.out.println("What is the monkey's age?");
                	String age = scnr.nextLine();
                	scnr.next();
                	System.out.println("What is the monkey's weight?");
                	String weight = scnr.nextLine();
                	scnr.next();
                	System.out.println("When was this monkey acquired?");
                	String acquisitionDate = scnr.nextLine();
                	scnr.next();
                	System.out.println("Which country was this monkey acquired?");
                	String acquisitionCountry = scnr.nextLine();
                	scnr.next();
                	System.out.println("What is the monkey's training status?");
                	String trainingStatus = scnr.nextLine();
                	scnr.next();
                	System.out.println("Is this monkey reserved? (true/false)");
                	boolean reserved = scnr.nextBoolean();
                	scnr.nextLine();
                	System.out.println("Which country is the monkey in service?");
                	String inServiceCountry = scnr.nextLine();
                	System.out.println("Which country is the monkey's height?");
                	String height = scnr.nextLine();
                	System.out.println("Which country is the monkey's tail length?");
                	String tailLength = scnr.nextLine();
                	System.out.println("Which country is the monkey's body length?");
                	String bodyLength = scnr.nextLine();
                	   
                	Monkey monkey4 = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry,
            		height, tailLength, bodyLength);
                	monkeyList.add(monkey4);
                	System.out.println("New monkey has been added.");
                	return;
                }
            }
         }
                catch(Exception e){
                	System.out.println("Invalid reserved input please try again.");
                }

                }
           
        

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	System.out.println("Please enter an animal type: ");
        	reservedAnimals = scnr.nextLine();   // identifies the type 
        	if (reservedAnimals.equalsIgnoreCase("Monkey")) {
        		System.out.println("Please select the animals service country: ");
        		countryFinder = scnr.nextLine();
        		for (Monkey monkey: monkeyList) {
        			if(monkey.getAcquisitionLocation().equalsIgnoreCase(countryFinder));{ //identifies the service country
        				monkey.setReserved(true);
        				System.out.println("Animal registered as reserved");
        				return;
        			}
        			
        		}
        		System.out.println("Selected animal is not on the list.");
    			System.out.println("Please chose another selection.");
        	}
        			
        		
        		
        		else if (reservedAnimals.equalsIgnoreCase("Dog")){
        			System.out.println("Please select the animals service country: ");
            		countryFinder = scnr.nextLine();
            		for (Dog dog: dogList) {
            			if(dog.getAcquisitionLocation().equalsIgnoreCase(countryFinder));{
            				dog.setReserved(true);
            				System.out.println("Animal registered as reserved");
            				return;
            			}
            		}
            		System.out.println("Selected animal is not on the list.");
            		System.out.println("Please chose another selection.");
        			
        		}
        		else {
        			System.out.println("Invalid animal type pleases try again.");
        			return;
        		}
        
        }


        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs-
        // monkey - prints the list of monkeys-
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char userPrint) {
        	System.out.println("Confirm the animal type that you want to print");
        	System.out.println("[4] Print a list of all dogs");
            System.out.println("[5] Print a list of all monkeys");
            System.out.println("[6] Print a list of all animals that are not reserved");
            userPrint = scnr.next().charAt(0);
        	       	
           if (userPrint == '4') {
        	   System.out.println("Dog list:");
        	   for(Dog dog : dogList) {
        		   System.out.println(dog.toString());
        	   }     	     
           }
           else if (userPrint == '5') {
        	   System.out.println("Monkey list:");
        	   for(Monkey monkey: monkeyList) {
        		   System.out.println(monkey.toString());
        	   }  
           }             	
           else if (userPrint == '6') {
        	   for(Dog dog : dogList) {
        		   if (dog.getTrainingStatus().equals("in service") && dog.getReserved() == false) {
        			   System.out.println(dog);
        			   for(Monkey monkey: monkeyList) {
                		   if (monkey.getTrainingStatus().equals("in service") && monkey.getReserved() == false) {
                			   System.out.println(monkey);
                    	   }
                	   	 }
                	   }        			   
        	   }
           }
           else {
        	   System.out.println("Invalid choice please make another selection.");
        	   return;
           } 
        	   
                
            
            
            
        }
}
        


