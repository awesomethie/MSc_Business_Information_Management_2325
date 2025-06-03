import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloFreshGenAIChatbot {

    private static JTextArea chatArea;
    private static JTextField userInputField;
    private static JButton sendButton;
    private static JScrollPane scrollPane;
    private static String userName;
    private static int userAge, userWeight, userHeight;
    private static String healthCondition, goal, dishStyle, restriction;
    
    private static List<String> meals = new ArrayList<>();
    private static Map<String, List<String>> categorizedMeals = new HashMap<>();
    
    // Light green color defined
    private static Color lightGreen = new Color(96, 159, 67);
    
    private static int step = 0;  // To track conversation steps

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BotLola");
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.WHITE);  // Set background color to white

        // Create the chat area with scroll pane
        chatArea = new JTextArea();
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Helvetica", Font.PLAIN, 14));
        chatArea.setBackground(Color.WHITE);
        chatArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Padding inside chat area

        scrollPane = new JScrollPane(chatArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());  // Remove border from scrollPane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Header (Bot logo and title)
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(lightGreen);  // Set to light green color
        headerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));  // Bottom border

        JLabel titleLabel = new JLabel("Chat by HelloFresh", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);  // White text for contrast against light green background

        headerPanel.add(titleLabel, BorderLayout.CENTER);

        // Create the user input field
        JPanel inputPanel = new JPanel(new BorderLayout());
        userInputField = new JTextField();
        userInputField.setFont(new Font("Helvetica", Font.PLAIN, 14));
        userInputField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));  // Add some padding

        // ActionListener for send button or Enter key
        ActionListener sendMessageAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = userInputField.getText();
                if (!userInput.isEmpty()) {
                    appendChat("User: " + userInput);
                    processInput(userInput);
                    userInputField.setText("");  // Clear the input field
                }
            }
        };

        // Create the send button
        sendButton = new JButton("Send");
        sendButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        sendButton.setBackground(lightGreen);  // Set button to light green color
        sendButton.setForeground(Color.WHITE);  // White text on the button
        sendButton.setFocusPainted(false);  // Remove button focus border
        sendButton.setPreferredSize(new Dimension(100, 40));

        sendButton.addActionListener(sendMessageAction);  // Same action as send button

        // Trigger action on pressing Enter key
        userInputField.addActionListener(sendMessageAction);

        inputPanel.add(userInputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Add everything to the frame
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        // Show the frame
        frame.setVisible(true);

        // Greet the user
        greetUser();
    }

    // Append text to the chat area
    private static void appendChat(String message) {
        chatArea.append(message + "\n");
        chatArea.setCaretPosition(chatArea.getDocument().getLength());  // Auto-scroll to the bottom
    }

    // Greet the user
    private static void greetUser() {
        appendChat("Lola: Hi! Welcome to the HelloFresh meal recommender system.");
        appendChat("Lola: Let's start by telling me your name.");
    }

    // Process user input
    private static void processInput(String input) {
        switch (step) {
            case 0:
                userName = input;
                appendChat("Lola: Nice to meet you, " + userName + "! How old are you?");
                step++;
                break;
            case 1:
                userAge = Integer.parseInt(input);
                appendChat("Lola: Got it! Now, what is your weight (in kg)?");
                step++;
                break;
            case 2:
                userWeight = Integer.parseInt(input);
                appendChat("Lola: And your height (in cm)?");
                step++;
                break;
            case 3:
                userHeight = Integer.parseInt(input);
                appendChat("Lola: Do you have any health conditions (e.g., diabetes, hypertension)? If none, type 'None'.");
                step++;
                break;
            case 4:
                healthCondition = input;
                appendChat("Lola: What are your fitness or health goals? (e.g., weight loss, muscle gain)? If none, type 'None'");
                step++;
                break;
            case 5:
                goal = input;
                appendChat("Lola: Great! What type of dishes do you prefer? (e.g., Italian, Asian, Mexican)? If none, type 'None'");
                step++;
                break;
            case 6:
                dishStyle = input;
                appendChat("Lola: Any dietary restrictions or allergies? (e.g., gluten-free, peanut allergy)? If none, type 'None'");
                step++;
                break;
            case 7:
                restriction = input;
                showMealRecommendations();
                step++;
                break;
            default:
                handleMealSelection(input);
                break;
        }
    }

    // Show meal recommendations based on user input
    private static void showMealRecommendations() {
        appendChat("Lola: Based on your inputs, here are some meal recommendations:");
        categorizeMeals();
        for (int i = 0; i < meals.size(); i++) {
            appendChat((i + 1) + ". " + meals.get(i));
        }
        appendChat("Lola: Please enter the number of the dish you'd like to select.");
    }

    // Categorize meals based on user's health condition, preferences, etc.
    private static void categorizeMeals() {
        meals.add("Bruschetta Chicken");
        meals.add("Lemon Tortellini Palermo");
        meals.add("Penne Limone with Chicken");
        meals.add("Juicy Lucy Burgers");
        meals.add("Firecracker Meatballs");
        meals.add("Chickpea-Powered Mediterranean Couscous");
        meals.add("Pork and Veggie Bibimbap");
        meals.add("Lemony Spaghetti with Brussels Sprouts");
        meals.add("Caramelized Onion Meatloaf Sandwich");
        meals.add("Warm Buttered Shrimp Rolls");
        meals.add("Sun-Dried Tomato Spaghetti");
        meals.add("Cheesy Smothered Mushroom Chicken");
        meals.add("Southwestern Beef Tacos");
        meals.add("Coconut Curry Chicken");
        meals.add("Hoisin-Glazed Pork Tenderloin");
        meals.add("Creamy Dill Pork Tenderloin");
        meals.add("Honey-Garlic Chicken Breast Wraps");
        meals.add("Sesame Soy Maple Chicken");
        meals.add("Seed-Crusted Chicken");
        meals.add("Mozzarella & Herb Chicken");
        meals.add("Hot Honey Brussels & Ricotta Flatbreads");
        meals.add("Miso-Sesame Shrimp & Bacon Ramen");

        // Remove high-carb or sugary dishes for diabetic users
        if (healthCondition.equalsIgnoreCase("diabetes")) {
            meals.removeIf(meal -> meal.contains("Pasta") || meal.contains("Spaghetti") || meal.contains("Tortellini")|| meal.contains("Burger"));
            appendChat("Lola: Since you mentioned diabetes, I have excluded high-carb dishes from the recommendations.");
        }
    }

 // Handle meal selection or custom input by the user
    private static void handleMealSelection(String input) {
        input = input.toLowerCase();

        // Check if user is asking for a hamburger recommendation
        if (input.contains("hamburger") || input.contains("burger")) {
            String recommendedMeal = "Juicy Lucy Burgers";
            appendChat("Lola: I recommend the " + recommendedMeal + ".");
            if (healthCondition.equalsIgnoreCase("diabetes")) {
                appendChat("Lola: Warning! This dish is high in carbohydrates and may increase your sugar level.");
            }
            appendChat("Lola: Do you still want to proceed with this meal? Type 'yes' to confirm or 'no' to cancel.");
            step = 8;  // Set step to ask for confirmation
        } 
        // Handle user confirmation
        else if (step == 8) {
            if (input.equals("yes")) {
                appendChat("Lola: You have selected your meal.");
                // Additional logic for proceeding with the meal
            } else if (input.equals("no")) {
                appendChat("Lola: Okay, let's try finding another meal.");
            } else {
                appendChat("Lola: Please type 'yes' to confirm or 'no' to cancel.");
            }
        } 
        // Standard meal selection by number
        else {
            try {
                int selectedIndex = Integer.parseInt(input) - 1;
                if (selectedIndex >= 0 && selectedIndex < meals.size()) {
                    String selectedMeal = meals.get(selectedIndex);
                    appendChat("Lola: You selected " + selectedMeal + ".");
                    if (healthCondition.equalsIgnoreCase("diabetes") && selectedMeal.contains("Pasta")) {
                        appendChat("Lola: Warning! This dish is high in carbohydrates and may increase your sugar level.");
                    }
                } else {
                    appendChat("Lola: Invalid selection. Please choose a number from the list.");
                }
            } catch (NumberFormatException e) {
                appendChat("Lola: Please enter a valid number.");
            }
        }
    }
}