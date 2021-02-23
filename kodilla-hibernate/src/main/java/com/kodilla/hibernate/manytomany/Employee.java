package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedQueries({
        @NamedQuery(
                name = "Employee.getEmployeeBySurname",
                query = "from Employee where lastname = :lastname"
        )
})
@Entity
@Table(name = "employees")
public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Employee() {

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "employee_id", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "join_company_employee",
            joinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "company_id")}
    )
    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
