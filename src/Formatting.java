
import Validation.Validation;

import java.lang.annotation.Annotation;

public class Formatting {
     public static void title(String title) {
         Validation.isNotNullString(title, "Title cannot be Null!");
         Validation.isNotEmptyString(title, "Title cannot be Empty!");
         System.out.println("---------------------------");
         System.out.println(title);
         System.out.println("---------------------------");
    }

    public static void dividingLine() {
        System.out.println("---------------------------");
    }
}
