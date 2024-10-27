public class name {
    private String lastName;
    private String firstName;
    private String middleName;

    public name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(middleName);
        }
        return sb.toString();
    }
}
