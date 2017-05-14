package actions;


import be.objectify.deadbolt.java.actions.Restrict;
import play.mvc.With;

import java.lang.annotation.*;

/**
 * Created by Maria on 25/04/2017.
 */
@With(CustomRestrictAction.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@Inherited
public @interface CustomRestrict
{
    RoleGroup[] value();

    Restrict config();
}
