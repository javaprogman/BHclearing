package net.javaprogman.clearing;

import java.util.Map;
// это еще более глобальная задумка, но руки пока не дошли.
public interface Settlement {

    public void transferTo(Map<String, Map<String, Integer>> transfer);

}
