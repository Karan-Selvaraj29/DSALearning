// Product class
class User {
    // Required parameters
    private final String firstName;
    private final String lastName;

    // Optional parameters
    private final int age;
    private final String email;
    private final String phone;

    // Private constructor accessible only via the Builder
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Getters for demonstration
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    // Nested static Builder class
    public static class UserBuilder {
        // Required parameters
        private final String firstName;
        private final String lastName;

        // Optional parameters - initialized to default values
        private int age = 0;
        private String email = "";
        private String phone = "";

        // Constructor for required fields
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter methods for optional fields (returning builder itself)
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        // Build method to create the final User object
        public User build() {
            return new User(this);
        }
    }

    // For easy output
    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName +
                ", Age: " + age +
                ", Email: " + email +
                ", Phone: " + phone;
    }
}


public class BuilderPattern {
    public static void main(String[] args) {
        // Creating a user with only required fields
        User user1 = new User.UserBuilder("John", "Doe").email("johndoe@gmail.com")
                .build();

        // Creating a user with all fields
        User user2 = new User.UserBuilder("Alice", "Smith")
                .age(30)
                .email("alice@example.com")
                .phone("123-456-7890")
                .build();
        User user3=new User.UserBuilder("Jake","Haun").build();

        // Output the results
        System.out.println(user1.getEmail());
        System.out.println(user2);
        System.out.println(user3);
    }
}

