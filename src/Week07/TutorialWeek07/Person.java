package Week07.TutorialWeek07;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

class SortPersonByNameAgeAsc implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int m1 = Integer.parseInt(p1.getDateOfBirth().split("-")[0]);
        int m2 = Integer.parseInt(p2.getDateOfBirth().split("-")[0]);

        int age1 = calculateAge(p1.getDateOfBirth());
        int age2 = calculateAge(p2.getDateOfBirth());
        if (age2 == age1) {
            if (m1 < m2) {
                return -1;
            }
        };

        return Integer.compare(age2, age1);
    }

    public int calculateAge(String date) {
        String[] dateArr = date.split("-");
        int[] dateIntArr = new int[3];
        for (int i = 0; i < dateArr.length; i++) {
            dateIntArr[i] = Integer.parseInt(dateArr[i]);
        }
        LocalDate birth = LocalDate.of(dateIntArr[2], dateIntArr[1], dateIntArr[0]);
        LocalDate currentDate = LocalDate.now();

        return Period.between(birth, currentDate).getYears();
    }
}

public class Person {
    //Attributes
    private int id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;

    //Constructors
    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String email, String tel, String address) throws Exception {
        validateId(id);
        validateName(name);
        validateDateOfBirth(dateOfBirth);
        validateEmail(email);
        validatePhoneNumber(tel);
        validateAddress(address);
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    //Getter Method
    public int getId() {
        return this.id;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    //Validator
    private void validateId(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Invalid ID");
        }
    }

    private void validateName(String name) throws Exception {
        Pattern regex = Pattern.compile("[0-9]");

        if (name == null || name.isEmpty() || regex.matcher(name).find()) {
            throw new Exception("Invalid Name");
        }
    }

    private void validateEmail(String email) throws Exception {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern regex = Pattern.compile(emailRegex);

        if (email == null || email.isEmpty() || !regex.matcher(email).matches()) {
            throw new Exception("Invalid Email");
        }
    }

    private void validatePhoneNumber(String tel) throws Exception {
        String phoneRegex = "(03|05|07|08|09|01[2|6|8|9])" + "([0-9]{8})";

        Pattern regex = Pattern.compile(phoneRegex);

        if (tel == null || tel.isEmpty() || !regex.matcher(tel).matches()) {
            throw new Exception("Invalid Phone Number");
        }
    }

    private void validateAddress(String address) throws Exception {
        Pattern regex = Pattern.compile("\"[^a-zA-Z0-9 ]\"");

        if (address == null || address.isEmpty() || regex.matcher(address).find()) {
            throw new Exception("Invalid Address");
        }
    }

    private void validateDateOfBirth(String dateOfBirth) throws Exception {
        int currentYear = LocalDate.now().getYear();
        String[] dateArr = dateOfBirth.split("-");
        if (Integer.parseInt(dateArr[2]) > currentYear) {
            throw new Exception("Invalid Date of Birth");
        }
        Pattern regex = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$");

        if (dateOfBirth.isEmpty() | !regex.matcher(dateOfBirth).matches()) {
            throw new Exception("Invalid Date of Birth");
        }
    }

    public String toString() {
        return String.format("Person [id=%d, name=%s, dateOfBirth=%s, email=%s, tel=%s, address=%s]", this.id, this.name, this.dateOfBirth, this.email, this.tel, this.address);
    }
}
