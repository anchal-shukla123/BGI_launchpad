package com.bgi.launchpad.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Column(unique = true)
    private String email;

    private String role; // STUDENT, FACULTY, HOD

    @Column(name = "department_id")
    private Long departmentId;

    // Constructors
    public User() {}

    public User(String name, String email, String role, Long departmentId) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.departmentId = departmentId;
    }

    // Getters & Setters
    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }
    
    public String getEmail() { 
        return email; 
    }
    
    public void setEmail(String email) { 
        this.email = email; 
    }

    public Long getDepartmentId() { 
        return departmentId; 
    }
    
    public void setDepartmentId(Long departmentId) { 
        this.departmentId = departmentId; 
    }

    public String getRole() { 
        return role; 
    }
    
    public void setRole(String role) { 
        this.role = role; 
    }
}