package models;

import be.objectify.deadbolt.java.models.Permission;
import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Maria on 25/04/2017.
 */
@Entity
public class UserPermission extends Model implements Permission
{
    @Id
    public Long id;

    @Column(name = "permission_value")
    public String value;

    public static final Finder<Long, UserPermission> find = new Finder<>(Long.class,
            UserPermission.class);

    public String getValue()
    {
        return value;
    }

    public static UserPermission findByValue(String value)
    {
        return find.where()
                .eq("value",
                        value)
                .findUnique();
    }
}
