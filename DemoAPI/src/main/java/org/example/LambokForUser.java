package org.example;
import lombok.Data;

@Data
public class LambokForUser {

        private String name;
        private String job;
        private int id;
        private String firstName;
        private String lastName;

        // Constructors, getters, and setters

        // Default constructor
        public LambokForUser() {
        }

        // Constructor for users with "name", "job", and "id" fields
        public LambokForUser(String name, String job, int id) {
            this.name = name;
            this.job = job;
            this.id = id;
        }

        // Constructor for users with "firstName", "lastName", and "id" fields
//        public LambokForUser(String firstName, String lastName, int id) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.id = id;
//        }

        // Getters and setters for all fields

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
