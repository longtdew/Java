package enitity;

public class Human {
        private String fullName;
        private String address;
        private String phoneNumber;

        public Human(String fullName, String address, String phoneNumber) {
            this.fullName = fullName;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

    public Human(String fullName, String address, String phoneNumber, int employeeCode, String contractSigningDate) {

    }

    public String getFullName() {
            return fullName;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
}
