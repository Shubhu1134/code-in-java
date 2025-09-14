class InvalidNameException extends Exception {
    InvalidNameException(String msg) { super(msg); }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

 class Test {
    public static void main(String[] args) {
        String name = "";
        int age = 15;

        try {
            if(name.isEmpty()) throw new InvalidNameException("Name cannot be empty!");
            if(age < 18) throw new InvalidAgeException("Age must be 18+");
        } catch (InvalidNameException e) {
            System.out.println("Name Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());
        }
    }
}
