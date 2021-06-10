package ex25;

public class Password {
    String password;

    public boolean very_weak() {
        boolean only_num = false;
        int length = password.length();

        try {

        }
        catch (Exception e) {
            only_num = false;
        }

        return length < 8 && only_num;
    }

    public boolean weak() {
        return false;
    }

    public boolean strong() {
        return false;
    }

    public boolean very_strong() {
        return false;
    }

    public boolean passwordValidator() {
        return false;
    }

}

