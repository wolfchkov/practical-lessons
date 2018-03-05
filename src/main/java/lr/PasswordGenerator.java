package lr;

import java.util.Random;

public class PasswordGenerator {

    public static final int MIN_LENGTH = 8;
    public static final int MAX_LENGTH = 20;
    public static final String SYMBOL_GROUP = "!@#$%^&*";
    public static final String NUMBER_GROUP = "0123456789";
    public static final String LETTERS_GROUP = "asdfASDF";
    public static final int GROUPS_COUNT = 3;
    public static final int SYMBOL_GROUP_ID = 0;
    public static final int NUMBER_GROUP_ID = 1;
    public static final int LETTERS_GROUP_ID = 2;


    private final Random random;


    public PasswordGenerator() {
        random = new Random();
    }

    private char getRandomChar(String alphabet){
        int index = random.nextInt(alphabet.length());
        return alphabet.charAt(index);
    }

    public String generate(int length) {
        if(length < MIN_LENGTH || length > MAX_LENGTH) {
            return null;
        }
        StringBuilder password = new StringBuilder();

        boolean symNotExist = true;
        int count = 0;

        while (password.length() < length){

            char nextChar;
            int group = random.nextInt(GROUPS_COUNT);

            switch (group){
                case SYMBOL_GROUP_ID:
                    if (symNotExist){
                        nextChar = getRandomChar(SYMBOL_GROUP);
                        password.append(nextChar);
                        symNotExist = false;
                    }
                    break;
                case NUMBER_GROUP_ID:
                    if (count < 3){
                        nextChar = getRandomChar(NUMBER_GROUP);
                        if(password.length() == 0 ||
                                password.charAt(password.length() - 1) != nextChar){
                            password.append(nextChar);
                            count ++;
                        }
                    }
                    break;
                case LETTERS_GROUP_ID:
                    nextChar = getRandomChar(LETTERS_GROUP);
                    if(password.length() == 0 ||
                            password.charAt(password.length() - 1) != nextChar){
                        password.append(nextChar);
                    }
                    break;
            }


        }
        return password.toString();
    }

}
