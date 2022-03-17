package ru.netology.novser;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
