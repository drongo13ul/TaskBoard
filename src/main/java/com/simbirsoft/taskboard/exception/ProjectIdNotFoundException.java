package com.simbirsoft.taskboard.exception;

public class ProjectIdNotFoundException extends AppException {
    public ProjectIdNotFoundException(Long id) {super("Project with id: " + id + " not found.");}
}
