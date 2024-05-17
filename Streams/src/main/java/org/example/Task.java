package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Task {
    public String name; // название задачи

    public int idWorker; // айди исполнителя
    public int hours; //время в часах, выделенное на исполнение задачи (>=1 &&<= 16)
    public boolean status; //статус задачи (false, если задача выполнена)

    public static final String TITLE_OF_TASK_TABLE = "tasks.xlsx";

    public Task(String name, int time) {
        this.hours = time;
        this.status = true;
        this.name = name;
    }
    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public void complete() {
        status = false;
    }


}