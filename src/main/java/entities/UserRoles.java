package entities;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Created by linhtran on 14/07/17.
 */
@Entity
@Table(name = "user_roles")
public class UserRoles implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Basic
    @Column(name = "role")
    private  String role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private  User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String getAuthority() {
        return this.getRole();
    }
}
