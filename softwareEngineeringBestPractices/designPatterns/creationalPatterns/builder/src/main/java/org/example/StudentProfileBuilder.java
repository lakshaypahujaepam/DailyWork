package org.example;

public class StudentProfileBuilder {

    private final String name;
    private final byte age;
    private final String email;
    private final String phone;
    private final String address;

    private StudentProfileBuilder(ProfileBuilder profileBuilder) {
        this.name = profileBuilder.name;
        this.age = profileBuilder.age;
        this.email = profileBuilder.email;
        this.phone = profileBuilder.phone;
        this.address = profileBuilder.address;
    }

    public static class ProfileBuilder {
        private String name;
        private byte age;
        private String email;
        private String phone;
        private String address;

        public ProfileBuilder(String name, byte age) {
            this.name = name;
            this.age = age;
        }

        public ProfileBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ProfileBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public ProfileBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentProfileBuilder build() {
            if(name == null || name.isEmpty()) {
                throw new IllegalArgumentException("invalid name.");
            }
            if(age <= 0 ) {
                throw new IllegalArgumentException("invalid age.");
            }
            return new StudentProfileBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "StudentProfileBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
