package net.javaprogman.clearing;

import java.util.Map;

public interface Settlement {

    public void transferTo(Map<String, Map<String, Integer>> transfer);

}
