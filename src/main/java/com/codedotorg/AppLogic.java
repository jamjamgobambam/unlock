package com.codedotorg;

public class AppLogic {

    /** The pin to unlock the app */
    private String pin;

    /** The pin the user has provided */
    private String user;

    /**
     * Constructor for the AppLogic class.
     * Initializes the pin with a random value and user with an empty string.
     */
    public AppLogic() {
        pin = createRandomPin();
        user = "";
    }

    /**
     * Creates a user PIN based on the predicted class.
     * @param predictedClass the predicted class from the machine learning model
     * @return the user PIN as a string
     */
    public String createUserPin(String predictedClass) {
        String userResponse = predictedClass.substring(predictedClass.indexOf(" ") + 1);

        if (!checkPinLength()) {
            if (userResponse.equals("one")) {
                user += 1;
            }
            else if (userResponse.equals("two")) {
                user += 2;
            }
            else if (userResponse.equals("three")) {
                user += 3;
            }
            else if (userResponse.equals("four")) {
                user += 4;
            }
            else if (userResponse.equals("five")) {
                user += 5;
            }
            else if (userResponse.equals("six")) {
                user += 6;
            }
            else if (userResponse.equals("seven")) {
                user += 7;
            }
            else if (userResponse.equals("eight")) {
                user += 8;
            }
            else if (userResponse.equals("nine")) {
                user += 9;
            }
            else {
                user += "";
            }
        }

        return user;
    }

    /**
     * Checks if the length of the user's PIN is equal to 4.
     * @return true if the length of the user's PIN is equal to 4, false otherwise.
     */
    public boolean checkPinLength() {
        if (user.length() == 4) {
            return true;
        }
        
        return false;
    }

    /**
     * Returns the status of the user's input PIN.
     * @param userPin the PIN entered by the user
     * @return a string indicating whether the PIN is correct or not
     */
    public String getPinStatus(String userPin) {
        if (checkPinLength()) {
            if (userPin.equals(pin)) {
                return userPin + " is correct!";
            }
            else {
                return "Sorry, " + userPin + " is not correct.";
            }
        }

        return "";
    }
    
    /**
     * Resets the logic of the application by generating
     * a new random PIN and clearing the user field.
     */
    public void resetLogic() {
        pin = createRandomPin();
        user = "";
    }

    /**
     * Generates a random 4-digit PIN number.
     * @return the generated PIN number as a string.
     */
    private String createRandomPin() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String result = "";
        
        for (int count = 0; count < 4; count++) {
            int randomIndex = (int)(Math.random() * numbers.length);
            result += numbers[randomIndex];
        }

        return result;
    }

}
