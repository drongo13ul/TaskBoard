package com.simbirsoft.taskboard.exception;

public class BoardIdNotFoundException extends AppException {
    public BoardIdNotFoundException(Long id) {super("Boards with id: " + id + " not found.");}
}