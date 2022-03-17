package ru.netology.novser;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
