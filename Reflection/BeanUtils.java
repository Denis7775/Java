package Reflection;


import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class BeanUtils {
    public static void assign(Object from, Object to){
        Class fromClass = from.getClass();
        Class toClass = to.getClass();

        Method[] methodsFrom = fromClass.getMethods();
        Method[] methodsTo = toClass.getMethods();

        Map<String, Method> getters = new HashMap<>();
        List<Method> setters = new ArrayList<>();

        for (Method methodF : methodsFrom){
            if(isGetter(methodF))
                getters.put(methodF.getName().substring(3), methodF);
        }

        for (Method methodT : methodsTo){
            if (isSetter(methodT))
                setters.add(methodT);
        }

        for (Method setter : setters){
            String nameOfSetter = setter.getName().substring(3);
            if (getters.get(nameOfSetter) != null && getters.get(nameOfSetter).getReturnType().equals(setter.getParameterTypes()[0])) {
                try {
                    setter.invoke(to, getters.get(nameOfSetter).invoke(from));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static boolean isGetter(Method method){
        if (!method.getName().startsWith("get"))
            return false;
        if (method.getParameterTypes().length != 0)
            return false;
        return true;
    }

    public static boolean isSetter(Method method){
        if (!method.getName().startsWith("set"))
            return false;
        if (method.getParameterTypes().length != 1)
            return false;
        return true;
    }
}
