
/*Sample Run:
Welcome to the BIM Connect App!
Please provide your username:
686510
Please provide your password: 
22222
Login successful. Welcome Tymoteusz Nowak!
Your age is still missing. Please note that you should be 18 or older to be permitted to use this app. Please enter your age below:
20
Welcome back to your Connect account!
Please see the main menu below.
-----------------------------------------------------------------------------
BIM Connect Menu
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
1. User Preferences
2. Matching
3. Instructions
4. Log Off
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
Please enter the number of your preferred action:
3
Welcome to the BIM Connect App Instructions

This app connects you with potential friends or romantic partners based on your preferences. Here's how to navigate the app:

1. User Preferences:
First, set your preferences.
You will be asked to select your preferred gender, nationality, city, hobbies, sports, and the type of relationship you are interested in.
Your answers will help us match you with users who fit what you're looking for.

2. Matching:
Once your preferences are set, choose the "Matching" option.
The app will then display a list of potential matches based on your preferences.
For each match, you will see their name, age, nationality, email, and a compatibility score that indicates how well they match with your preferences.
Remember to set your preferences before select this option, otherwise the application will show "No potential matches found based on your preferences."

3. Instructions:
You are here!
If you ever need to remind yourself of how the app works, you can revisit these instructions.

4. Log Off:
When you're done, you can log off safely.

Remember, communication and respect are key to forming meaningful connections. Happy matching!
-----------------------------------------------------------------------------
BIM Connect Menu
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
1. User Preferences
2. Matching
3. Instructions
4. Log Off
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
Please enter the number of your preferred action:
1
-----------------------------------------------------------------------------
This is what we know about you so far:
You are Tymoteusz Nowak.
You identify as a male.
You are 20 years old.
Your e-mail address is tymek@gmail.com.
Please enter your preferences to be able to match with other users.
-----------------------------------------------------------------------------
1. Gender:
Please only choose ONE preferred gender out of the following: Female, Male, Non-binary.
Input preferred gender (choose ONE option only):
Female
2. Nationality:
Please only choose ONE nationality you are interested in connecting with from the following: Dutch, German, French, Italian, Spanish.
Input preferred nationality (choose ONE option only):
Italian
3. City:
Please only choose ONE city you will be connecting from the following: Rotterdam, Amsterdam, Den Haag.
Input the city you intend to connect in (choose ONE option only):
Amsterdam
4. Hobbies:
Please only choose ONE hobby you want to share from the following: Cooking, Fashion, Traveling, Movies, Gaming, Arts, Music.
Input preferred hobby (choose ONE option only):
Cooking
5. Sports:
Please only choose ONE favourite sport from the following: Fitness, Football, Skiing, Dancing, Running, Hockey, Cycling, Swimming. 
Input preferred sport (choose ONE option only):
Fitness
6. Type of relationship:
What are you looking for: Romance or Friendship?
Input preferred type of relationship (choose ONE option only):
Romance
Preferences updated. Returning to the main menu...
-----------------------------------------------------------------------------
BIM Connect Menu
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
1. User Preferences
2. Matching
3. Instructions
4. Log Off
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
Please enter the number of your preferred action:
2
-----------------------------------------------------------------------------
Your Potential Matches are:
1. Daisy Miller
Age: 22
Nationality: Italian
Contact: daisy@gmail.com
Compatibility Score: 83.33%
2. Eva Banks
Age: 22
Nationality: German
Contact: eva@gmail.com
Compatibility Score: 66.67%
3. Diede Evers
Age: 24
Nationality: Italian
Contact: diede@gmail.com
Compatibility Score: 83.33%
-----------------------------------------------------------------------------
BIM Connect Menu
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
1. User Preferences
2. Matching
3. Instructions
4. Log Off
<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3
Please enter the number of your preferred action:
4
You have logged off. 
*/

//The description of how the program works can be found in the instructions (choosing "3" in the menu)

//Importing
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Group5 { // This is where the driver class starts

	 //An array list that stores users information 
	//The order of the information are: first name, last name, username, password, age, gender, email, preferred gender that the user is looking for in a partner, nationality, city, hobby, favourite sport, type of relationship the user is looking for 
    public static List<User> users = new ArrayList<>();
    static {
        users.add(new User("Alice", "Johnson", "002", "alice123", 24, "female", "alice@gmail.com", "male", "German", "Amsterdam", "traveling", "football", "friendship"));
        users.add(new User("Bob", "Smith", "003", "bob123", 30, "male", "bob@gmail.com","female", "French", "Rotterdam", "movies", "running", "romance"));
        users.add(new User("Charlie", "Brown", "004", "charlie123", 27, "non-binary", "charlie@gmail.com","female", "Dutch", "Den Haag", "arts", "cycling", "friendship"));
        users.add(new User("Daisy", "Miller", "005", "daisy123", 22, "female", "daisy@gmail.com", "male", "Italian", "Amsterdam", "cooking", "swimming", "romance"));
        users.add(new User("Edward", "Wilson", "006", "edward123", 29, "male", "edward@gmail.com", "female", "Spanish", "Rotterdam", "fashion", "dance", "friendship"));
        users.add(new User("Fiona", "Clark", "007", "fiona123", 31, "non-binary", "fiona@gmail.com", "male", "German", "Den Haag", "gaming", "fitness", "romance"));
        users.add(new User("George", "Turner", "008", "george123", 28, "male", "george@gmail.com", "male", "French", "Amsterdam", "music", "hockey", "friendship"));
        users.add(new User("Hannah", "Moore", "009", "hannah123", 26, "female", "hannah@gmail.com", "female", "Dutch", "Rotterdam", "traveling", "skiing", "romance"));
        users.add(new User("Eva", "Banks", "010", "eva123", 22, "female", "eva@gmail.com", "male", "German", "Rotterdam", "cooking", "fitness", "romance"));
        users.add(new User("Tom", "Beckett", "011", "tom123", 23, "male", "tom@gmail.com", "female", "German", "Rotterdam", "traveling", "rugby", "romance"));
        users.add(new User("Jan", "Wagner", "012", "jan123", 24, "male", "jan@gmail.com", "male", "German", "Rotterdam", "traveling", "skiing", "romance"));
        users.add(new User("Lisa", "Dubois", "013", "lisa123", 25, "female", "lisa@gmail.com", "female", "French", "Rotterdam", "fashion", "hockey", "romance"));
        users.add(new User("Sophie", "Daniels", "014", "sophie123", 22, "non-binary", "sophie@gmail.com", "non-binary", "Spanish", "Rotterdam", "music", "running", "romance"));
        users.add(new User("Taylor", "Marshall", "015", "taylor123", 21, "non-binary", "taylor@gmail.com", "non-binary", "French", "Rotterdam", "music", "fitness", "friendship"));
        users.add(new User("Chloe", "Rodriguez", "016", "chloe123", 27, "female", "chloe@gmail.com", "male", "Spanish", "Amsterdam", "fashion", "swimming", "friendship"));
        users.add(new User("Lauren", "Bradley", "017", "lauren123", 28, "female", "lauren@gmail.com", "female", "Dutch", "Amsterdam", "cooking", "running", "friendship"));
        users.add(new User("Michael", "Roemer", "018", "michael123", 26, "male", "michael@gmail.com", "female", "German", "Amsterdam", "gaming", "running", "friendship"));
        users.add(new User("Leigh", "Whittaker", "019", "leigh123", 28, "male", "leigh@gmail.com", "male", "Italian", "Amsterdam", "traveling", "fitness", "friendship"));
        users.add(new User("Lara", "Dorren", "020", "lara123", 25, "female", "lara@gmail.com", "female", "Italian", "Amsterdam", "fashion", "running", "friendship"));
        users.add(new User("Diede", "Evers", "021", "diede123", 24, "female", "diede@gmail.com", "male", "Italian", "Amsterdam", "cooking", "swimming", "romance"));
        users.add(new User("Jane", "Doe", "001", "janeDoe123", 28, "female", "jane.doe@example.com", "female", "Dutch", "Amsterdam", "Gaming", "dancing", "romance"));
        
    }
  
    public static void main(String[] args) {
    	
    	//Read in user inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the BIM Connect App!");

        //Instantiate object for current user in this session - you need to log in with the following username: 686510 and password: 22222
        User currentUser = new User("Tymoteusz", "Nowak", "686510", "22222", 0, "male", "tymek@gmail.com", null, null, null, null, null, null);

        //Ask the user to log in: provide username and password
        System.out.println("Please provide your username: ");
        String usernameInput = input.nextLine();

        System.out.println("Please provide your password: ");
        String passwordInput = input.nextLine();
        
        //Validate username and password. If the credentials are wrong, the system will ask over and over again for correct ones
        while (!(usernameInput.equals(currentUser.getUserId()) && passwordInput.equals(currentUser.getPassword()))) {
            System.out.println("Error: the username and password do not match. Please try again.");
            System.out.println("Please provide your username: ");
            usernameInput = input.nextLine();

            System.out.println("Please provide your password: ");
            passwordInput = input.nextLine();
        }
        
        //If login is successful display message below
        System.out.println("Login successful. Welcome " + currentUser.getFullName() + "!"); 
        
        int ageInput = 0;
        
        //Ask user to input their age
        System.out.println("Your age is still missing. Please note that you should be 18 or older to be permitted to use this app. Please enter your age below:");
        ageInput = input.nextInt();
        input.nextLine(); 
        
        currentUser.setAge(ageInput);

        //Validate user's age. If user is  under 18, the program closes
        if (currentUser.getAge() < 18) {
            System.out.println("You are below the minimum required age to use this application. You will now exit the application.");
            System.out.println("Application is closed now.");
            input.close();
            return;
        }
        
        System.out.println("Welcome back to your Connect account!");
        System.out.println("Please see the main menu below.");
        
        // Invoke mainMenu() to display menu 
        mainMenu(input, currentUser);
        input.close();
        
    } //Here main method ends

    //Create main menu which displays 4 options
    public static void mainMenu(Scanner input, User currentUser) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("BIM Connect Menu");
        System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
        System.out.println("1. User Preferences");
        System.out.println("2. Matching");
        System.out.println("3. Instructions");
        System.out.println("4. Log Off");
        System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
        System.out.print("Please enter the number of your preferred action: ");


        // Invoke the method for each option selected by the user
        int choice = input.nextInt();
        input.nextLine();
        
        switch (choice) {
            case 1:
                userProfile(input, currentUser);
                break;
            case 2:
                matching(input, currentUser);
                break;
            case 3:
                instructions(input, currentUser);
                break;
            case 4:
                System.out.println("You have logged off.");
                input.close();
                break;
            default:
                System.out.println("Warning: Invalid input. Please make sure you choose an option from 1 to 4.");
                mainMenu(input, currentUser);
        	}
   
        } //Main menu ends here

    //Create user profile (case 1): read in inputs from user for each preference
    public static void userProfile(Scanner input, User currentUser) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("This is what we know about you so far: ");
        System.out.println("You are " + currentUser.getFullName() + ".");
        System.out.println("You identify as a " + currentUser.getGender() + ".");
        System.out.println("You are " + currentUser.getAge() + " years old.");
        System.out.println("Your e-mail address is " + currentUser.getEmail() + ".");
        System.out.println("Please enter your preferences to be able to match with other users.");
        System.out.println("-----------------------------------------------------------------------------");
        
        //Specify gender preference
        List<String> validGenders = Arrays.asList("female", "male", "non-binary");
        System.out.println("1. Gender: \nPlease only choose ONE preferred gender out of the following: Female, Male, Non-binary.");
        System.out.print("Input preferred gender (choose ONE option only): ");
        String preferredGenderInput = input.nextLine().trim().toLowerCase();
        
        //If the answer is not in the provided list, the system asks the user to enter over and over again until it is correct
        while (preferredGenderInput.split("\\s+").length > 1|| !validGenders.contains(preferredGenderInput)) {
            System.out.println("Warning: Invalid input. Please try again & make sure you only choose ONE gender from the provided list.");
            preferredGenderInput = input.nextLine().trim().toLowerCase();
        }
        currentUser.setPreferredGender(preferredGenderInput);

        //Specify nationality preference
        List<String> validNationalities = Arrays.asList("dutch", "german", "french", "italian", "spanish");
        System.out.println("2. Nationality: \nPlease only choose ONE nationality you are interested in connecting with from the following: Dutch, German, French, Italian, Spanish.");
        System.out.print("Input preferred nationality (choose ONE option only): ");
        String nationalityInput = input.nextLine().trim().toLowerCase();
        
        //If the answer is not in the provided list, the system will ask user to enter over & over again until it is correct
        while (nationalityInput.split("\\s+").length > 1|| !validNationalities.contains(nationalityInput)) {
            System.out.println("Warning: Invalid input. Please try again & make sure you only choose ONE nationality from the provided list.");
            nationalityInput = input.nextLine().trim().toLowerCase();
        }
        currentUser.setNationality(nationalityInput);

        //Specify city preference
        List<String> validCities = Arrays.asList("rotterdam", "amsterdam", "den haag");
        System.out.println("3. City: \nPlease only choose ONE city you will be connecting from the following: Rotterdam, Amsterdam, Den Haag.");
        System.out.print("Input the city you intend to connect in (choose ONE option only): ");
        String cityInput = input.nextLine().trim().toLowerCase();
        
        //If the answer is not in the provided list, the system will ask user to enter over & over again until it is correct
        while (!validCities.contains(cityInput)) {
            System.out.println("Warning: Invalid input. Please try again & make sure you only choose ONE city from the provided list.");
            cityInput = input.nextLine().trim().toLowerCase();
        }
        currentUser.setCity(cityInput);

        //Specify hobbies preference
        List<String> validHobbies = Arrays.asList("cooking", "fashion", "traveling", "movies", "gaming", "arts", "music");
        System.out.println("4. Hobbies: \nPlease only choose ONE hobby you want to share from the following: Cooking, Fashion, Traveling, Movies, Gaming, Arts, Music.");
        System.out.print("Input preferred hobby (choose ONE option only): ");
        String hobbyInput = input.nextLine().trim().toLowerCase();
       
        //If the answer is not in the provided list, the system will ask user to enter over & over again until it is correct
        while (hobbyInput.split("\\s+").length > 1 || !validHobbies.contains(hobbyInput)) {
        	System.out.println("Warning: Invalid input. Please try again & make sure you only choose ONE hobby from the provided list.");
        	hobbyInput = input.nextLine().toLowerCase();
        }
        currentUser.setHobby(hobbyInput);

        //Specify sports preference
        List<String> validSports = Arrays.asList("fitness", "football", "skiing", "dancing", "running", "hockey", "cycling", "swimming");
        System.out.println("5. Sports: \nPlease only choose ONE favourite sport from the following: Fitness, Football, Skiing, Dancing, Running, Hockey, Cycling, Swimming.");
        System.out.print("Input preferred sport (choose ONE option only): ");
        String sportsInput = input.nextLine().trim().toLowerCase();
         
        //If the answer is not in the provided list, the system will ask user to enter over & over again until it is correct
        while (sportsInput.split("\\s+").length > 1 ||!validSports.contains(sportsInput)) {
            System.out.println("Warning: Invalid input. Please try again & make sure you only choose ONE sport from the provided list.");
            sportsInput = input.nextLine().trim().toLowerCase();
        }
        currentUser.setSport(sportsInput);

        //Specify type of relationship preference
        List<String> validRelationshipTypes = Arrays.asList("romance", "friendship");
        System.out.println("6. Type of relationship: \nWhat are you looking for: Romance or Friendship?");
        System.out.print("Input preferred type of relationship (choose ONE option only): ");
        String relationshipInput = input.nextLine().trim().toLowerCase();
       
        //If the answer is not in the provided list, the system will ask user to enter over & over again until it is correct
        while (relationshipInput.split("\\s+").length > 1 ||!validRelationshipTypes.contains(relationshipInput)) {
            System.out.println("Warning: Invalid input. Please try again & make sure you only choose ONE type of relationship you are looking for.");
            relationshipInput = input.nextLine().trim().toLowerCase();
        }
        currentUser.setRelationshipType(relationshipInput);

        System.out.println("Preferences updated. Returning to the main menu...");
        mainMenu(input, currentUser);
    }

 //Create matching (case 2)
  //Calculate compatibility score between current user and users in the database
    //For every preference in common, the compatibility score will increase by 1 point
    public static int calculateCompatibilityScore(User currentUser, User potentialMatch) {
        int score = 0;

        if (currentUser.getGender().equals(potentialMatch.getPreferredGender()) 
        		&& potentialMatch.getGender().equals(currentUser.getPreferredGender())) {
            score++;
        }
        if (currentUser.getNationality().equalsIgnoreCase(potentialMatch.getNationality())) {
            score++;
        }
        if (currentUser.getCity().equalsIgnoreCase(potentialMatch.getCity())) {
            score++;
        }
        if (currentUser.getHobby().equalsIgnoreCase(potentialMatch.getHobby())) {
            score++;
        }
        if (currentUser.getSport().equalsIgnoreCase(potentialMatch.getSport())) {
            score++;
        }
        if (currentUser.getRelationshipType().equalsIgnoreCase(potentialMatch.getRelationshipType())) {
            score++;
        }

        return score;
    }
    
    //Match current user with users in the database based on the defined algorithm
    public static void matching(Scanner input, User currentUser) {

    	//Create an array list to store potential matches after screening through the database
        List<User> potentialMatches = new ArrayList<>();
        int compatibilityScore = 0;

        //Iterate through all users and calculate the matching score
        for (User user : users) {
            int score = 0;
            
            /*If user's gender in the database is exactly the same with current user's preferred gender
             AND if relationship type that these users are looking for are in common, the system will filter them
             then eliminate the others*/
            if ((user.getGender().equalsIgnoreCase(currentUser.getPreferredGender())) && 
            		(user.getRelationshipType().equalsIgnoreCase(currentUser.getRelationshipType()))) {
    
            /*After being filtered, if anyone has nationality matching the nationality selected by user,
            their score will increase by 1 point*/	
            if (user.getNationality().equalsIgnoreCase(currentUser.getNationality())) {
                score++;
            }

            /*Then, if anyone's location match the location selected by user,     
             their score will increase by 1 point*/
            if (user.getCity().equalsIgnoreCase(currentUser.getCity())) {
                score++;
            }

            /*Then, if anyone's hobby match the hobby selected by user,     
            their score will increase by 1 point*/
            if (user.getHobby().equalsIgnoreCase(currentUser.getHobby())) {
                score++;
            }

            /*Then, if anyone's favourite sport match the favourite sport selected by user,     
            their score will increase by 1 point*/
            if (user.getSport().equalsIgnoreCase(currentUser.getSport())) {
                score++;
            }

            //Finally, anyone that has a score above 2 will be added to the potentialMatches array list
            if (score >= 2) {
                potentialMatches.add(user);
            }
          } 
        }

        //Display the results
        if (!potentialMatches.isEmpty()) {
        	System.out.println("-----------------------------------------------------------------------------");
        	System.out.println("Your Potential Matches are:");
            int i = 1; // Initialize the counter
            for (User match : potentialMatches) {
            	compatibilityScore = calculateCompatibilityScore(currentUser, match); // Invoke calculateCompatibilityScore()
            	System.out.print(i + ". ");
            	
            	// Call overriding method to display the results
            	/* If there's a match (or more), the system will display their personal information
            	& the compatibility score*/
                match.displayInformation(); 
                // As we have 6 preferences, in order to convert to percentage, compabilityScore will be divided by 6 then multiply by 100
                // And because compabilityScore is integer initially, the division must be casted into double 
                System.out.printf("Compatibility Score: %.2f%%\n", ((double)compatibilityScore / 6) * 100); 
                i++;
            }
        } else {
            System.out.println("No potential matches found based on your preferences.");
        }

        //Allow the user to go back to the main menu
        mainMenu(input, currentUser);
    }
    
  //Create instruction (case 3): show user how to use the program
    public static void instructions(Scanner input, User currentUser) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Welcome to the BIM Connect App Instructions\n"
        		+ "\n"
        		+ "This app connects you with potential friends or romantic partners based on your preferences. Here's how to navigate the app:\n"
        		+ "\n"
        		+ "1. User Preferences: \nFirst, set your preferences. \nYou will be asked to select your preferred gender, nationality, city, hobbies, sports, and the type of relationship you are interested in. \nYour answers will help us match you with users who fit what you're looking for.\n"
        		+ "\n"
        		+ "2. Matching: \nOnce your preferences are set, choose the \"Matching\" option. \nThe app will then display a list of potential matches based on your preferences. \nFor each match, you will see their name, age, nationality, e-mail, and a compatibility score that indicates how well they match with your preferences.\n"
        		+ "Remember to set your preferences before selecting this option. Otherwise the application will show \"No potential matches found based on your preferences.\"\n"
        		+ "\n"
        		+ "3. Instructions: \nYou are here! \nIf you ever need to remind yourself of how the app works, you can revisit these instructions.\n"
        		+ "\n"
        		+ "4. Log Off: \nWhen you're done, you can log off safely.\n"
        		+ "\n"
        		+ "Remember: Communication and respect are key to forming meaningful connections. Happy matching!");
        
      //Allow the user to go back to the main menu
        mainMenu(input, currentUser);

    }
    
} //Driver class ends here

class Person { //This is the parent class
	
	//Declare variables
    private String firstName, lastName, email;
    private int age;

    //Define constructors
    public Person(String firstName, String lastName, int age, String email) {

    	this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    // Create method to display information
    public void displayInformation() {
        System.out.println("Name: " + getFullName() + "\n Age: " + getAge() + "\n Email: " + getEmail());
    }
 
 // Create getters & setters so that these private fields can be accessed outside this class
    public String getFullName() {
    	return firstName + " " + lastName;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    
} //Parent class ends here



class User extends Person { //The is the child class
    
	//Declare variables
	private String userId, password, gender, preferredGender, nationality, city, hobby, sport, relationshipType;
    
	//Define constructors
	public User(String firstName, String lastName, String userId, String password, int age, String gender, String email, 
    		String preferredGender, String nationality, String city, String hobby, String sport, String relationshipType) {
        
    	super(firstName, lastName, age, email);
    	this.userId = userId;
    	this.password = password;
    	this.gender = gender;
    	this.preferredGender = preferredGender;
    	this.nationality = nationality;
    	this.city = city;
    	this.hobby = hobby;
    	this.sport = sport;
    	this.relationshipType = relationshipType;
        
	}
	
	//Create getters & setters so that these private fields can be accessed outside this class

	public String getUserId() {
		return userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getPreferredGender() {
		return preferredGender;
	}
	
	public void setPreferredGender(String preferredGender) {
    	this.preferredGender = preferredGender;
    }
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
    	this.hobby = hobby;
    }

	
	public String getSport() {
		return sport;
	}
	
	public void setSport(String sport) {
    	this.sport = sport;
    }
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
    	this.nationality = nationality;
    }

	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
    	this.city = city;
    }

	
	public String getRelationshipType() {
		return relationshipType;
	}
	
	public void setRelationshipType(String relationshipType) {
    	this.relationshipType = relationshipType;
    }

	
	@Override
    public void displayInformation() {
		System.out.printf("%-20s\nAge: %-20d\nNationality: %-20s\nContact: %-20s\n", getFullName(), getAge(), getNationality(), getEmail());
	}
      
} //Child class ends here
