package com.codedotorg;

public class AppLogic {

    private String pin;
    private String user;

    public AppLogic() {
        pin = createRandomPin();
        user = "";
    }

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

    public boolean checkPinLength() {
        if (user.length() == 4) {
            return true;
        }
        
        return false;
    }

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
    
    public void resetLogic() {

    }

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
