package item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class AnnotationUtil {

    public static Annotation getAnnotation(AnnotatedElement element, String annotationClassName) {
        Class<?> annotationClass = null;
        try {
            annotationClass = Class.forName(annotationClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return element.getAnnotation(annotationClass.asSubclass(Annotation.class));
    }
}
