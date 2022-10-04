package ru.minusd.denisov.lab06.task13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActionManager {
    Map<StringBuilderAction, ArrayList<ActionListener>> listeners = new HashMap<>();
    
    public ActionManager(StringBuilderAction... actions) {
        for (StringBuilderAction action : actions) {
            listeners.put(action, new ArrayList<>());
        }
    }

    public void addActionListener(StringBuilderAction action, ActionListener listener) {
        listeners.get(action).add(listener);
    }

    public void removeActionListener(StringBuilderAction action, ActionListener listener) {
        listeners.get(action).remove(listener);
    }

    public void notifyActionListeners(StringBuilderAction action) {
        for (ActionListener listener : listeners.get(action)) {
            listener.actionPerformed();
        }
    }
}
